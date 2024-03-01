import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the code");
        String code = scanner.nextLine();

        StringBuilder formattedCode = new StringBuilder();

        String cityCode = code.substring(0, 2);
        switch (cityCode) {
            case "DH":
                formattedCode.append("DEL");
                break;
            case "MB":
                formattedCode.append("MUM");
                break;
            case "KL":
                formattedCode.append("KOL");
                break;
        }

        String referenceNumber = code.substring(2);
        while (referenceNumber.length() < 5) {
            referenceNumber = "0" + referenceNumber;
        }
        formattedCode.append(referenceNumber);

        System.out.println("Formatted code");
        System.out.println(formattedCode);
    }
}