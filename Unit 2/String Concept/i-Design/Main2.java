import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input string");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        StringBuilder output = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            output.append(" ").append(words[i].toUpperCase());
        }

        System.out.println("The processed string is " + output);
    }
}