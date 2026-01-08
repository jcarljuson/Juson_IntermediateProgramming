import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] values = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                values[i][j] = random.nextInt(100) + 1;
            }
        }

        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();

        // 3. Search logic
        boolean found = false;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == searchNum) {
                    System.out.println("Number found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }
}