import java.util.*;

class Main5 {
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number :");
        int a = sc.nextInt();
        if((a & 1) == 0){
            System.out.println(a+ " is even.");
        } else {
            System.out.println(a+" is odd.");
        }
    }
}
