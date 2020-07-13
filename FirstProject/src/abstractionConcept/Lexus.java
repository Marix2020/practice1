package abstractionConcept;

public class Lexus implements Car {

	@Override
	public void start() {
		System.out.println("Lexus = start");

	}

	@Override
	public void stop() {
		System.out.println("Lexus = stop");

	}

	@Override
	public void refuel() {
		System.out.println("Lexus = refuel");

	}

	@Override
	public void speed() {
		System.out.println("Lexus = speed");

	}

	// non overridden method
	public void powerSteering() {
		System.out.println("Lexus -- power steering");

	}
	public void airBag () {
		System.out.println("Lexus -- AirBag");
	}

}
