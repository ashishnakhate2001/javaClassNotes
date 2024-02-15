import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int distinctCount = 0;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    break;
                }
            }

            // If no duplicate element found, increment distinctCount
            if (i == j) {
                distinctCount++;
            }
        }

        System.out.println(distinctCount);
    }
}