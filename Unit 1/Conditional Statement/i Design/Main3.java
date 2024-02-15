import java.util.*;

class Main3{
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a%7 == 0 && a%3 == 0){
            System.out.println(a+" is divisible by both 7 and 3");
        } else {
            System.out.println(a+ " is not divisible by both 7 and 3");
        }
    }
}
