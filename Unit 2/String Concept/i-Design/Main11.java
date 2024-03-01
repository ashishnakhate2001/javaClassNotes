import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = scanner.nextLine();

        String processedString = input.replaceAll("\\s+", " ");

        System.out.println("The processed string is " + processedString);
    }
}