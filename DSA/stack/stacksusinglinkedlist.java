import java.util.*;

// Define a public class named "stacks"
public class stacksusinglinkedlist {

    // Define a static nested class named "Node" to represent a node in the stack
    static class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
            this.next = null; // Initially, the next node is null
        }
    }

    // Define another static nested class named "stack" to implement stack functionality
    static class stack {
        static Node head = null; // Static reference to the top node of the stack

        // Method to check if the stack is empty
        public static boolean isEmpty() {
            return (head == null); // Returns true if the top node is null (indicating an empty stack)
        }

        // Method to push an element onto the stack
        public static void push(int data) {
            Node newNode = new Node(data); // Create a new node with the given data
            if (isEmpty()) { // If the stack is empty
                head = newNode; // Assign the new node as the top node
                return;
            }
            newNode.next = head; // Otherwise, make the new node point to the current top node
            head = newNode; // Update the top node to the new node
        }

        // Method to pop an element from the stack
        public static int pop() {
            if (isEmpty()) { // If the stack is empty
                return -1; // Return -1 indicating underflow
            }
            int top = head.data; // Store the data of the current top node
            head = head.next; // Move the top pointer to the next node (removing the current top node)
            return top; // Return the data of the removed top node
        }

        // Method to peek at the top element of the stack without removing it
        public static int peek() {
            if (isEmpty()) { // If the stack is empty
                return -1; // Return -1 indicating underflow
            }
            return head.data; // Return the data of the current top node
        }
    }

    // Main method to test the stack implementation
    public static void main(String[] args) {
        stack s = new stack(); // Create an instance of the custom stack class

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            System.out.println(stack.peek() + " "); // Print the top element of the stack
            stack.pop(); // Remove the top element of the stack
        }
    }
}
