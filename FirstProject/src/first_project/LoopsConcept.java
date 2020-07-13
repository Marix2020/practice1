package first_project;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop:
		/*disadvantage of while loop: it will generate infinite loop if you don't give
		 * incremental/decremental part*/
		 
		//print 1 to 10
		int i = 1;  //initialization
		while(i<=10) {  //conditional
          System.out.println(i);
          i=i+1;   //incremental/decremental
		}
		
		System.out.println("***********");
		
		//j++ means j = j+1
		//print 1 to 10
		//2. for Loop:
		for(int j=1;j<=10;j++) { //initialization, Conditional, Incremental
		System.out.println(j);
		}
		
		System.out.println("***********");
		
		//-1>-10 true
		//1>10 false
		
		//print 10 to 1
		//k-- means k = k-1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10;k>=-10;k--) {
			System.out.println(k);	
		}
		
		
		
	}

}
