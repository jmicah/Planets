package model;

import java.util.Map;

public interface MineField extends AbstractModel {

	/**
	 * Set the radius of the mine field.
	 * @param radius - In light years.
	 */
	public void setRadius(Long radius);
	
	/**
	 * 
	 * @return - The radius of the mine field.
	 */
	public Long getRadius();
	
	/**
	 * Set the owner of the mine field.
	 * @param player
	 */
	public void setOwner(Player player);
	
	/**
	 * 
	 * @return - The owner of the mine field.
	 */
	public Player getOwner();
	
	/**
	 * 
	 * @return - If the mine field is a web mine or not.
	 */
	public Boolean isWebMine();
	
	/**
	 * The coordinates of the mine field from the center.
	 * @param x
	 * @param y
	 */
	public void setCoordinates(Long x, Long y);
	
	/**
	 * 
	 * @return - A map of the coordinates of the mine field.
	 */
	public Map<String, Long> getCoordinates();
	
}
