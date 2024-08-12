public class displacement{

    // This class calculates the displacement of a movement based on a string of directions.

    public static float disp(String path) {
        // Calculates the displacement from a given path string.

        int x = 0; // Initialize x-coordinate to 0.
        int y = 0; // Initialize y-coordinate to 0.

        for (int i = 0; i < path.length(); i++) {
            // Iterate through each character in the path string.
            char dir = path.charAt(i); // Extract the current direction character.

            // Handle each direction and update coordinates accordingly:
            if (dir == 'S') {
                // South direction: move down (decrease y).
                y--;
            } else if (dir == 'N') {
                // North direction: move up (increase y).
                y++;
            } else if (dir == 'W') {
                // West direction: move left (decrease x).
                x--;
            } else if (dir == 'E') {
                // East direction: move right (increase x).
                x++;
            } else {
                // Handle invalid direction characters (optional):
                System.err.println("Invalid direction character: " + dir);
                // You can throw an exception or take other actions here.
            }
        }

        // Calculate the final displacement as the Euclidean distance between (0, 0) and (x, y).
        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        // Example usage of the disp() method.

        String path = "WNEENESENNN"; // Sample path string.
        float displacement = disp(path); // Calculate displacement.

        System.out.println("Displacement for path '" + path + "': " + displacement);
    }
}
