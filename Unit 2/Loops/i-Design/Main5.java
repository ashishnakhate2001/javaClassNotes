import java.util.*;

class Main5{
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println("");
            b++;
        }
    }
}
