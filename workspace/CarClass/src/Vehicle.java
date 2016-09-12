public class Vehicle {
	private int capacity;
	private int distance;
	private int mode; // Air, Road, Water
	private int type; //Private or Public
	
	public void setCapacity(int inputCapacity) {
		capacity = inputCapacity;
	} 
	public int getCapacity() {
		return capacity;
	} 
	
	public void setDistance(int inputDistance) {
		distance = inputDistance;
	} 
	public int getDistance() {
		return distance;
	} 
	
	public void setMode(int inputMode) {
		mode = inputMode;
	} 
	public int getMode() {
		return mode;
	} 
	
	public void setType(int inputType) {
		type = inputType;
	} 
	public int getTitle() {
		return type;
	} 
	
}
