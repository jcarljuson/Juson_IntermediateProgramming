import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 5;
        int[] numbers = new int[size];

        //using a loop to avoid repetitive codes of print and input
        System.out.println("Problem 4: ReverseaOneDimensionalArray");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Swapping the elements
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
        System.out.print("Original array: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }

        System.out.print("\nReversed Array: ");
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
