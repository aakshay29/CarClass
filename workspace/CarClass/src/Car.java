
public class Car extends Vehicle {
	private int mileage;
	private String color;
	private int seats;
	private int carType; //Sedan, SUV or Compact
	private int speed;
	private boolean start;
	private boolean stop;
	private boolean accelerate;
	private boolean slowDown;
	
	public void setMileage(int inputMileage) {
		mileage = inputMileage;
	} 
	public int getMileage() {
		return mileage;
	} 
	
	public void setColor(String inputColor) {
		color = inputColor;
	} 
	public String getColor() {
		return color;
	} 
	
	public void setSeats(int inputSeats) {
		seats = inputSeats;
	} 
	public int getSeats() {
		return seats;
	} 
	
	public void setCarType(int inputCarType) {
		carType = inputCarType;
	} 
	public int getCarType() {
		return carType;
	} 
	
	public void setSpeed(int inputSpeed) {
		speed = inputSpeed;
	} 
	public int getSpeed() {
		return speed;
	} 
	
	public void setAccelerate(boolean inputAccelerate) {
		accelerate = inputAccelerate;
	} 
	public boolean getAccelerate() {
		return accelerate;
	} 
	
	public void setStart(boolean inputStart) {
		start = inputStart;
	} 
	public boolean getStart() {
		return start;
	} 
	
	public void setStop(boolean inputStop) {
		stop = inputStop;
	} 
	public boolean getStop() {
		return stop;
	}
	
	public void setSlowDown(boolean inputSlowDown) {
		slowDown = inputSlowDown;
	} 
	public boolean getSlowDown() {
		return slowDown;
	} 
	
}
