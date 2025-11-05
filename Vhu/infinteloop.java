import java.util.Scanner;

public class infinteloop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        String choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }

            System.out.print("Want to enter another number? (yes/no): ");
            choice = scanner.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("\nSummary:");
        System.out.println("Positive numbers: " + positives);
        System.out.println("Negative numbers: " + negatives);
        System.out.println("Zeros: " + zeros);

        scanner.close();
        
        do{
            System.out.println("123");
        }
        while(true);
    }
}
