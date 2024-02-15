import java.util.Scanner;
public class Main6 {

public static void main(String[] args) {
    //fill your code here
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b= sc.nextInt();
    int c= sc.nextInt();

    int average =(a+b+c)/3;

    if(average>=90){
        System.out.println("The grade is A");
    }else if(average>=80){
        System.out.println("The grade is B");
    }else if(average>=70){
        System.out.println("The grade is C");
    }else if(average>=60){
        System.out.println("The grade is D");
    }else if(average>=50){
        System.out.println("The grade is E");
    }else{
        System.out.println("The grade is F");
    }
}
}
