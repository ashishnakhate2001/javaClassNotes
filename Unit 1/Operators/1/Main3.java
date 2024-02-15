
import java.util.Scanner;

public class Main3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter branding expenses");
        float b = sc.nextFloat();

        System.out.println("Enter travel expenses");
        float t = sc.nextFloat();

        System.out.println("Enter food expenses");
        float f = sc.nextFloat();

        System.out.println("Enter logistics expenses");
        float l = sc.nextFloat();
        float total = b+t+f+l;

        System.out.printf("Total expenses : Rs.%.2f\n",total);
        System.out.printf("Branding expenses percentage : %.2f%%\n",((b/total)*100));
        System.out.printf("Travel expenses percentage : %.2f%%\n",((t/total)*100));
        System.out.printf("Food expenses percentage : %.2f%%\n",((f/total)*100));
        System.out.printf("Logistics expenses percentage : %.2f%%\n",((l/total)*100));
    }
}
