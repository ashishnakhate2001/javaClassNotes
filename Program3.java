import java.util.*;

/**
 * This class demonstrates type casting in Java.
 */
public class Program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value");
        int a = sc.nextInt();

        float c = a; // implicit typecasting (low to high)

        System.out.printf("%.3f\n", c); //print 3 decimal places

        System.out.println("Enter float value");

        float b = sc.nextFloat(); 

        int d = (int) b; // explicit typecasting (high to low)

        System.out.println(d);
        
    }
}
