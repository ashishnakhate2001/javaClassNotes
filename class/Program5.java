import java.util.Scanner;
public class Program5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int a = sc.nextInt();

        if(a>18){
            System.out.println("You are eligible to vote");
        }
        else if(a==18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");}
    }
    
}
