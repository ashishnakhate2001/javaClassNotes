import java.util.*;

class Main1 {
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println(a+" is an even number");
        } else {
            System.out.println(a+ " is an odd number");
        }
    }
}
