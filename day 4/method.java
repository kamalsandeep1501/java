import java.util.Arrays;
import java.util.OptionalInt;

public class method {
    public static void main(String[] args) {
        // Create and initialize an array
        int[] numbers = {5, 2, 8, 1, 3};
        System.out.println("Original array: " + Arrays.toString(numbers));
        
        // 1. Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        
        // 2. Binary search
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);
        
        // 3. Copying the array
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));
        
        // 4. Copying a range of the array
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range copy (indices 1 to 3): " + Arrays.toString(rangeCopy));
        
        // 5. Filling the array
        Arrays.fill(numbers, 10);
        System.out.println("Array after fill: " + Arrays.toString(numbers));
        
        // 6. Checking if two arrays are equal
        int[] anotherArray = {10, 10, 10, 10, 10};
        System.out.println("Arrays are equal: " + Arrays.equals(numbers, anotherArray));
        
        // 7. Converting array to a list
        Arrays.asList(anotherArray);
        System.out.println(Arrays.toString(anotherArray));
        
        // 8. Handling multi-dimensional arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("2D array: " + Arrays.deepToString(matrix));

        // fiding maximum
        OptionalInt maxStream =Arrays.stream(numbers).max();
        System.out.println("Maximum value (Stream):"+(maxStream.isPresent() ? maxStream.getAsInt():"0"));

        // Finding minimum
        OptionalInt minStream =Arrays.stream(numbers).min();
        System.out.println("Minimum value (Stream): " + (minStream.isPresent() ? minStream.getAsInt() : "No min found"));

        // Finding sum
        int sumStream = Arrays.stream(numbers).sum();
        System.out.println("Sum of elements (Stream): " + sumStream);
    }
}
