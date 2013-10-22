package model;

public interface Player extends AbstractModel {

	/**
	 * Set the user account of this player.
	 * 
	 * @param user
	 */
	public void setUser(User user);
	
	/**
	 * 
	 * @return - The user account of this player.
	 */
	public User getUser();
	
	/**
	 * Set the race associated with this player.
	 * 
	 * @param raceType
	 */
	public void setRaceType(RaceType raceType);
	
	/**
	 * 
	 * @return -  The players race.
	 */
	public RaceType getRaceType();
	
}
