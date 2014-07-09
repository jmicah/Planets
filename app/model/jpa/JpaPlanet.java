package model.jpa;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.Logger;

import model.AbstractModel;
import model.Game;
import model.Government;
import model.Native;
import model.Planet;
import model.Player;

@Entity
@Table(name = "planet")
public class JpaPlanet extends JpaAbstractModel<JpaPlanet> implements Planet {

	@Column(length=255)
	public String name;
	
	public int temp;
	
	public int xCoordinate;
	public int yCoordinate;
	
	public Native natives;
	
	public int nativesPopulation;
	public int nativesTaxRate;
	public int nativesHappiness;
	public Government nativesGovernment;
	
	public int tritaniumOnSurface;
	public int tritaniumInGround;
	public int tritaniumRate;
	
	public int duraniumOnSurface;
	public int duraniumInGround;
	public int duraniumRate;
	
	public int molybdenumOnSurface;
	public int molybdenumInGround;
	public int molybdenumRate;
	
	public int neutroniumOnSurface;
	public int neutroniumInGround;
	public int neutroniumRate;
	
	public int colonistsPopulation;
	public int colonistsTaxRate;
	public int colonistsHappiness;
	
	public int supplies;
	public int money;
	
	public int factories;
	public int mines;
	public int defenses;
	
	@ManyToOne (
			targetEntity = JpaPlayer.class,
			cascade = {CascadeType.PERSIST}
			)
	public Player player;
	
	@ManyToOne (
			targetEntity = JpaGame.class,
			cascade = {CascadeType.PERSIST}
			)
	public Game game;
	
	@ManyToMany (
			targetEntity = JpaPlanet.class,
			cascade = {CascadeType.PERSIST}
			)
	@JoinTable(name="connecting_planets")
	public List<Planet> connectingPlanets;
	
	@ManyToMany (
			targetEntity = JpaPlanet.class,
			cascade = {CascadeType.PERSIST}
			)
	@JoinTable(name="connecting_gravatonic_planets")
	public List<Planet> connectingGravatonicPlanets;
	
	@ManyToMany (
			targetEntity = JpaPlanet.class,
			cascade = {CascadeType.PERSIST}
			)
	@JoinTable(name="connecting_jump_planets")
	public List<Planet> connectingJumpPlanets;
	
	protected JpaPlanet(String name, int temp, int x, int y, Native natives) {
		
		this.name = name;
		this.temp = temp;		
		this.xCoordinate = x;
		this.yCoordinate = y;
		this.natives = natives;
		
		this.connectingPlanets = new ArrayList<Planet>();
		this.connectingGravatonicPlanets = new ArrayList<Planet>();
		this.connectingJumpPlanets = new ArrayList<Planet>();
		
		this.save();
				
	}
	
	@Override
	public JpaPlanet save() {
		return super.save();
	}
	
