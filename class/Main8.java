import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Fill the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (i + 1) * n - j;
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Get the row and column to be printed
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        // Print the element at the specified row and column
        System.out.println(matrix[row - 1][col - 1]);
    }
}