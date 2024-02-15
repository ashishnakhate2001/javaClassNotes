import java.util.*;

class Main2 {
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a%2 == 0 || a%3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
