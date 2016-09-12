
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setSpeed(50);
		car.setAccelerate(true);
		car.setSlowDown(false);
		car.setStop(false);
		car.setStart(true);
		
		System.out.println("Start car: " + car.getStart() + "\nStarted by: " + car.getPersonName() +  "\nAcceleration: " + car.getAccelerate() + "\nSpeed: " + car.getSpeed() + "\nSlow Down: " + car.getSlowDown() + "\nStop: " + car.getStop());
	}

}
