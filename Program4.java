import java.lang.Byte;
import java.lang.Integer;

/**
 * This class demonstrates the declaration and printing of different type variables and their values, size and range.
 */
public class Program4 {

    public static void main(String[] args) {
        // variables
        byte a = 2;
        int b = 2;
        long c = 2;
        float d = 2.5f;
        double e = 2.5d;
        boolean f = true;
        char g = 'c';
        String h = "Hello";

        // print variables and their values, size and range
        System.out.println("Print variables and their values, size and range:");
        System.out.println("byte a = " + a + ", size: " + Byte.SIZE + ", range: " + Byte.MAX_VALUE + " to " + Byte.MIN_VALUE);
        System.out.println("int b = " + b + ", size: " + Integer.SIZE + ", range: " + Integer.MAX_VALUE + " to " + Integer.MIN_VALUE);
        System.out.println("long c = " + c + ", size: " + Long.SIZE + ", range: " + Long.MAX_VALUE + " to " + Long.MIN_VALUE);
        System.out.println("float d = " + d + ", size: " + Float.SIZE + ", range: " + Float.MAX_VALUE + " to " + Float.MIN_VALUE);
        System.out.println("double e = " + e + ", size: " + Double.SIZE + ", range: " + Double.MAX_VALUE + " to " + Double.MIN_VALUE);
        System.out.println("boolean f = " + f + ", size: " + "1 bit" + ", range: " + "true or false");
        System.out.println("char g = " + g + ", size: " + Character.SIZE + ", range: " + Character.MAX_VALUE + " to " + Character.MIN_VALUE);
        System.out.println("String h = " + h + ", size: " + "depends on the length of the string" + ", range: " + "depends on the length of the string");
        System.out.println("");
    }
}

   