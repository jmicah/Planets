package models;

import java.util.List;

public interface Planet {

	/** GENERAL SETTINGS **/
	
	/*
	 * Set the name of the planet.
	 * @param name - The name of the planet.
	 */
	public void setName(String name);
	
	/*
	 * Get the name of the planet.
	 * @return - A String containing the name of the planet.	
	 */
	public String getName();
	
	/*
	 * Set the temperature of the planet ranging 0-100
	 * @param temp - The new temperature of the planet.
	 */
	public void setTemp(int temp);
	
	/*
	 * Get the temperature of the planet.
	 * @return - The temperature as an int. (0-100)
	 */
	public int getTemp();
	
	public void setCoordinates(Long xCoord, Long yCoord);
	
	public List<Long> getCoordinates();
	
	/** NATIVE INFO **/
	
	/*
	 * Set the type of natives on the planet.
	 * @param natives - The natives from a Enum.
	 */
	public void setNatives(Native natives);
	
	/*
	 * Get the type of natives on the planet.
	 * @return - The natives on the planet.
	 */
	public Native getNatives();
	
	/*
	 * Set the amount of natives living on the planet.
	 * @param amount - The total number of natives.
	 */
	public void setNativesPopulation(Long amount);
	
	/*
	 * Get the amount of natives on the planet.
	 * @return - The number of natives on the planet.
	 */
	public Long getNativesPopulation();
	
	/*
	 * Set the rate at which to tax the natives.
	 * @param rate - The tax rate between 0 and 100.
	 */
	public void setNativesTaxRate(int rate);
	
	/*
	 * Get the rate at which the natives are being taxed.
	 * @return - The tax rate. (0-100)
	 */
	public int getNativesTaxRate();
	
	/*
	 * Set the happiness off the natives.
	 * @param amount - The happiness of the natives between -100 and 100.
	 */
	public void setNativesHappiness(int amount);
	
	/*
	 * Get the happiness of the natives.
	 * @return - The happiness of the natives (-100-100)
	 */
	public void getNativesHappiness();
	
	/** RESOURCE INFO **/
	
	/*TRITANIUM*/
	/*
	 * Set the amount of Tritanium on the surface of the planet.
	 * @param amount - The amount of Tritanium on the surface.
	 */
	public void setTritaniumOnSurface(Long amount);
	
	/*
	 * Get the amount of Tritanium on the surface of the planet.
	 * @return - The amount of Tritanium on the surface.
	 */
	public Long getTritaniumOnSurface();
	
	/*
	 * Set the amount of Tritanium in the ground.
	 * @param amount - The amount of Tritanium in the ground.
	 */
	public void setTritaniumInGround(Long amount);
	
	/*
	 * Get the amount of Tritanium in the ground.
	 * @return - The amount of Tritanium in the ground.
	 */
	public Long getTritaniumInGround();
	
	/*
	 * The rate at which Tritanium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setTritaniumRate(int rate);
	
	/*
	 * The rate at which Tritanium in mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getTritaniumRate();
	
	
	/*DURANIUM*/
	/*
	 * Set the amount of Duranium on the surface of the planet.
	 * @param amount - The amount of Duranium on the surface.
	 */
	public void setDuraniumOnSurface(Long amount);
	
	/*
	 * Get the amount of Duranium on the surface of the planet.
	 * @return - The amount of Duranium on the surface.
	 */
	public Long getDuraniumOnSurface();
	
	/*
	 * Set the amount of Duranium in the ground of the planet.
	 * @param amount - The amount of Duranium in the ground.
	 */
	public void setDuraniumInGround(Long amount);
	
	/*
	 * Get the amount of Duranium in the ground of the planet.
	 * @return - The amount of Duranium in the ground.
	 */
	public Long getDuraniumInGround();
	
	/*
	 * The rate at which Duranium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setDuraniumRate(int rate);
	
	/*
	 * The rate at which Duranium is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getDuraniumRate();
	
	
	/*MOLYBDENUM*/
	/*
	 * Set the amount of Molybdenum on the surface of the planet.
	 * @param amount - The amount of Molybdenum on the surface.
	 */
	public void setMolybdenumOnSurface(Long amount);
	
	/*
	 * Get the amount of Molybdenum on the surface of the planet.
	 * @return - The amount of Molybdenum on the surface.
	 */
	public Long getMolybdenumOnSurface();
	
