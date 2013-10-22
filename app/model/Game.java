package model;

import java.util.List;

public interface Game extends AbstractModel {

	/**
	 * 
	 * @return - The owner of the game.
	 */
	public User getOwner();
	
	/**
	 * 
	 * @param height - The map height in light years.
	 */
	public void setMapHeight(Long height);
	
	/**
	 * 
	 * @return - The map height in light years.
	 */
	public Long getMapHeight();
	
	/**
	 * 
	 * @param width - The map width in light years.
	 */
	public void setMapWidth(Long width);
	
	/**
	 * 
	 * @return - The map width in light years.
	 */
	public Long getMapWidth();
	
	/**
	 * 
	 * @return - A list of all planets in this game.
	 */
	public List<Planet> getPlanets();
	
	/**
	 * 
	 * @return - A list of all ships in this game.
	 */
	public List<Ship> getShips();
	
	/**
	 * 
	 * @return - A list of all mines in this game.
	 */
	public List<MineField> getMines();
	
	/**
	 * 
	 * @return -  A list of all storms in this game.
	 */
	public List<IonStorm> getStorms();
	
	/**
	 * 
	 * @param planetLimit - The total number of planets in this game.
	 */
	public void setPlanetLimit(Long planetLimit);
	
	/**
	 * 
	 * @return -  The total number of planets in the game.
	 */
	public Long getPlanetLimit();
	
	/**
	 * 
	 * @param shipLimit - The number of allowed ships in this game.
	 */
	public void setShipLimit(Long shipLimit);
	
	/**
	 * 
	 * @return - The number of allowed ships in this game.
	 */
	public Long getShipLimit();
}
