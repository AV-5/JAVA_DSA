package stack;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display stack
        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop top element
        System.out.println("Popped element: " + stack.pop());

        // Display stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of stack
        System.out.println("Stack size: " + stack.size());
    }
}