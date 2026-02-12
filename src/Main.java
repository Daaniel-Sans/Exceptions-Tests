import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un primer número (dividendo): ");
            int n1 = scanner.nextInt();
            System.out.print("Introduce un primer número (divisor): ");
            int n2 = scanner.nextInt();
            int resultado = n1 / n2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Debes introducir un número entero");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
        }

    }
}