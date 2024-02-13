import java.util.Scanner;

class Circle {
    public static float calArea(float radius) {
        float pi=22f/7f;
        return radius * radius *pi;
    }
}

public class Main5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        float radius = sc.nextFloat(); 
        float area = Circle.calArea(radius);
        System.out.printf("The area of circle is %.2f.", area);
        sc.close();
    }
}
