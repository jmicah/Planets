package model;

import java.util.Map;


public interface Planet extends AbstractModel {

	/* GENERAL SETTINGS */
	
	/**
	 * Set the name of the planet.
	 * @param name - The name of the planet.
	 */
	public void setName(String name);
	
	/**
	 * Get the name of the planet.
	 * @return - A String containing the name of the planet.	
	 */
	public String getName();
	
	/**
	 * Set the temperature of the planet ranging 0-100
	 * @param temp - The new temperature of the planet.
	 */
	public void setTemp(Integer temp);
	
	/**
	 * Get the temperature of the planet.
	 * @return - The temperature as an Integer. (0-100)
	 */
	public Integer getTemp();
	
	/**
	 * An x,y coordinate of the planet.
	 * @param 	x - The x coordinate
	 * 			y - The y coordinate
	 */
	public void setCoordinates(Integer x, Integer y);
	
	/**
	 * Get the coordinates of the planet.
	 * @return - A map of the coordinates (x, y)
	 */
	public Map<String, Integer> getCoordinates();
	
	/* NATIVE INFO */
	
	/**
	 * Set the type of natives on the planet.
	 * @param natives - The natives from a Enum.
	 */
	public void setNatives(Native natives);
	
	/**
	 * Get the type of natives on the planet.
	 * @return - The natives on the planet.
	 */
	public Native getNatives();
	
	/**
	 * Set the amount of natives living on the planet.
	 * @param amount - The total number of natives.
	 */
	public void setNativesPopulation(Integer amount);
	
	/**
	 * Get the amount of natives on the planet.
	 * @return - The number of natives on the planet.
	 */
	public Integer getNativesPopulation();
	
	/**
	 * Set the rate at which to tax the natives.
	 * @param rate - The tax rate between 0 and 100.
	 */
	public void setNativesTaxRate(Integer rate);
	
	/**
	 * Get the rate at which the natives are being taxed.
	 * @return - The tax rate. (0-100)
	 */
	public Integer getNativesTaxRate();
	
	/**
	 * Set the happiness off the natives.
	 * @param amount - The happiness of the natives between -100 and 100.
	 */
	public void setNativesHappiness(Integer amount);
	
	/**
	 * Get the happiness of the natives.
	 * @return - The happiness of the natives (-100-100)
	 */
	public void getNativesHappiness();
	
	/* RESOURCE INFO */
	
	/*TRITANIUM*/
	/**
	 * Set the amount of Tritanium on the surface of the planet.
	 * @param amount - The amount of Tritanium on the surface.
	 */
	public void setTritaniumOnSurface(Integer amount);
	
	/**
	 * Get the amount of Tritanium on the surface of the planet.
	 * @return - The amount of Tritanium on the surface.
	 */
	public Integer getTritaniumOnSurface();
	
	/**
	 * Set the amount of Tritanium in the ground.
	 * @param amount - The amount of Tritanium in the ground.
	 */
	public void setTritaniumInGround(Integer amount);
	
	/**
	 * Get the amount of Tritanium in the ground.
	 * @return - The amount of Tritanium in the ground.
	 */
	public Integer getTritaniumInGround();
	
	/**
	 * The rate at which Tritanium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setTritaniumRate(Integer rate);
	
	/**
	 * The rate at which Tritanium in mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getTritaniumRate();
	
	
	/*DURANIUM*/
	/**
	 * Set the amount of Duranium on the surface of the planet.
	 * @param amount - The amount of Duranium on the surface.
	 */
	public void setDuraniumOnSurface(Integer amount);
	
	/**
	 * Get the amount of Duranium on the surface of the planet.
	 * @return - The amount of Duranium on the surface.
	 */
	public Integer getDuraniumOnSurface();
	
	/**
	 * Set the amount of Duranium in the ground of the planet.
	 * @param amount - The amount of Duranium in the ground.
	 */
	public void setDuraniumInGround(Integer amount);
	
	/**
	 * Get the amount of Duranium in the ground of the planet.
	 * @return - The amount of Duranium in the ground.
	 */
	public Integer getDuraniumInGround();
	
	/**
	 * The rate at which Duranium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setDuraniumRate(Integer rate);
	
	/**
	 * The rate at which Duranium is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getDuraniumRate();
	
	
	/*MOLYBDENUM*/
	/**
	 * Set the amount of Molybdenum on the surface of the planet.
	 * @param amount - The amount of Molybdenum on the surface.
	 */
	public void setMolybdenumOnSurface(Integer amount);
	
