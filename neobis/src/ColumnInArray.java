import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the column to be considered
        int column = scanner.nextInt();

        // Read the operation type ('S' for Sum or 'M' for Average)
        char operationType = scanner.next().charAt(0);

        // Initialize the 2D array
        double[][] M = new double[12][12];

        // Read array elements
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        // Calculate sum or average based on the specified column
        double result = 0;
        for (int i = 0; i < 12; i++) {
            result += M[i][column];
        }

        if (operationType == 'M') {
            result /= 12.0;
        }

        // Print the result with one digit after the decimal point
        System.out.printf("%.1f\n", result);

        scanner.close();
    }
}

