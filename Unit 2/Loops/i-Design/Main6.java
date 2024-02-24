import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int n = sc.nextInt();
        int k = 2;
        for(int i = 0; i < n/2-1; i++) {
            for(int j = 0; j < n/2-i; j++) {
                System.out.print("C ");
            }
            for(int j = 0; j < k*i; j++) {
                System.out.print("S ");
            }
            for(int j = 0; j < n/2-i; j++) {
                System.out.print("C ");
            }
            System.out.println();
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < n; j++) 
            {
                System.out.print("S ");
            }
            System.out.println();
        }

        for(int i = n/2-2; i >= 0; i--) {
            for(int j = 0; j < n/2-i; j++) {
                System.out.print("k ");
            }
            for(int j = 0; j < k*i; j++) {
                System.out.print("S ");
            }
            for(int j = 0; j < n/2-i; j++) {
                System.out.print("k ");
            }
            System.out.println();
        }
    }
}

