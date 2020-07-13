package morePracticeForStack;

import java.util.Stack;

public class Emma_Code {

	public static void main(String[] args) {


	Stack<Integer> stack = new Stack<Integer>(); 
		
		stack.add(9999); 
		//stack.push(122); 
		//stack.push(11);
		
		System.out.println(stack.size());
		
		System.out.println(stack.capacity());
		
		System.out.println(stack.indexOf(1));
		
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(1222);
		stack.add(666);
		
		System.out.println(stack.size());
		
		System.out.println(stack.capacity());
		
		System.out.println(stack.indexOf(1));
		
		System.out.println(stack.peek());
		
		//stack.pop();
		
		System.out.println(stack.size());
		
		System.out.println(stack.capacity());
		
		System.out.println(stack.firstElement());
		System.out.println(stack.peek());
		System.out.println(stack.lastElement());
		
		
	}

}
