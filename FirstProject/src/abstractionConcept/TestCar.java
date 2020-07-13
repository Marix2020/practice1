package abstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		
		Lexus l1 = new Lexus ();
		l1.refuel();
		l1.speed();
		l1.stop();
		l1.start();
		l1.powerSteering();
		l1.airBag();
		
		Car a = new Lexus();
		a.refuel();
		a.speed();
		a.start();
		
	}

}
