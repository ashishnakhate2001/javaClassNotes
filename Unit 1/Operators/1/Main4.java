import java.util.Scanner;
public class Main4{

    public static void main(String[] args) {
        //fill your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Temparature in Celsius:");
        float a =sc.nextFloat();
        float f= a*9f/5f+32f;
        System.out.printf("Temparature in Fahrenheit is %.1fF\n",f);
    }
}
