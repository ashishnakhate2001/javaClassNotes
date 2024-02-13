import java.util.Scanner;
public class Main6{

public static void main(String[] args) {
//fill your code here
Scanner sc = new Scanner(System.in);

System.out.println("Enter an integer");
int a = sc.nextInt();
byte b = (byte) a;
short c=(short) a;
long d =a;
float e =a;
double f=a;

System.out.println("The binary equivalent of "+a+" is "+Integer.toBinaryString(a));
System.out.println("The hexadecimal equivalent of "+a+" is "+ Integer.toHexString(a));
System.out.println("The octal equivalent of "+a+" is "+Integer.toOctalString(a));
System.out.println("Byte value of "+a+" is "+ b);
System.out.println("Short value of "+a+" is "+c);
System.out.println("Long value of "+a+" is "+d);
System.out.println("Float value of "+a+" is "+e);
System.out.println("Double value of "+a+" is "+f);
}
}
