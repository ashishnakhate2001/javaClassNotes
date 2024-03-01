import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = scanner.nextLine();

        System.out.println("Enter the start string");
        String startString = scanner.nextLine();

        if (input.startsWith(startString)) {
            System.out.println("\"" + input + "\" starts with \"" + startString + "\"");
        } else {
            System.out.println("\"" + input + "\" does not start with \"" + startString + "\"");
        }
    }
}