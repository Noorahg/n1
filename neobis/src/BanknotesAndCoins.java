import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();
        int cents = (int) (value * 100);

        System.out.println("NOTAS:");
        int[] denominations = {10000, 5000, 2000, 1000, 500, 200};
        for (int d : denominations) printAndReduce(cents, d, " nota(s) de R$ ");

        System.out.println("MOEDAS:");
        int[] coins = {100, 50, 25, 10, 5, 1};
        for (int c : coins) printAndReduce(cents, c, " moeda(s) de R$ ");

        scanner.close();
    }

    private static void printAndReduce(int amount, int denomination, String prefix) {
        int count = amount / denomination;
        System.out.println(count + prefix + String.format("%.2f", denomination / 100.0));
        amount %= denomination;
    }
}
