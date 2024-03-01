import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("The words in the string are");
        for (String word : words) {
            System.out.println(word);
        }
    }
}