package model.jpa;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import play.Logger;

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
	
	public int nativePopulation;
	public int nativeTaxRate;
	public int nativeHappiness;
	
	public int tritaniumSurface;
	public int tritaniumGround;
	public int tritaniumRate;
	
	public int duraniumSurface;
	public int duraniumGround;
	public int duraniumRate;
	
	public int molybdeumSurface;
	public int molybdeumGround;
	public int molybdeumRate;
	
	public int neutroniumSurface;
	public int neutroniumGround;
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
	
	protected JpaPlanet(String name, int temp, int x, int y, Native natives) {
		
		this.name = name;
		this.temp = temp;		
		this.xCoordinate = x;
		this.yCoordinate = y;
		this.natives = natives;
		
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
		this.nativePopulation = amount;
		
	}

	@Override
	public int getNativesPopulation() {
		return this.nativePopulation;
	}

	@Override
	public void setNativesTaxRate(int rate) {
		this.nativeTaxRate = rate;
		
	}

	@Override
	public int getNativesTaxRate() {
		return this.nativeTaxRate;
	}

	@Override
	public void setNativesHappiness(int amount) {
		this.nativeHappiness = amount;
		
	}

	@Override
	public int getNativesHappiness() {
		return this.nativeHappiness;
		
	}

	@Override
	public void setTritaniumOnSurface(int amount) {
		this.tritaniumSurface = amount;
		
	}

	@Override
	public int getTritaniumOnSurface() {
		return this.tritaniumSurface;
	}

	@Override
	public void setTritaniumInGround(int amount) {
		this.tritaniumGround = amount;
		
	}

	@Override
	public int getTritaniumInGround() {
		return this.tritaniumGround;
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
		this.duraniumSurface = amount;		
	}

	@Override
	public int getDuraniumOnSurface() {
		return this.duraniumSurface;
	}

	@Override
	public void setDuraniumInGround(int amount) {
		this.duraniumGround = amount;
	}

	@Override
	public int getDuraniumInGround() {
		return this.duraniumGround;
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
		this.molybdeumSurface = amount;
	}

	@Override
	public int getMolybdenumOnSurface() {
		return this.molybdeumSurface;
	}

	@Override
	public void setMolybdenumInGround(int amount) {
		this.molybdeumGround = amount;
	}

	@Override
	public int getMolybdenumInGround() {
		return this.molybdeumGround;
	}

	@Override
	public void setMolybdenumRate(int rate) {
		this.molybdeumRate = rate;
	}

	@Override
	public int getMolybdenumRate() {
		return this.molybdeumRate;
	}

	@Override
	public void setNeutroniumOnSurface(int amount) {
		this.neutroniumSurface = amount;
	}

	@Override
	public int getNeutroniumOnSurface() {
		return this.neutroniumSurface;
	}

	@Override
	public void setNeutroniumInGround(int amount) {
		this.neutroniumGround = amount;
	}

	@Override
	public int getNeutroniumInGround() {
		return this.neutroniumGround;
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
	
	

}
