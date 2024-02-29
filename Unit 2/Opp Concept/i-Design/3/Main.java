import java.util.*;

class Customer{
public String customerName;
public String customerEmail;
public String customerType;
public String customerAddress;

	Customer(String n, String e, String t, String l){
		customerName = n;
		customerEmail = e;
		customerType = t;
		customerAddress = l;
}

	void displayDetails(){
		System.out.println("Name: "+customerName);
		System.out.println("E-mail: "+customerEmail);
		System.out.println("Type: "+customerType);
		System.out.println("Location: "+customerAddress);
	}
}

public class Main {

public static void main(String[] args) {

//Fill your code here
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Customer Details");
System.out.println("Enter the name");
String n = sc.nextLine();

System.out.println("Enter the email");
String e = sc.nextLine();

System.out.println("Enter the type");
String t = sc.nextLine();

System.out.println("Enter the location");
String l = sc.nextLine();

Customer c = new Customer(n,e,t,l);

c.displayDetails();
}
}