package morePracticeForStack;

public class Stack {
	
	int stack[] = new int[10];
	int top = 0;
	
	public void push (int data) {
		if (top==10) {
			System.out.println("Stack Overflow");
		}else
		stack[top] = data;
		top++;
	}

	public int pop() {
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
			
	}
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public void show() {
		for(int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();
		
	}



}
