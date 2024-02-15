import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("The two values after swapping are");
        System.out.println(a);
        System.out.println(b);
    }
}