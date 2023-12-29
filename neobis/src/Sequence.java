public class Sequence {
    public static void main(String[] args) {
        double i = 0.0;
        while (i <= 2.0) {
            double j = 1.0;
            while (j <= 3.0) {
                System.out.printf("I=%.1f J=%.1f\n", i, i + j);
                j++;
            }
            i += 0.2;
        }
    }
}
