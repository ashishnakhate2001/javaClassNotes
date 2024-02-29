import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Fill the matrix
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = j * n + i + 1;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = (j + 1) * n - i;
                }
            }
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       


       System.out.println("");
        System.out.println(matrix[row - 1][col - 1]);
    }
}