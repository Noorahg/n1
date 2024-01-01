import java.util.Scanner;


public class Banknotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();
        System.out.println(value);

        int[] notes = {100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < notes.length; i++) {
            int count = value / notes[i];
            System.out.printf("%d nota(s) de R$ %d,00%n", count, notes[i]);
            value %= notes[i];
        }

        scanner.close();
    }
}

