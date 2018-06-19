package org.maxwell.springrestclientexamples.services;

import java.util.List;

import org.maxwell.springrestclientexamples.api.domain.User;
import org.maxwell.springrestclientexamples.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService{
	
	private RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

	@Override
	public List<User> getUsers(Integer limit) {
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
        return userData.getData();
	}

}
