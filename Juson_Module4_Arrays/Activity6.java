public class Main {
    public static void main(String[] args) {
        int[][] values = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        System.out.println("Matrix:");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");

                rowSums[i] += values[i][j];
                colSums[j] += values[i][j];
            }
            System.out.println();
        }

        System.out.print("\nRow sums: ");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.print(rowSums[i] + (i < rowSums.length - 1 ? ", " : ""));
        }

        System.out.print("\nColumn sums: ");
        for (int i = 0; i < colSums.length; i++) {
            System.out.print(colSums[i] + (i < colSums.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}