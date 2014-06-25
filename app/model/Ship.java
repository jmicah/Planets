package model;

import java.util.Map;

public interface Ship extends AbstractModel {

	/**
	 * @param hull - The hull of ship
	 */
	public void setHull(ShipHull hull);
	
	/**
	 * @return - The ship hull.
	 */
	public ShipHull getHull();
	
	/**
	 * @param name - The name of the ship.
	 */
	public void setName(String name);
	
	/**
	 * @return - The ship name.
	 */
	public String getName();
	
	/**
	 * An x,y coordinate of the ship.
	 * @param	x - The x coordinate
	 * 			y - The y coordinate
	 */
	public void setCoordinates(int x, int y);
	
	/**
	 * @return - A map of the coordinates (x, y)
	 */
	public Map<String, Integer> getCoordinates();	
	
	/**
	 * An x,y destination of the ship.
	 * @param	x - The x coordinate
	 * 			y - The y coordinate
	 */
	public void setDestination(int x, int y);
	
	/**
	 * @return - A map of the destination (x, y)
	 */
	public Map<String, Integer> getDestination();
	
	/**
	 * @param damage - The damage done to the ship as a percentage.
	 */
	public void setDamage(int damage);
	
	/**
	 * @return - The damage done to the ship.
	 */
	public int getDamage();
	
	/**
	 * @param shield - The percentage of remaining shields.
	 */
	public void setShield(int shield);
	
	/**
	 * @return - The percentage of remaining shields.
	 */
	public int getShield();
	
	/**
	 * @param mission - The ships mission.
	 */
	public void setMission(ShipMission mission);
	
	/**
	 * @return - The ships mission.
	 */
	public ShipMission getMission();
	
	/**
	 * @param fc - The 3 digit friendly code.
	 */
	public void setFriendlyCode(String fc);
	
	/**
	 * @return - The 3 digit friendly code.
	 */
	public String getFriendlyCode();
	
	/**
	 * @param enemy - The RaceType set as enemy.
	 */
	public void setEnemy(RaceType enemy);
	
	/**
	 * @return - The enemy RaceType.
	 */
	public RaceType getEnemy();
	
	/**
	 * @param engineTech - The tech level of engines.
	 */
	public void setEngines(int engineTech);
	
	/**
	 * @return - The engine tech level.
	 */
	public int getEngines();
	
	/**
	 * @param beamTech - The tech level of beams.
	 */
	public void setBeams(int beamTech);
	
	/**
	 * @return - The beam tech level.
	 */
	public int getBeams();
	
	/**
	 * @param beamNum - The number of beams.
	 */
	public void setBeamCount(int beamNum);
	
	/**
	 * @return - The number of beams.
	 */
	public int getBeamCount();
	
	/**
	 * @param tubeTech - The tube tech level.
	 */
	public void setTubes(int tubeTech);
	
	/**
	 * @return - The tube tech level.
	 */
	public int getTubes();
	
	/**
	 * @param tubeNum - The number of tubes.
	 */
	public void setTubeCount(int tubeNum);
	
	/**
	 * @return - The number of tubes.
	 */
	public int getTubeCount();
	
	/**
	 * @param torpedoes - The total number of torpedoes in cargo.
	 */
	public void setTorpedoes(int torpedoes);
	
	/**
	 * @return - The total number of torpedoes in cargo.
	 */
	public void getTorpedoes();
	
	/**
	 * @param fighters - The total number of fighters stored in cargo.
	 */
	public void setFighters(int fighters);
	
	/**
	 * @return - The total number of fighters stored in cargo.
	 */
	public void getFighters();
	
	/**
	 * @param supply - The total number of supplies in cargo.
	 */
	public void setSupply(int supply);
	
	/**
	 * @return - The total number of supplies in cargo.
	 */
	public void getSupply();
	
	/**
	 * @param neutronium - The total number of neutronium in fuel tank.
	 */
	public void setNeutronium(int neutronium);
	
	/**
	 * @return - The total number of neutronium in fuel tank.
	 */
	public void getNeutronium();
	
	/**
	 * @param colonists - The total number of colonists in cargo.
	 */
	public void setColonists(int colonists);
	
	/**
	 * @return - The total number of colonists in cargo.
	 */
	public void getColonists();
	
	/**
	 * @param molybdenum - The total number of molybdenum in cargo.
	 */
	public void setMolybdenum(int molybdenum);
	
	/**
	 * @return - The total number of molybdenum in cargo.
	 */
	public void getMolybdenum();
	
	/**
	 * @param duranium - The total number of duranium in cargo.
	 */
	public void setDuranium(int duranium);
	
	/**
	 * @return - The total number of duranium in cargo.
	 */
	public void getDuranium();
	
	/**
	 * @param tritanium - The total number of tritanium in cargo.
	 */
	public void setTritanium(int tritanium);
	
	/**
	 * @return - The total number of tritanium in cargo.
	 */
	public void getTritanium();

}
