package model;

/**
 * The User contains the personal registered information about a person
 * playing the game. They can be associated with many Player objects but 
 * only one Player per Game.
 * 
 * @author Micah Cooper
 *
 */
public interface User {

	/**
	 * Set the user's email. It must be unique.
	 * 
	 * @param email
	 */
	public void setEmail(String email);
	
	/**
	 * 
	 * @return - The user's email.
	 */
	public String getEmail();
	
	/**
	 * Set the user's first name.
	 * 
	 * @param firstName - The first name of the user.
	 */
	public void setFirstName(String firstName);
	
	/**
	 * 
	 * @return - The user's first name.
	 */
	public String getFirstName();
	
	/**
	 * Set the user's last name.
	 * 
	 * @param lastName - The last name of the user.
	 */
	public void setLastName(String lastName);
	
	/**
	 * 
	 * @return - The user's last name.
	 */
	public String getLastName();
	
}
