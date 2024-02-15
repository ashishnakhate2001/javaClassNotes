import java.util.Scanner;
public class Main5 {

public static void main(String[] args) {
//fill your code here
Scanner sc = new Scanner(System.in);

char a = sc.next().charAt(0);

if(Character.isUpperCase(a)){
System.out.println(a+" is uppercase letter");

}else if(Character.isLowerCase(a)){
System.out.println(a+" is lowercase letter");

}else{
System.out.println(a+" is neither an uppercase or lowercase letter");
}
}
}
