package utilities;

public class MapTools {

	public static double hypMin = 119025;
	public static double hypMax = 126025;
	
	public static Boolean isWithinRange(int x, int y, int centerX, int centerY, int radius) {		
		return (Math.pow((x-centerX),2) + Math.pow((y-centerY), 2)) <= Math.pow(radius, 2);		
	}
	
	public static Boolean isWithinRange(int x, int y, int centerX, int centerY, double radius) {		
		return (Math.pow((x-centerX),2) + Math.pow((y-centerY), 2)) <= radius;		
	}
	
	public static Boolean isWithinJumpRange(int x, int y, int centerX, int centerY) {
		double distance = Math.pow((x-centerX), 2) + Math.pow((y-centerY), 2);
		return ((hypMin <= distance) && (distance <= hypMax));
	}
	
}
