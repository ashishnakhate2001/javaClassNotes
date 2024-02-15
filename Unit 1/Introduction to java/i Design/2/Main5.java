public class Main5 {

    public static void main(String args[]){
        int a,b,c;
        if( 2 == args.length){
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = a + b;
            System.out.println("The sum of "+a+" and "+b+" is "+c);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
