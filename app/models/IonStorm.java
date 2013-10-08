package models;

import java.util.Map;

public interface IonStorm {

	public void setStrength(StormStrength strength);
	
	public StormStrength getStrength();
	
	public void setHeading(Long x, Long y);
	
	public Map<String, Long> getHeading();
	
	public void setCoordinates(Long x, Long y);
	
	public Map<String, Long> getCoordinates();
	
	public void setRadius(Long radius);
	
	public Long getRadius();
	
	public void setStatus(StormStatus status);
	
	public StormStatus getStatus();
}
