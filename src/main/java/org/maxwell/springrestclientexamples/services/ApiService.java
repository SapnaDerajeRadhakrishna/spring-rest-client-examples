package org.maxwell.springrestclientexamples.services;

import java.util.List;

import org.maxwell.springrestclientexamples.api.domain.User;

public interface ApiService {
	List<User> getUsers(Integer limit);
}