	@Override
	public JpaPlanet delete() {
		return super.delete();
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setTemp(int temp) {
		this.temp = temp;
		
	}

	@Override
	public int getTemp() {
		return this.temp;
	}

	@Override
	public void setCoordinates(int x, int y) {
		Logger.debug("New Coords: " + x + ", " + y);
		this.xCoordinate = x;
		this.yCoordinate = y;		
	}

	@Override
	public Map<String, Integer> getCoordinates() {
		Map<String, Integer> coords = new HashMap<String, Integer>();
		coords.put("x", this.xCoordinate);
		coords.put("y", this.yCoordinate);
		
		return coords;
	}

	@Override
	public void setNatives(Native natives) {
		this.natives = natives;
		
	}

	@Override
	public Native getNatives() {
		return this.natives;
	}

	@Override
	public void setNativesPopulation(int amount) {
		this.nativesPopulation = amount;
		
	}

	@Override
	public int getNativesPopulation() {
		return this.nativesPopulation;
	}

	@Override
	public void setNativesTaxRate(int rate) {
		this.nativesTaxRate = rate;
		
	}

	@Override
	public int getNativesTaxRate() {
		return this.nativesTaxRate;
	}

	@Override
	public void setNativesHappiness(int amount) {
		this.nativesHappiness = amount;
		
	}

	@Override
	public int getNativesHappiness() {
		return this.nativesHappiness;
		
	}
	
	@Override
	public void setNativesGovernment(Government government) {
		this.nativesGovernment = government;
	}
	
	@Override 
	public Government getNativesGovernment() {
		return this.nativesGovernment;
	}

	@Override
	public void setTritaniumOnSurface(int amount) {
		this.tritaniumOnSurface = amount;
		
	}

	@Override
	public int getTritaniumOnSurface() {
		return this.tritaniumOnSurface;
	}

	@Override
	public void setTritaniumInGround(int amount) {
		this.tritaniumInGround = amount;
		
	}

	@Override
	public int getTritaniumInGround() {
		return this.tritaniumInGround;
	}

	@Override
	public void setTritaniumRate(int rate) {
		this.tritaniumRate = rate;
		
	}

	@Override
	public int getTritaniumRate() {
		return this.tritaniumRate;
		
	}

	@Override
	public void setDuraniumOnSurface(int amount) {
		this.duraniumOnSurface = amount;		
	}

	@Override
	public int getDuraniumOnSurface() {
		return this.duraniumOnSurface;
	}

	@Override
	public void setDuraniumInGround(int amount) {
		this.duraniumInGround = amount;
	}

	@Override
	public int getDuraniumInGround() {
		return this.duraniumInGround;
	}

	@Override
	public void setDuraniumRate(int rate) {
		this.duraniumRate = rate;
	}

	@Override
	public int getDuraniumRate() {
		return this.duraniumRate;
	}

	@Override
	public void setMolybdenumOnSurface(int amount) {
		this.molybdenumOnSurface = amount;
	}

	@Override
	public int getMolybdenumOnSurface() {
		return this.molybdenumOnSurface;
	}

	@Override
	public void setMolybdenumInGround(int amount) {
		this.molybdenumInGround = amount;
	}

	@Override
	public int getMolybdenumInGround() {
		return this.molybdenumInGround;
	}

	@Override
	public void setMolybdenumRate(int rate) {
		this.molybdenumRate = rate;
	}

	@Override
	public int getMolybdenumRate() {
		return this.molybdenumRate;
	}

	@Override
	public void setNeutroniumOnSurface(int amount) {
		this.neutroniumOnSurface = amount;
	}

	@Override
	public int getNeutroniumOnSurface() {
		return this.neutroniumOnSurface;
	}

	@Override
	public void setNeutroniumInGround(int amount) {
		this.neutroniumInGround = amount;
	}

	@Override
	public int getNeutroniumInGround() {
		return this.neutroniumInGround;
	}

	@Override
	public void setNeutroniumRate(int rate) {
		this.neutroniumRate = rate;
	}

	@Override
	public int getNeutroniumRate() {
		return this.neutroniumRate;
	}

	@Override
	public void setSupplies(int amount) {
		this.supplies = amount;
	}

	@Override
	public int getSupplies() {
		return this.supplies;
	}

	@Override
	public void setMoney(int amount) {
		this.money = amount;
	}

	@Override
	public int getMoney() {
		return this.money;
	}

	@Override
	public void setFactories(int amount) {
		this.factories = amount;
	}

	@Override
	public int getFactories() {
		return this.factories;
	}

	@Override
	public void setMines(int amount) {
		this.mines = amount;
	}

	@Override
	public int getMines() {
		return this.mines;
	}

	@Override
	public void setDefenses(int amount) {
		this.defenses = amount;
	}

	@Override
	public int getDefenses() {
		return this.defenses;
	}

	@Override
	public void setPlayer(Player player) {
		this.player = player;		
	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public void setColonistPopulation(int amount) {
		this.colonistsPopulation = amount;
	}

	@Override
	public int getColonistPopulation() {
		return this.colonistsPopulation;
	}

	@Override
	public void setColonistsTaxRate(int rate) {
		this.colonistsTaxRate = rate;
	}

	@Override
	public int getColonistsTaxRate() {
		return this.colonistsTaxRate;
	}

	@Override
	public void setColonistsHappiness(int amount) {
		this.colonistsHappiness = amount;
	}

	@Override
	public int getColonistsHappiness() {
		return this.colonistsHappiness;
	}

	@Override
	public void addConnectingPlanet(Planet planet) {
		this.connectingPlanets.add(planet);
	}

	@Override
	public List<Planet> getConnectingPlanets() {
		return this.connectingPlanets;
	}

	@Override
	public void addConnectingGravatonicPlanet(Planet planet) {
		this.connectingGravatonicPlanets.add(planet);
	}

	@Override
	public List<Planet> getConnectingGravatonicPlanets() {
		return this.connectingGravatonicPlanets;
	}

	@Override
	public void addConnectingJumpPlanet(Planet planet) {
		this.connectingJumpPlanets.add(planet);
	}

	@Override
	public List<Planet> getConnectingJumpPlanets() {
		return this.connectingJumpPlanets;
	}
	
	

}
