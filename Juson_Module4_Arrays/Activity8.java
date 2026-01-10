public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Displaying the Original Values
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
        
        // Get the size of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Creating a new matrix for the result
        int[][] transpose = new int[cols][rows];

        // using nested loop to swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Displaying the Transposed Values
        System.out.println("\nTransposed Matrix:"); 
        for (int[] row : transpose) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

