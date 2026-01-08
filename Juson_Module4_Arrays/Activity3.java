import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        long sum = 0;
        int max = values[0][0];
        int count = 0;

        System.out.println("Matrix: ");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");

                sum += values[i][j];
                if (values[i][j] > max) {
                    max = values[i][j];
                }
                count++;
            }
            System.out.println();
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Largest value: " + max);
    }
}