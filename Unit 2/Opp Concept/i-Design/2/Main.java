import java.util.Scanner;
public class Main {
public static void main(String[] args) throws Exception {

// fill the code
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Customer Details");
System.out.println("Enter the name");
String n = sc.nextLine();
// fill the code
System.out.println("Enter the email");
String e = sc.nextLine();
// fill the code
System.out.println("Enter the type");
String t = sc.nextLine();
// fill the code
System.out.println("Enter the location");
// fill the code
String l = sc.nextLine();



Customer c = new Customer(n,e,t,l);

System.out.println("\nCustomer Details");
System.out.println("Name: "+c.getCustomerName() );
System.out.println("E-mail: "+c.getCustomerEmail());
System.out.println("Type: "+c.getCustomerType() );
System.out.println("Location: "+c.getCustomerLocation());

}
}