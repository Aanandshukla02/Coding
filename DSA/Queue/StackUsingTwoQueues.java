import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
    static class InnerStackUsingTwoQueues {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // Check if the stack is empty
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // Add an element to the stack
        public static void push(int data) {
            // Push to q2
            q2.add(data);
            // Transfer all elements from q1 to q2
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            // Swap the names of q1 and q2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        // Remove the top element from the stack
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.remove();
        }

        // Get the top element of the stack
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        InnerStackUsingTwoQueues stack = new InnerStackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // Should print 3
        stack.pop();
        System.out.println(stack.peek()); // Should print 2
        stack.pop();
        System.out.println(stack.peek()); // Should print 1
        stack.pop();
        System.out.println(stack.peek()); // Should print "Stack is Empty" and then -1
    }
}
