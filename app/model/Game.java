package model;

import java.util.List;

public interface Game extends AbstractModel {

	/**
	 * 
	 * @return - The owner of the game.
	 */
	public User getOwner();
	
	/**
	 * @return - A list of players.
	 */
	public List<Player> getPlayers();
	
	/**
	 * @param - The player to be added.
	 */
	public void addPlayer(Player player);
	
	/**
	 * 
	 * @param height - The map height in light years.
	 */
	public void setMapHeight(int height);
	
	/**
	 * 
	 * @return - The map height in light years.
	 */
	public int getMapHeight();
	
	/**
	 * 
	 * @param width - The map width in light years.
	 */
	public void setMapWidth(int width);
	
	/**
	 * 
	 * @return - The map width in light years.
	 */
	public int getMapWidth();
	
	/**
	 * 
	 * @return - A list of all planets in this game.
	 */
	public List<Planet> getPlanets();
	
	/**
	 * @param planet - The planet to be added to the game.
	 */
	public void addPlanet(Planet planet);
	
	/**
	 * @param name - The name of the planet to find.
	 * @return - The planet or null.
	 */
	public Planet findPlanetByName(String name);
	
	/**
	 * 
	 * @return - A list of all ships in this game.
	 */
	public List<Ship> getShips();
	
	/**
	 * 
	 * @param ship - The ship to be added to the game.
	 */
	public void addShip(Ship ship);
	
	/**
	 * 
	 * @return - A list of all mines in this game.
	 */
	public List<MineField> getMines();
	
	/**
	 * 
	 * @param minefield - The minefield to be added to the game.
	 */
	public void addMineField(MineField minefield);
	
	/**
	 * 
	 * @return -  A list of all storms in this game.
	 */
	public List<IonStorm> getStorms();
	
	/**
	 * 
	 * @param storm - The Ion Storm to be added to the game.
	 */
	public void addStorm(IonStorm storm);
	
	/**
	 * 
	 * @param planetLimit - The total number of planets in this game.
	 */
	public void setPlanetLimit(int planetLimit);
	
	/**
	 * 
	 * @return -  The total number of planets in the game.
	 */
	public int getPlanetLimit();
	
	/**
	 * 
	 * @param shipLimit - The number of allowed ships in this game.
	 */
	public void setShipLimit(int shipLimit);
	
	/**
	 * 
	 * @return - The number of allowed ships in this game.
	 */
	public int getShipLimit();
}
