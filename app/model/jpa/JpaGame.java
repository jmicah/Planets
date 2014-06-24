package model.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import model.AbstractModel;
import model.Game;
import model.IonStorm;
import model.MineField;
import model.Planet;
import model.Ship;
import model.User;

@Entity
@Table(name = "game")
public class JpaGame extends JpaAbstractModel<JpaGame> implements Game {

	@ManyToOne (
			targetEntity = JpaUser.class,
			cascade = {CascadeType.PERSIST}
			)
	public User owner;
	
	public int mapHeight;
	public int mapWidth;
	
	@OneToMany (
			targetEntity = JpaPlanet.class,
			cascade = {CascadeType.PERSIST}
			)
	public List<Planet> planets;
	
	@OneToMany (
			targetEntity = JpaShip.class,
			cascade = {CascadeType.PERSIST}
			)
	public List<Ship> ships;
	
	@OneToMany (
			targetEntity = JpaMineField.class,
			cascade = {CascadeType.PERSIST}
			)
	public List<MineField> mines;
	
	@OneToMany (
			targetEntity = JpaIonStorm.class,
			cascade = {CascadeType.PERSIST}
			)
	public List<IonStorm> storms;
	
	public int planetLimit;
	public int shipLimit;
	
	protected JpaGame(User owner, int height, int width, int planetLimit) {
		
		this.owner = owner;
		this.mapHeight = height;
		this.mapWidth = width;
		this.planetLimit = planetLimit;
		
		this.planets = new ArrayList<Planet>();
		this.ships = new ArrayList<Ship>();
		this.mines = new ArrayList<MineField>();
		this.storms = new ArrayList<IonStorm>();
		
		this.save();
	}
	
	@Override
	public JpaGame save() {
		return super.save();
	}

	@Override
	public JpaGame delete() {
		return super.delete();
	}

	@Override
	public User getOwner() {
		return this.owner;
	}

	@Override
	public void setMapHeight(int height) {
		this.mapHeight = height;
	}

	@Override
	public int getMapHeight() {
		return this.mapHeight;
	}

	@Override
	public void setMapWidth(int width) {
		this.mapWidth = width;
	}

	@Override
	public int getMapWidth() {
		return this.mapWidth;
	}

	@Override
	public List<Planet> getPlanets() {
		return this.planets;
	}

	@Override
	public void addPlanet(Planet planet) {
		this.planets.add(planet);
	}
	
	@Override
	public Planet findPlanetByName(String name){
		for(Planet planet : this.planets) {
			if(planet.getName().equals(name))
				return planet;
		}
		return null;
	}
	
	@Override
	public List<Ship> getShips() {
		return this.ships;
	}
	
	@Override
	public void addShip(Ship ship) {
		this.ships.add(ship);
	}

	@Override
	public List<MineField> getMines() {
		return this.mines;
	}

	@Override
	public void addMineField(MineField minefield) {
		this.mines.add(minefield);
	}
	
	@Override
	public List<IonStorm> getStorms() {
		return this.storms;
	}
	
	@Override
	public void addStorm(IonStorm storm) {
		this.storms.add(storm);
	}

	@Override
	public void setPlanetLimit(int planetLimit) {
		this.planetLimit = planetLimit;
	}

	@Override
	public int getPlanetLimit() {
		return this.planetLimit;
	}

	@Override
	public void setShipLimit(int shipLimit) {
		this.shipLimit = shipLimit;
	}

	@Override
	public int getShipLimit() {
		return this.shipLimit;
	}
}
