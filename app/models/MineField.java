package models;

import java.util.Map;

public interface MineField {

	public void setRadius(Long radius);
	
	public Long getRadius();
	
	public void setOwner(Player player);
	
	public Player getOwner();
		
	public Boolean isWebMine();
	
	public void setCoordinates(Long x, Long y);
	
	public Map<String, Long> getCoordinates();
	
}
