import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un primer número (dividendo): ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce un segundo número (divisor): ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                System.out.println("Haz el favor de no dividir por cero ¬¬");
            } else {
                double resultado = num1 / num2;
                System.out.println("El resultado es: " + resultado);
            }

        } catch (InputMismatchException e) {

            System.out.println("Error: No has introducido números válidos U.U");
        }
    }
}