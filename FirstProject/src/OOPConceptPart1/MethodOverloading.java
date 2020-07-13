package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading ();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10, 5);
	}
	
	//you cannot create a method inside a method
	//duplicate method --i.e. same method name with same number of arguments are not allowed
	
	/*method overloading --> when the method name is same with different arguments
	 * or input parameters within the same class*/
	public void sum() { //0 input parameter
		System.out.println("SUM method -- zero param");
		
	}
	
	public void sum(int i) { //1 input parameter
		System.out.println("Sum method");
		System.out.println(i);
	}
	
	public void sum(int k, int l) { //2 input parameter
		System.out.println("sum method");
		System.out.println(k+l);
	}
	
	

}
