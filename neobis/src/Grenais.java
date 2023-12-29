import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grenais = 0, interWins = 0, gremioWins = 0, draws = 0;

        while (true) {
            int interGoals = scanner.nextInt();
            int gremioGoals = scanner.nextInt();

            if (interGoals > gremioGoals) interWins++;
            else if (gremioGoals > interGoals) gremioWins++;
            else draws++;

            grenais++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            if (scanner.nextInt() != 1) break;
        }

        System.out.println(grenais + " grenais");
        System.out.println("Inter:" + interWins);
        System.out.println("Gremio:" + gremioWins);
        System.out.println("Empates:" + draws);

        String winner = (interWins > gremioWins) ? "Inter venceu mais" :
                (gremioWins > interWins) ? "Gremio venceu mais" : "Não houve vencedor";
        System.out.println(winner);

        scanner.close();
    }
}

