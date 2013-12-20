package model.jpa;

import javax.persistence.Entity;
import javax.persistence.Table;

import model.AbstractModel;
import model.User;

@Entity
@Table(name = "user")
public class JpaUser extends JpaAbstractModel<JpaUser> implements User {

	String firstName;
	String lastName;
	String email;
	
	protected JpaUser(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

}
