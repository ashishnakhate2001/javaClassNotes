import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {

        // Fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of people");
        int a = sc.nextInt();

        int b= a/7;

        System.out.println("Number of attendees on day 1 : "+b*2);
        System.out.println("Number of attendees on day 2 : "+b*4);
        System.out.println("Number of attendees on day 3: "+b);
    }
}
