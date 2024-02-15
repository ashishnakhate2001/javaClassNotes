import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c != 180) {
            System.out.println("Not a Triangle");
        } else if (a == b && b == c) {
            System.out.println("Triangle is equilateral");
        } else if (a == 90 || b == 90 || c == 90) {
            if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Triangle is right isosceles");
            } else {
                System.out.println("Triangle is right");
            }
        } else if ((a == b) || (b == c) || (a == c)) {
            System.out.println("Triangle is isosceles");
        } else {
            System.out.println("Triangle is not special");
        }
    }
}