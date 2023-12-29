import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read start and end time
        int startHour = scanner.nextInt();
        int startMinute = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();

        // Calculate duration in minutes
        int durationInMinutes = ((endHour * 60 + endMinute) - (startHour * 60 + startMinute) + 24 * 60) % (24 * 60);

        // Print the result
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationInMinutes / 60, durationInMinutes % 60);

        scanner.close();
    }
}
