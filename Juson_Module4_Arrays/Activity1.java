import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 5;
        int[] numbers = new int[size];

        //using a loop to avoid repetitive codes of print and input
        System.out.println("Problem 1: One-Dimensional Array");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int lowest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        //Calculating the average socre
        long sum = 0;
        double average = 0;
        for (int number : numbers) {
            sum += number;
            int count = numbers.length;
            average = sum / count;
        }
        System.out.println("Average Score: " + average);
        System.out.println("Max Score: " + max);
        System.out.println("Lowest Score: " + lowest);
    }
}
