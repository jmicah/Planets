package model;

import java.util.Map;

public interface IonStorm {

	/**
	 * The strength of the storm determines if it affects
	 * ships, mines, etc.
	 * @param - The strength of the storm.
	 */
	public void setStrength(StormStrength strength);
	
	/**
	 * @return - An Enum of the strength
	 */
	public StormStrength getStrength();
	
	/**
	 * The heading determines which direction the storm moves.
	 * @param	x - The x coordinate
	 * 			y - The y coordinate
	 */
	public void setHeading(Long x, Long y);
	
	/**
	 * @return - A map of the heading coordinates.
	 */
	public Map<String, Long> getHeading();
	
	/**
	 * The current location of the storm.
	 * @param	x - The x coordinate
	 * 			y - The y coordinate
	 */
	public void setCoordinates(Long x, Long y);
	
	/**
	 * @return - A map of the planet coordinates.
	 */
	public Map<String, Long> getCoordinates();
	
	/**
	 * Set the radius of the storm.
	 * @param radius - In light years.
	 */
	public void setRadius(Long radius);
	
	/**
	 * 
	 * @return - The radius of the storm in light years.
	 */
	public Long getRadius();
	
	/**
	 * Set the status of the storm (Growing, Shrinking, etc)
	 * @param status
	 */
	public void setStatus(StormStatus status);
	
	/**
	 * 
	 * @return - The status of the storm.
	 */
	public StormStatus getStatus();
}
