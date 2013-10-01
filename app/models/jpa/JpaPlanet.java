package models.jpa;

import java.util.List;

import models.Native;
import models.Planet;
import models.Player;

public class JpaPlanet implements Planet {

	public String name;
	public int temp;
	public Long xCoordinate;
	public Long yCoordinate;
	
	public Native natives;
	public Long nativePopulation;
	public int nativeTaxRate;
	public int nativeHappiness;
	
	public Long tritaniumSurface;
	public Long tritaniumGround;
	public int tritaniumRate;
	
	public Long duraniumSurface;
	public Long duraniumGround;
	public int duraniumRate;
	
	public Long molybdeumSurface;
	public Long molybdeumGround;
	public int molybdeumRate;
	
	public Long neutroniumSurface;
	public Long neutroniumGround;
	public int neutroniumRate;
	
	public Long colonistsPopulation;
	public int colonistsTaxRate;
	public int colonistsHappiness;
	
	protected JpaPlanet(String name, int temp, Long xCoord, Long yCoord, Native natives) {
		
		this.name = name;
		this.temp = temp;		
		this.xCoordinate = xCoord;
		this.yCoordinate = yCoord;
		this.natives = natives;
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTemp(int temp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTemp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCoordinates(Long xCoord, Long yCoord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Long> getCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNatives(Native natives) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Native getNatives() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNativesPopulation(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getNativesPopulation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNativesTaxRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNativesTaxRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setNativesHappiness(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNativesHappiness() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTritaniumOnSurface(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getTritaniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTritaniumInGround(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getTritaniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTritaniumRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTritaniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDuraniumOnSurface(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getDuraniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDuraniumInGround(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getDuraniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDuraniumRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDuraniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMolybdenumOnSurface(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getMolybdenumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMolybdenumInGround(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getMolybdenumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMolybdenumRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMolybdenumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNeutroniumOnSurface(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getNeutroniumOnSurface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNeutroniumInGround(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getNeutroniumInGround() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNeutroniumRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNeutroniumRate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSupplies(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getSupplies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMoney(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFactories(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getFactories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMines(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getMines() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefenses(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getDefenses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPlayer(Player race) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPlayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumberOfColonists(Long amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getNumberOfColonists() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setColonistsTaxRate(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getColonistsTaxRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setColonistsHappiness(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getColonistsHappiness() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
