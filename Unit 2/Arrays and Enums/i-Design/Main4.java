import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the location where you wish to delete an element");
        int index = scanner.nextInt();

        if (index < 1 || index > n) {
            System.out.println("Invalid Input");
        } else {
           
            for (int i = index - 1; i < n - 1; i++) {
                array[i] = array[i + 1];
            }

            System.out.println("Array after deletion is");
            for (int i = 0; i < n - 1; i++) {
                System.out.println(array[i]);
            }
        }
    }
}