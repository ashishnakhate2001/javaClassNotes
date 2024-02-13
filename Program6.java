import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 5 subjects");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int d= sc.nextInt();
        int e= sc.nextInt();

        int percentage = (a+b+c+d+e)/5;

        if(percentage>89){
            System.out.println("Grade A");
        }
        else if(percentage>79){
            System.out.println("Grade B");
        }
        else if(percentage>69){


            System.out.println("Grade C");
        }
        else if(percentage>59){
            System.out.println("Grade D");
        }

        
        else if(percentage>49){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");

        }

        
    }
}
