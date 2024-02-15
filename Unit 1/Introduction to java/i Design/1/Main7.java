import java.util.Scanner;
public class Main7 {

public static void main(String[] args) {
    //fill your code here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the binary number");
    String a = sc.nextLine();

    System.out.println("Enter the octal number");
    String b= sc.nextLine();

    System.out.println("Enter the hexadecimal number");
    String c= sc.nextLine();

    System.out.println("The integer value of the binary number "+a+" is "+Integer.valueOf(a,2));
    System.out.println("The integer value of the octal number "+b+" is " + Integer.valueOf(b,8)+"\n"+"The integer value of the hexadecimal number "+c+" is "+Integer.valueOf(c,16));

}
}
