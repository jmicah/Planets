package model.jpa;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;

import play.Logger;

import model.Native;
import model.Planet;
import model.Player;

@Entity
public class JpaPlanet extends JpaAbstractModel<JpaPlanet> implements Planet {

	@Column(length=255)
	public String name;
	
	@Column(length=255)
	public Integer temp;
	
	@Column(length=255)
	public Integer xCoordinate;
	
	@Column(length=255)
	public Integer yCoordinate;
	
	public Native natives;
	public Integer nativePopulation;
	public Integer nativeTaxRate;
	public Integer nativeHappiness;
	
	public Integer tritaniumSurface;
	public Integer tritaniumGround;
	public Integer tritaniumRate;
	
	public Integer duraniumSurface;
	public Integer duraniumGround;
	public Integer duraniumRate;
	
	public Integer molybdeumSurface;
	public Integer molybdeumGround;
	public Integer molybdeumRate;
	
	public Integer neutroniumSurface;
	public Integer neutroniumGround;
	public Integer neutroniumRate;
	
	public Integer colonistsPopulation;
	public Integer colonistsTaxRate;
	public Integer colonistsHappiness;
	
	protected JpaPlanet(String name, Integer temp, Integer x, Integer y, Native natives) {
		
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
	public void setTemp(Integer temp) {
		this.temp = temp;
		
	}

	@Override
	public Integer getTemp() {
		return this.temp;
	}

	@Override
	public void setCoordinates(Integer x, Integer y) {
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
	public void setNativesPopulation(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getNativesPopulation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNativesTaxRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getNativesTaxRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNativesHappiness(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNativesHappiness() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTritaniumOnSurface(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getTritaniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTritaniumInGround(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getTritaniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTritaniumRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTritaniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDuraniumOnSurface(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getDuraniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDuraniumInGround(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getDuraniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDuraniumRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDuraniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMolybdenumOnSurface(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getMolybdenumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMolybdenumInGround(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getMolybdenumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMolybdenumRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMolybdenumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNeutroniumOnSurface(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getNeutroniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNeutroniumInGround(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getNeutroniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNeutroniumRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNeutroniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSupplies(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getSupplies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMoney(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFactories(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getFactories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMines(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getMines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefenses(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getDefenses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayer(Player race) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNumberOfColonists(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getNumberOfColonists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setColonistsTaxRate(Integer rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getColonistsTaxRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setColonistsHappiness(Integer amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getColonistsHappiness() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
