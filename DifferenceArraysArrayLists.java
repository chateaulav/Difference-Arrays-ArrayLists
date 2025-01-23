package week3;
// DifferenceArraysArrayLists.java
import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        try {
            // ArrayList Example
            // Dynamic size ArrayList
            ArrayList<Integer> arrayListValues = new ArrayList<>();
            arrayListValues.add(10);
            arrayListValues.add(20);
            arrayListValues.add(30);
            System.out.println("\nArrayList contents:");
            for (int i = 0; i < arrayListValues.size(); i++) {
                System.out.println("Index " + i + ": " + arrayListValues.get(i));
            }

            // Adding more elements to ArrayList (dynamic resizing)
            arrayListValues.add(40);
            arrayListValues.add(50);
            System.out.println("\nArrayList after adding more elements:");
            for (int i = 0; i < arrayListValues.size(); i++) {
                System.out.println("Index " + i + ": " + arrayListValues.get(i));
            }

            // Removing an element from ArrayList
            arrayListValues.remove(2); // Removes the element at index 2 (30)
            System.out.println("\nArrayList after removing element at index 2:");
            for (int i = 0; i < arrayListValues.size(); i++) {
                System.out.println("Index " + i + ": " + arrayListValues.get(i));
            }

            // Array Example
            // Fixed-size array of 5 integers
            int[] arrayValues = new int[5];
            arrayValues[0] = 10;
            arrayValues[1] = 20;
            arrayValues[2] = 30;
            System.out.println("Array contents:");
            for (int i = 0; i < arrayValues.length; i++) {
                System.out.println("Index " + i + ": " + arrayValues[i]);
            }
            // Trying to resize an array (will result in an error)
            arrayValues[5] = 50;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid index in the array.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}