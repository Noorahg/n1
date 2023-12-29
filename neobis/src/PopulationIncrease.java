import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();
            double G1 = scanner.nextDouble() / 100.0;
            double G2 = scanner.nextDouble() / 100.0;

            int years = 0;

            while (PA <= PB && years <= 100) {
                PA += (int) (PA * G1);
                PB += (int) (PB * G2);
                years++;
            }

            System.out.println(years > 100 ? "Mais de 1 seculo." : years + " anos.");
        }

        scanner.close();
    }
}
