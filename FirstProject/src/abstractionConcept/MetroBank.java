package abstractionConcept;

public class MetroBank extends Bank {

	@Override
	public void loan() {
		System.out.println("MetroBank -- Loan method");
		
	}

	@Override
	public void insurance() {
		System.out.println("MetroBank -- Insurance");
		
	}
	
	public void funds () {
		System.out.println("MetroBank -- Funds");
	}

}
