import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = scanner.nextLine();

        System.out.println("Enter the end string");
        String endString = scanner.nextLine();

        if (input.endsWith(endString)) {
            System.out.println("\"" + input + "\" ends with \"" + endString + "\"");
        } else {
            System.out.println("\"" + input + "\" does not end with \"" + endString + "\"");
        }
    }
}