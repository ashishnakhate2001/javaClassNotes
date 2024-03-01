import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String str1 = scanner.nextLine();


        String str2 = scanner.nextLine();

        System.out.println("Length of the first string is " + findStringLength(str1));
        System.out.println("Length of the second string is " + findStringLength(str2));

        System.out.println("The reverse of the first string is " + findStringReverse(str1));
        System.out.println("The reverse of the second string is " + findStringReverse(str2));

        System.out.println("The concatenated string is " + concatenateStrings(str1, str2));

        int comparisonResult = compareStrings(str1, str2);
        if (comparisonResult == 0) {
            System.out.println("Both the input strings are same");
        } else if (comparisonResult < 0) {
            System.out.println(str1 + " appears before " + str2);
        } else {
            System.out.println(str2 + " appears before " + str1);
        }
    }

    public static int findStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String findStringReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static String concatenateStrings(String str1, String str2) {
        String result = "";
        for (char c : str1.toCharArray()) {
            result += c;
        }
        for (char c : str2.toCharArray()) {
            result += c;
        }
        return result;
    }

    public static int compareStrings(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
            i++;
        }
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return 0;
    }
}