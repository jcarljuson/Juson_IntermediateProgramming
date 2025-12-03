import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double item1, item2, item3, total, discountedTotal;

        System.out.println("Enter price of item 1: ");
        item1 = scanner.nextDouble();

        System.out.println("Enter price of item 2: ");
        item2 = scanner.nextDouble();

        System.out.println("Enter price of item 3: ");
        item3 = scanner.nextDouble();

        total = item1 + item2 + item3;
        System.out.println("Original Total: " + total);

        if (total>500) {
            discountedTotal = total * 0.9;
            System.out.println("Discounted Total: " + discountedTotal);
        } else {
            System.out.println("No discount applied.");
        }

    }
}