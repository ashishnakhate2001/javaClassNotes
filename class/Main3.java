import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printPattern(n);
    }

    private static void printPattern(int n) {
 
        for (int i = 0; i < n / 3; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && j >= n / 3 && j < 2 * n / 3)
                    System.out.print('S');
                else
                    System.out.print('C');
            }
            System.out.println();
        }

     
        for (int i = 0; i < n / 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('S');
            }
            System.out.println();
        }

        
        for (int i = 0; i < n / 3; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n / 3 - 1 && j >= n / 3 && j < 2 * n / 3)
                    System.out.print('S');
                else
                    System.out.print('K');
            }
            System.out.println();
        }
    }
}