import java.util.*;

class Main1 {
    public static void main(String[] args) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Enter the cost of the item");
        a = sc.nextInt();

        System.out.println("Enter the number of items");
        b = sc.nextInt();
        System.out.println("Total cost is Rs." + a * b);
    }
}
