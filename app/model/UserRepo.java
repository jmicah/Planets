package model;

import java.util.List;

public interface UserRepo {

	public User createUser(String firstName, String lastName, String email);
	
	public User findUser(Long id);
	
	public User findUserByEmail(String email);
	
	public List<User> findAll();
	
}
