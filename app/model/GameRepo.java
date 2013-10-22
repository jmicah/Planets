package model;

import java.util.List;

public interface GameRepo {

	/**
	 * 
	 * @param user - The owner of the game.
	 * @return - The game object.
	 */
	public Game createGame(User user);

	/**
	 * 
	 * @param id - The id of the game.
	 * @return - The game object.
	 */
	public Game findGame(Long id);
	
	/**
	 * 
	 * @return - A list of all games.
	 */
	public List<Game> findAll();
	
	/**
	 * 
	 * @param user - A registered user
	 * @return - A list of all games played by the user.
	 */
	public List<Game> findAll(User user);
	
	/**
	 * 
	 * @return -  A list of all active games.
	 */
	public List<Game> findActiveGames();
	
	/**
	 * 
	 * @param user - A registered user.
	 * @return - A list of all active games played by the user.
	 */
	public List<Game> findActiveGames(User user);
	
	/**
	 * 
	 * @return - A list of all closed games.
	 */
	public List<Game> findClosedGames();
	
	/**
	 * 
	 * @param user - A registered user.
	 * @return - A list of all closed games played by the user.
	 */
	public List<Game> findClosedGames(User user);
	
	/**
	 * 
	 * @param user -  A registered user.
	 * @return -  A list of all games created by the user.
	 */
	public List<Game> findByOwner(User user);	
}
