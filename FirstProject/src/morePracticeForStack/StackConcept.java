package morePracticeForStack;

public class StackConcept {
	
	int maxSize;
	int top;
	String arr[];
	
	public StackConcept(int n) {
		maxSize = n;
		arr = new String[maxSize];
		top = 0;
		
	}
	public boolean empty() {
		if(top == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public void push(String str) {
		if(top< maxSize) {
		arr[top]= str;
		top++;
		} else {
			System.out.println( "Stack Overflow!!");
		}
		
	}
	public String pop() {
		if(!this.empty()) {
			String temp = this.peek();
			arr[top-1] = null;
			top--;
			return temp;
		
		}else {
			return null;
		}
		
	}
	public String peek() {
		if(top > 0) {
			return arr[top-1];
		}else {
			return null;
			
		}
		
	}
}
