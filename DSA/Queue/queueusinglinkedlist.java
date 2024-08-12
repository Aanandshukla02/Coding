// Creating a class to implement a queue using a linked list
public class queueusinglinkedlist {

    // Defining a nested class for nodes in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Defining another nested class for implementing the queue using linked list
    static class InnerQueueUsingLinkedList {
        static Node head = null; // Initializing head of the queue
        static Node tail = null; // Initializing tail of the queue

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // Method to add an element to the queue
        public void add(int data) {
            Node newNode = new Node(data); // Creating a new node with the given data
            if (tail == null) { // If queue is empty
                head = tail = newNode; // Both head and tail point to the new node
            } else {
                tail.next = newNode; // Connecting the new node to the tail
                tail = newNode; // Updating tail to the new node
            }
        }

        // Method to remove an element from the queue
        public int remove() {
            if (isEmpty()) { // If queue is empty
                System.out.println("Queue is Empty");
                return -1; // Returning a sentinel value to indicate failure
            }
            int front = head.data; // Storing the data of the front node
            if (tail == head) { // If only one node is present in the queue
                tail = head = null; // Emptying the queue
            } else {
                head = head.next; // Moving head to the next node
            }
            return front; // Returning the removed element
        }

        // Method to peek at the front element of the queue
        public int peek() {
            if (isEmpty()) { // If queue is empty
                System.out.println("Empty Queue");
                return -1; // Returning a sentinel value to indicate failure
            }
            return head.data; // Returning the data of the front node
        }
    }

    // Main method
    public static void main(String[] args) {
        InnerQueueUsingLinkedList q = new InnerQueueUsingLinkedList(); // Creating an instance of the queue
        q.add(1); // Adding elements to the queue
        q.add(2);
        q.add(3);

        // Removing and printing elements from the queue until it becomes empty
        while (!q.isEmpty()) {
            System.out.println(q.peek()); // Printing the front element of the queue
            q.remove(); // Removing the front element of the queue
        }
    }
}
