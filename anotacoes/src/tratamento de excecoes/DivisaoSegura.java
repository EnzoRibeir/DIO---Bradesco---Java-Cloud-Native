import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero!");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada.");
            scanner.close();
        }
    }
}