	/*
	 * Set the amount of Molybdenum in the ground of the planet.
	 * @param amount - The amount of Molybdenum in the ground.
	 */
	public void setMolybdenumInGround(Long amount);
	
	/*
	 * Get the amount of Molybdenum in the ground of the planet.
	 * @return - The amount of Molybdenum in the ground.
	 */
	public Long getMolybdenumInGround();
	
	/*
	 * The rate at which Molybdenum is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setMolybdenumRate(int rate);
	
	/*
	 * The rate at which Molybdenum is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getMolybdenumRate();
	
	
	/*NEUTRONIUM*/
	/*
	 * Set the amount of Neutronium on the surface of the planet.
	 * @param amount - The amount of Neutronium on the surface.
	 */
	public void setNeutroniumOnSurface(Long amount);
	
	/*
	 * Get the amount of Neutronium on the surface of the planet.
	 * @return - The amount of Neutronium on the surface.
	 */
	public Long getNeutroniumOnSurface();
	
	/*
	 * Set the amount of Neutronium in the ground of the planet.
	 * @param amount - The amount of Neutronium in the ground.
	 */
	public void setNeutroniumInGround(Long amount);
	
	/*
	 * Get the amount of Neutronium in the ground of the planet.
	 * @return - The amount of Neutronium in the ground.
	 */
	public Long getNeutroniumInGround();
	
	/*
	 * The rate at which Neutronium is mined.
	 * @param rate - The rate between 10 and 100.
	 */
	public void setNeutroniumRate(int rate);
	
	/*
	 * The rate at which Neutronium is mined.
	 * @return - The rate between 10 and 100.
	 */
	public void getNeutroniumRate();
	
	/** SUPPLIES AND MONEY **/
	
	/*
	 * Set the amount of supplies on the planet.
	 * @param amount - Number of supplies.
	 */
	public void setSupplies(Long amount);
	
	/*
	 * Get the amount of supplies on the planet.
	 * @return - The number of supplies.
	 */
	public Long getSupplies();
	
	/*
	 * Set the amount of MegaCredits on the planet.
	 * @param amount - Number of MegaCredits.
	 */
	public void setMoney(Long amount);
	
	/*
	 * Get the amount of MegaCredits on the planet.
	 * @return - Number of MegaCredits.
	 */
	public Long getMoney();
	
	/** STRUCTURES **/
	
	/*
	 * Set the number of Factories on the planet.
	 * @param amount - The number of Factories.
	 */
	public void setFactories(Long amount);
	
	/*
	 * Get the number of Factories on the planet.
	 * @return - The number of Factories.
	 */
	public Long getFactories();
	
	/*
	 * Set the number of Mines on the planet.
	 * @param amount - The number of Mines.
	 */
	public void setMines(Long amount);
	
	/*
	 * Get the number of Mines on the planet.
	 * @return - The number of mines.
	 */
	public Long getMines();
	
	/*
	 * Set the number of Defense Posts on the planet.
	 * @param amount - The number of Defense Posts
	 */
	public void setDefenses(Long amount);
	
	/*
	 * Get the number of Defense Posts on the planet.
	 * @return - The number of Defense Posts.
	 */
	public Long getDefenses();
	
	/** COLONIST INFO **/
	
	/*
	 * Set the race that owns the planet.
	 * @param race - The race that owns the planet.
	 */
	public void setPlayer(Player race);
	
	/*
	 * Get the race that owns the planet.
	 * @return - The race that owns the planet.
	 */
	public void getPlayer();
	
	/*
	 * The number of colonists living on the planet.
	 * @param amount - The total number of colonists.
	 */
	public void setNumberOfColonists(Long amount);
	
	/*
	 * The number of colonists living on the planet.
	 * @return - The total number of colonists.
	 */
	public Long getNumberOfColonists();
	
	/*
	 * The rate at which the colonists are taxed.
	 * @param rate - The tax rate between 0 and 100.
	 */
	public void setColonistsTaxRate(int rate);
	
	/*
	 * The rate at which the colonists are taxed.
	 * @return - The rate between 0 and 100.
	 */
	public int getColonistsTaxRate();
	
	/*
	 * The colonists happiness.
	 * @param amount - The colonists happiness between -100 and 100.
	 */
	public void setColonistsHappiness(int amount);
	
	/*
	 * The colonists happiness.
	 * @return - The colonists happiness between -100 and 100.
	 */
	public int getColonistsHappiness();
	
}
