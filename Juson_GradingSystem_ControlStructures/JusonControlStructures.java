import java.util.Scanner;

public class JusonControlStructures {

    private static String lastGrade = "N/A";
    private static String lastRemarks = "N/A";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("\nInvalid input! Please enter a number for your choice.");
                scanner.nextLine();
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    processNewScore(scanner);
                    break;
                case 2:
                    displayLastGrade();
                    break;
                case 3:
                    System.out.println("\nThank you for using the Student Grading System. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid option. Please choose 1, 2, or 3.");
            }
            
            if (choice != 3) {
                 System.out.println("\n" + "-".repeat(40)); 
            }

        } while (choice != 3);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("\n===== Student Grading System =====");
        System.out.println("1. Enter new score");
        System.out.println("2. Display last grade and remarks");
        System.out.println("3. Exit program");
        System.out.print("Choose an option: ");
    }

    public static void processNewScore(Scanner scanner) {
        System.out.print("\nEnter student score (0-100): ");
        int score;

        if (scanner.hasNextInt()) {
            score = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Invalid input! Score must be an integer.");
            scanner.nextLine();
            lastGrade = "N/A";
            lastRemarks = "N/A";
            return;
        }

        if (score < 0 || score > 100) {
            System.out.println("Error: Score must be between 0 and 100.");
            lastGrade = "N/A";
            lastRemarks = "N/A";
            return;
        }

        if (score >= 90) {
            lastGrade = "A";
        } else if (score >= 80) {
            lastGrade = "B";
        } else if (score >= 70) {
            lastGrade = "C";
        } else if (score >= 60) {
            lastGrade = "D";
        } else {
            lastGrade = "F";
        }

        lastRemarks = "";
        if (lastGrade.equals("A")) {
            if (score >= 95) {
                lastRemarks = "Excellent!";
            }
        } else if (lastGrade.equals("F")) {
            if (score < 40) {
                lastRemarks = "Needs Improvement!";
            }
        }
        
        if (lastRemarks.isEmpty()) {
            lastRemarks = "None";
        }

        System.out.println("Grade: " + lastGrade);
        System.out.println("Remarks: " + lastRemarks);
    }

    public static void displayLastGrade() {
        System.out.println("\nLast Grade: " + lastGrade);
        System.out.println("Remarks: " + lastRemarks);
    }

}
