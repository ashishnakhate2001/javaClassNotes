import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] matrix = new int[n][n];
    
    
    for (int i = 0; i < n; i++) {
    if (i%2 == 0){
    for (int j = 0; j < n; j++) {
    matrix[i][j] = i*n +j+ 1;
    }
    }else {
    for (int j = 0; j < n; j++) {
    matrix[i][j] = (i + 1) * n - j; 
    }
    }
    
}
    
    for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
    System.out.print(matrix[i][j]+" ");
    }
    
    
    System.out.println();
    }

    System.out.println(matrix[row - 1][col - 1]);
    }
}
