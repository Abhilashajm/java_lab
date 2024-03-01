import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElement{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Get array elements from the user
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find duplicates and their positions
        Map<Integer, Integer> elementToIndex = new HashMap<>();
        boolean hasDuplicates = false;

        for (int i = 0; i < size; i++) {
            int currentElement = array[i];

            if (elementToIndex.containsKey(currentElement)) {
                System.out.println("Duplicate found at positions " +
                        elementToIndex.get(currentElement) + " and " + (i + 1) + ": " + currentElement);
                hasDuplicates = true;
            } else {
                elementToIndex.put(currentElement, i + 1);
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicates found in the array.");
        }
    }
}