import java.util.Scanner;

public class BanknotesAndCoins {
    private static final int[] BANKNOTE_DENOMINATIONS = {10000, 5000, 2000, 1000, 500, 200};
    private static final int[] COIN_DENOMINATIONS = {100, 50, 25, 10, 5, 1};

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double value = scanner.nextDouble();
            int cents = (int) (value * 100);

            System.out.println("NOTAS:");
            cents = processDenominations(cents, BANKNOTE_DENOMINATIONS, " nota(s) de R$ ");

            System.out.println("MOEDAS:");
            processDenominations(cents, COIN_DENOMINATIONS, " moeda(s) de R$ ");
        }
    }

    private static int processDenominations(int amount, int[] denominations, String prefix) {
        for (int denomination : denominations) {
            amount = printAndReduce(amount, denomination, prefix);
        }
        return amount;
    }

    private static int printAndReduce(int amount, int denomination, String prefix) {
        int count = amount / denomination;
        System.out.println(count + prefix + String.format("%.2f", denomination / 100.0));
        return amount % denomination;
    }
}
