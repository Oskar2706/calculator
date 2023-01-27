package service;

import entity.User;
import storage.InMemoryUserStorage;

import java.util.Optional;

/**
 * @author Simon Pirko on 17.01.23
 */
public class UserService {

	private final InMemoryUserStorage storage = new InMemoryUserStorage();

	public void create(User user) {
		storage.save(user);
	}

	public Optional<User> findByUsername(String username) {
		return storage.getByUsername(username);
	}
}
