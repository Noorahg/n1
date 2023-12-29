import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt(), Y = scanner.nextInt();

        for (int i = 1, count = 0; i <= Y; i++, count++) {
            System.out.print(i + " ");
            if (count == X - 1) {
                System.out.println();
                count = -1;
            }
        }

        scanner.close();
    }
}