	/**
	 * Get the amount of Molybdenum on the surface of the planet.
	 * @return - The amount of Molybdenum on the surface.
	 */
	public Integer getMolybdenumOnSurface();
	
	/**
	 * Set the amount of Molybdenum in the ground of the planet.
	 * @param amount - The amount of Molybdenum in the ground.
	 */
	public void setMolybdenumInGround(Integer amount);
	
	/**
	 * Get the amount of Molybdenum in the ground of the planet.
	 * @return - The amount of Molybdenum in the ground.
	 */
	public Integer getMolybdenumInGround();
	
	/**
	 * The rate at which Molybdenum is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setMolybdenumRate(Integer rate);
	
	/**
	 * The rate at which Molybdenum is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getMolybdenumRate();
	
	
	/*NEUTRONIUM*/
	/**
	 * Set the amount of Neutronium on the surface of the planet.
	 * @param amount - The amount of Neutronium on the surface.
	 */
	public void setNeutroniumOnSurface(Integer amount);
	
	/**
	 * Get the amount of Neutronium on the surface of the planet.
	 * @return - The amount of Neutronium on the surface.
	 */
	public Integer getNeutroniumOnSurface();
	
	/**
	 * Set the amount of Neutronium in the ground of the planet.
	 * @param amount - The amount of Neutronium in the ground.
	 */
	public void setNeutroniumInGround(Integer amount);
	
	/**
	 * Get the amount of Neutronium in the ground of the planet.
	 * @return - The amount of Neutronium in the ground.
	 */
	public Integer getNeutroniumInGround();
	
	/**
	 * The rate at which Neutronium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setNeutroniumRate(Integer rate);
	
	/**
	 * The rate at which Neutronium is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getNeutroniumRate();
	
	/* SUPPLIES AND MONEY */
	
	/**
	 * Set the amount of supplies on the planet.
	 * @param amount - Number of supplies.
	 */
	public void setSupplies(Integer amount);
	
	/**
	 * Get the amount of supplies on the planet.
	 * @return - The number of supplies.
	 */
	public Integer getSupplies();
	
	/**
	 * Set the amount of MegaCredits on the planet.
	 * @param amount - Number of MegaCredits.
	 */
	public void setMoney(Integer amount);
	
	/**
	 * Get the amount of MegaCredits on the planet.
	 * @return - Number of MegaCredits.
	 */
	public Integer getMoney();
	
	/* STRUCTURES */
	
	/**
	 * Set the number of Factories on the planet.
	 * @param amount - The number of Factories.
	 */
	public void setFactories(Integer amount);
	
	/**
	 * Get the number of Factories on the planet.
	 * @return - The number of Factories.
	 */
	public Integer getFactories();
	
	/**
	 * Set the number of Mines on the planet.
	 * @param amount - The number of Mines.
	 */
	public void setMines(Integer amount);
	
	/**
	 * Get the number of Mines on the planet.
	 * @return - The number of mines.
	 */
	public Integer getMines();
	
	/**
	 * Set the number of Defense Posts on the planet.
	 * @param amount - The number of Defense Posts
	 */
	public void setDefenses(Integer amount);
	
	/**
	 * Get the number of Defense Posts on the planet.
	 * @return - The number of Defense Posts.
	 */
	public Integer getDefenses();
	
	/* COLONIST INFO */
	
	/**
	 * Set the race that owns the planet.
	 * @param player - The race that owns the planet.
	 */
	public void setPlayer(Player player);
	
	/**
	 * Get the Player that owns the planet.
	 * @return - The Player that owns the planet.
	 */
	public Player getPlayer();
	
	/**
	 * The number of colonists living on the planet.
	 * @param amount - The total number of colonists.
	 */
	public void setNumberOfColonists(Integer amount);
	
	/**
	 * The number of colonists living on the planet.
	 * @return - The total number of colonists.
	 */
	public Integer getNumberOfColonists();
	
	/**
	 * The rate at which the colonists are taxed.
	 * @param rate - The tax rate between 0 and 100.
	 */
	public void setColonistsTaxRate(Integer rate);
	
	/**
	 * The rate at which the colonists are taxed.
	 * @return - The rate between 0 and 100.
	 */
	public Integer getColonistsTaxRate();
	
	/**
	 * The colonists happiness.
	 * @param amount - The colonists happiness between -100 and 100.
	 */
	public void setColonistsHappiness(Integer amount);
	
	/**
	 * The colonists happiness.
	 * @return - The colonists happiness between -100 and 100.
	 */
	public Integer getColonistsHappiness();
	
}
