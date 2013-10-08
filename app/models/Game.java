package models;

import java.util.List;

public interface Game {

	public void setMapHeight(Long height);
	
	public Long getMapHeight();
	
	public void setMapWidth(Long width);
	
	public Long getMapWidth();
	
	public List<Planet> getPlanets();
	
	public List<Ship> getShips();
	
	public List<MineField> getMines();
	
	public List<IonStorm> getStorms();
	
	public void setPlanetLimit(Long planetLimit);
	
	public Long getPlanetLimit();
	
	public void setShipLimit(Long shipLimit);
	
	public Long getShipLimit();
}
