package abstractionConcept;

public interface Car {
	//only final and static variables
	int wheels = 4;
	
	
	
	//Always define only abstract method--
	//no method body
	//only method declaration
	//we achieve 100% abstraction
	//cannot have the object of interface
	
	void start();
	void stop ();
	void refuel();
	void speed ();
	

}
