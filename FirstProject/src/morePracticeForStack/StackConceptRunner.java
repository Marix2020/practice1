package morePracticeForStack;

public class StackConceptRunner {

	public static void main(String[] args) {
		
		//PUSH, POP, EMPTY,PEEK
		StackConcept myStack = new StackConcept(4);
		
		System.out.println(myStack.empty());
		
		myStack.push("1");
		System.out.println(myStack.empty());
		System.out.println(myStack.pop());
		
		myStack.push("2");
		System.out.println(myStack.peek());
		
		myStack.push("3");
		System.out.println(myStack.peek());
		
		myStack.push("4");
		System.out.println(myStack.peek());
		
		myStack.push("5");
		System.out.println(myStack.peek());
		
		
		
		
		
		

	}

}
