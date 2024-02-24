import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i++) {
            if(i%2==0 && i%3!=0 && i%5!=0) {
                System.out.print(i + " ");
            }
        }
    }
}