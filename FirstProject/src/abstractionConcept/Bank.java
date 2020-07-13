package abstractionConcept;

public abstract class Bank {
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;
	
	
	//partial abstraction
	//hiding the implementation logic - is called Abstraction
	//Abstract class can have abstract method and non abstract method
	// cannot instantiate the object

	public abstract void loan(); // abstract method has no method body

	public abstract void insurance();

	
	
	 // non abstract method
	public void credit() { 
		System.out.println("Bank --Credit");
	}

	public void debit() {
		System.out.println("Bank -- debit");
	}

	public void withdraw() {
		System.out.println("Bank -- Withdraw");
	}

	public void deposit() {
		System.out.println("Bank -- deposit");
	}

}
