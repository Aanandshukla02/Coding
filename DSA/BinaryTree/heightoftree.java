public class heightoftree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        return Math.max(lh, rh) + 1;
    }
    
    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }
    
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }
    
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String args[]) {
        /*
             1
           /   \
          2     3
         / \   / \
        4   5 6   7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        System.out.println("Height of the tree is: " + height(root));
        System.out.println("Count of nodes is: " + count(root));
        System.out.println("Sum of all nodes is: " + sum(root));
        System.out.println("Diameter of the tree is: " + diameter(root));
    }
}
