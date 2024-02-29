import java.util.Scanner;
public class Main {

public static void main(String[] args){
//fill the code here
Scanner sc = new Scanner(System.in);

String ct;
System.out.println("Enter Customer Address");
System.out.println("Enter the street");
String s = sc.nextLine();

System.out.println("Enter the city");
String c = sc.nextLine();

System.out.println("Enter the pincode");
int p = sc.nextInt();
sc.nextLine();

System.out.println("Enter the country");
String ctt = sc.nextLine();

Address a = new Address(s,c,ctt,p);

a.displayAddress();

}
}