import java.util.*;

class Main7 {
    public static void main(String args[]) {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Richter Magnitude:");

        float a = sc.nextFloat();

        if(a>=8.0){
            System.out.println("Great");
        } else if(a>=7.0){
            System.out.println("Major");
        } else if(a>=6.1){
            System.out.println("Strong");
        } else if(a>=5.5){
            System.out.println("Moderate");
        } else if(a>=2.5){
            System.out.println("Light");
        } else if(a <= 2.4 ){
            System.out.println("Micro");
        }
    }
}
