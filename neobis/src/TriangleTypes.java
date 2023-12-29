import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sides = new double[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextDouble();
        }
        Arrays.sort(sides);
        double A = sides[2];
        double B = sides[1];
        double C = sides[0];

        //  type
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            classifyTriangle(A, B, C);
        }

        scanner.close();
    }

    //  type
    private static void classifyTriangle(double A, double B, double C) {
        //  right-angled
        if (A * A == B * B + C * C) {
            System.out.println("TRIANGULO RETANGULO");
        }

        //  obtuse-angled
        if (A * A > B * B + C * C) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        //  acute-angled
        if (A * A < B * B + C * C) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        //  equilateral
        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        //  isosceles
        if ((A == B && B != C) || (A != B && B == C)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
