import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the event");
        String eventName = sc.nextLine();

        System.out.println("Enter the type of the event");
        String eventType = sc.nextLine();

        System.out.println("Enter the number of people expected");
        int expectedCount = sc.nextInt();

        System.out.println("Is it a paid entry? (Type Y or N)");
        char paidEntry = sc.next().charAt(0);

        System.out.println("Enter the projected expenses (in lakhs) for this event");
        double projectedExpenses = sc.nextDouble();

        System.out.println("Event Name : " + eventName);
        System.out.println("Event Type : " + eventType);
        System.out.println("Expected Count : " + expectedCount);
        System.out.println("Paid Entry : " + paidEntry);
        System.out.printf("Projected Expense : %.1fL\n", projectedExpenses);
    }
}