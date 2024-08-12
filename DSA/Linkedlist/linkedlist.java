package Linkedlist;
import java.util.LinkedList;

// Define a class named 'linkedlist'.
public class linkedlist {

    // Define a nested static class 'Node' to represent the nodes of the linked
    // list.
    public static class Node {
        int data;
        Node next;

        // Constructor to initialize a node with given data.
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Declare variables to represent the head and tail of the linked list.
    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add a node with data 'data' at the beginning of the linked list.
    public void addfirst(int data) {
        // Create a new node with the given data.
        Node newNode = new Node(data);
        size++;
        // If the list is empty, set both head and tail to the new node.
        if (head == null) {
            head = tail = newNode;
            return;
        } else {
            // Otherwise, attach the new node to the beginning of the list and update the
            // head.
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to add a node with data 'data' at the end of the linked list.
    public void addlast(int data) {
        // Create a new node with the given data.
        Node newNode = new Node(data);
        size++;

        // If the list is empty, set both head and tail to the new node.
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Otherwise, attach the new node to the end of the list and update the tail.
        tail.next = newNode;
        tail = newNode;
    }

    // Method to add a node with data 'data' at the specified index of the linked list.
    public void add(int idx, int data) {
        // If the index is 0, insert the node at the beginning of the list using the
        // 'addfirst' method.
        if (idx == 0) {
            addfirst(data);
            return;
        }
        // Otherwise, create a new node with the given data.
        Node newNode = new Node(data);
        size++;
        // Initialize a temporary node to traverse the list.
        Node temp = head;

        // Initialize a counter to track the current index.
        int i = 0;

        // Traverse the list until reaching the desired index or the end of the list.
        while (temp != null && i < idx) {
            temp = temp.next;
            i++;
        }

        // Insert the new node at the desired index by updating the next pointers.
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove the node at the beginning of the linked list and return its
    // data.
    public int removefirst() {
        // If the list is empty, print a message and return the minimum integer value.
        if (size == 0) {
            System.out.println("The list is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If there's only one element in the list.
            // Store the value of the head node.
            int value = head.data;
            // Remove the only node in the list.
            head = tail = null;
            size = 0;
            return value;
        }
        // If there are more than one element in the list.
        // Store the value of the head node.
        int value = head.data;
        // Move the head pointer to the next node.
        head = head.next;
        // Decrease the size of the list.
        size--;
        return value;
    }

    // Method to remove the node at the end of the linked list and return its data.
    public int removelast() {
        // If the list is empty, print a message and return the minimum integer value.
        if (size == 0) {
            System.out.println("The list is empty.");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If there's only one element in the list.
            // Store the value of the tail node.
            int value = tail.data;
            // Remove the only node in the list.
            head = tail = null;
            size = 0;
            return value;
        }
        // If there are more than one element in the list.
        // Initialize a pointer to traverse the list.
        Node prev = head;
        // Traverse the list until reaching the second to last node.
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        // Store the value of the last node.
        int value = prev.next.data;
        // Remove the last node by setting the next pointer of the second to last node
        // to null.
        prev.next = null;
        // Update the tail pointer to point to the second to last node.
        tail = prev;
        // Decrease the size of the list.
        size--;
        return value;
    }

    // Method to perform an iterative search for a given key in the linked list.
    public int itrsearch(int key) {
        // Initialize a temporary node to traverse the list.
        Node temp = head;
        int i = 0;

        // Iterate through the list.
        while (temp != null) {
            // If the data of the current node matches the key, return the current index.
            if (temp.data == key) {
                return i;
            }
            // Move to the next node.
            temp = temp.next;
            // Increment the index.
            i++;
        }
        // If the key is not found, return -1.
        return -1;
    }

    // Recursive method to search for a given key in the linked list.
    public int helper(Node head, int key) {
        // If the head is null, return -1 indicating the key is not found.
        if (head == null) {
            return -1;
        } else if (head.data == key) { // If the data of the current node matches the key, return 0.
            return 0;
        }
        // Otherwise, recursively call the helper function on the next node.
        int idx = helper(head.next, key);
        // If the key is found in the sublist starting from the next node, return the
        // index incremented by 1.
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Method to perform a recursive search for a given key in the linked list.
    public int recsearch(int key) {
        // Call the helper function starting from the head node.
        return helper(head, key);
    }

    // This method will reverse the order of elements in your linked list.
    public void reverse() {
        Node prev = null;
        Node curr = tail = head; // Both tail and head are initialized to the current head.
        Node next;

        while (curr != null) {
            next = curr.next; // Store the next node of curr
            curr.next = prev; // Reverse the pointer of curr to point to prev
            prev = curr; // Move prev to curr
            curr = next; // Move curr to next
        }
        head = prev; // Update the head to the last node, which is now the first node of the reversed
                     // list.
    }

    public Node findmid(Node head) {
        // Step 1: Initialize two pointers, slow and fast, both pointing to the head of
        // the list
        Node slow = head;
        Node fast = head;

        // Step 2: Traverse the list with two pointers, moving slow by one step and fast
        // by two steps
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer one step forward
            fast = fast.next.next; // Move fast pointer two steps forward
        }

        // Step 3: When fast pointer reaches the end of the list, slow pointer will be
        // at the middle
        return slow; // Return the node at the middle of the list
    }

    public boolean checkpalindrome() {
        // Step 1: Check if the list is empty or contains only one node
        if (head == null || head.next == null) {
            return true; // If so, it's considered a palindrome
        }

        // Step 2: Find the middle node of the list
        Node midNode = findmid(head);

        // Step 3: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move pointers one position ahead
            curr = next;
        }
        Node right = prev; // Right now holds the head of the reversed second half

        // Step 4: Traverse both halves of the list and check for palindrome
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false; // If data at corresponding nodes don't match, it's not a palindrome
            }
            left = left.next; // Move left pointer forward
            right = right.next; // Move right pointer forward
        }

        // Step 5: If the traversal completes without any mismatches, it's a palindrome
        return true;
    }

    // Method to display the elements of the linked list.
    public void display() {
        // Start from the head of the list.
        Node temp = head;

        // Traverse the list and print the data of each node.
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Main method to test the linked list implementation.
    public static void main(String[] args) {
        // Create an instance of the linked list.
        linkedlist ll = new linkedlist();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);

        ll.display(); // Output: 1->2->2->1->NULL
        System.out.println("\nIs Palindrome? : "+ll.checkpalindrome()); // Output: Is Palindrome? : True
    }
}
