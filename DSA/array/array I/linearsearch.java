

public class linearsearch { // Declaring a class named linearsearch

    public static int search(int[] array, int key) { // Declaring a method named search which takes an integer array and an integer key as arguments
        for (int i = 0; i < array.length; i++) { // Starting a for loop to iterate through the elements of the array
            if (array[i] == key) { // Checking if the current element of the array is equal to the key
                return i; // If found, returning the index of the element
            }
        }
        return -1; // If the key is not found, returning -1
    }

    public static void main(String[] args) { // Declaring the main method
        int array[] = { 2, 4, 6, 8, 10 }; // Declaring and initializing an integer array named array
        int key = 6; // Declaring and initializing an integer variable named key
        System.out.println(search(array, key)); // Calling the search method and printing its return value
    }
}
