import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text from the document");
        String documentText = scanner.nextLine();

        System.out.println("Enter the string to be found in the data");
        String gibberishText = scanner.nextLine().trim();

        if (documentText.contains(gibberishText)) {
            System.out.println("String is found in the document");
        } else {
            System.out.println("String is not found in the document");
        }
    }
}