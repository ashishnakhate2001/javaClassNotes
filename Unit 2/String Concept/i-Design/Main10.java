import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the content of the document");
        String document = scanner.nextLine();

        System.out.println("Enter the old name of the company");
        String oldName = scanner.nextLine();

        System.out.println("Enter the new name of the company");
        String newName = scanner.nextLine();

        String modifiedDocument = document.replace(oldName, newName);

        System.out.println("The content of the modified document is");
        System.out.println(modifiedDocument);
    }
}