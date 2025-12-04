import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numofFriends, quantity1, quantity2, quantity3, quantity4, quantity5;
        double subtotal, serviceCharge, totalBeforeDiscount, discountAmount, finalTotal, perHead, totalPrice, price1, price2, price3, price4, price5;

        System.out.print("Number of Friends: ");
        numofFriends = scanner.nextInt();

        boolean restart = true; // Flag to control the main loop

        if (numofFriends <= 1) {
            System.out.println("Input values above 1");
            System.exit(0);
        }

        System.out.print("\nMenu 1:");
        System.out.print("\nPrice: ₱");
        price1 = scanner.nextDouble();
        System.out.print("Quantity: ");
        quantity1 = scanner.nextInt();

        System.out.print("\nMenu 2:");
        System.out.print("\nPrice: ₱");
        price2 = scanner.nextDouble();
        System.out.print("Quantity: ");
        quantity2 = scanner.nextInt();

        System.out.print("\nMenu 3:");
        System.out.print("\nPrice: ₱");
        price3 = scanner.nextDouble();
        System.out.print("Quantity: ");
        quantity3 = scanner.nextInt();

        System.out.print("\nMenu 4:");
        System.out.print("\nPrice: ₱");
        price4 = scanner.nextDouble();
        System.out.print("Quantity: ");
        quantity4 = scanner.nextInt();

        System.out.print("\nMenu 5:");
        System.out.print("\nPrice: ₱");
        price5 = scanner.nextDouble();
        System.out.print("Quantity: ");
        quantity5 = scanner.nextInt();

        totalPrice = price1 + price2 + price3 + price4 + price5;

        subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3*quantity3) + (price4 * quantity4) + (price5 * quantity5);

        serviceCharge = subtotal * 0.05;
        totalBeforeDiscount = subtotal + serviceCharge;
        discountAmount = 0.15;

        if (totalBeforeDiscount >= 1000) {
            finalTotal = totalBeforeDiscount - (totalBeforeDiscount * discountAmount);
        } else {
            finalTotal = totalBeforeDiscount;
        }

        perHead = finalTotal / numofFriends;

        System.out.println("Subtotal: ₱" + subtotal);
        System.out.println("Service Charge(5%): " + serviceCharge);

        if (totalBeforeDiscount >= 1000) {
            System.out.println("Discount: 15%");
        } else {
            System.out.println("Discount: None");
        }
        System.out.println("Final Total: " + finalTotal);
        System.out.println("Amount per friend: ₱" + perHead);

    }
}