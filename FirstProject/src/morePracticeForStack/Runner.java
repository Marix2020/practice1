package morePracticeForStack;

public class Runner {

	int stack[] = new int[20];
	int top = 0;

	public static void main(String[] args) {

		Stack num1 = new Stack();

		
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.show();
		System.out.println(num1.isEmpty());

		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);

		System.out.println(num1.size());

		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);
		num1.push(10);

		System.out.println(num1.size());

	}

	public void push(int data) {
		if (top == 20) {
			System.out.println("Stack Overflow");
		} else
			stack[top] = data;
		top++;
	}

	public void show() {
		for (int n : stack) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

}