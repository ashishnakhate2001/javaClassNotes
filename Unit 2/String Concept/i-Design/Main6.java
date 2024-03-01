import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String input = scanner.nextLine();

        System.out.println("Enter the string to be searched");
        String searchString = scanner.nextLine();

        int lastIndex = input.lastIndexOf(searchString);
        System.out.println("The index of last occurence of \"" + searchString + "\" is " + lastIndex);

        System.out.println("Enter the index limit");
        int indexLimit = scanner.nextInt();

        int limitedLastIndex = input.lastIndexOf(searchString, indexLimit);
        System.out.println("First occurence of \"" + searchString + "\" from " + indexLimit + "th index backwards is " + limitedLastIndex);
    }
}