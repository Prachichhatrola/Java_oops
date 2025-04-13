package Collection.List;

import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");

		System.out.println("Stack: " + stack);
		System.out.println("Top element: " + stack.peek());

		stack.pop();
		System.out.println("After pop: " + stack);
	}
}

//Stack follows LIFO (Last In First Out) order, useful for push/pop operations.
