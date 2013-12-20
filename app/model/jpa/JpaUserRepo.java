package model.jpa;

import java.util.List;

import model.User;
import model.UserRepo;

public class JpaUserRepo implements UserRepo {

	@Override
	public User createUser(String firstName, String lastName, String email) {
		return new JpaUser(firstName, lastName, email);
	}

	@Override
	public User findUser(Long id) {
		return (User) JpaUser.findById(id);
	}

	@Override
	public User findUserByEmail(String email) {
		return JpaUser.find("email = (?1)", email).first();
	}

	@Override
	public List<User> findAll() {
		return (List) JpaUser.findAll();
	}

}
