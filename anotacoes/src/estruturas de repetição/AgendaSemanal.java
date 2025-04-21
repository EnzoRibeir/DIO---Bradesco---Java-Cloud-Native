import java.util.Scanner;

public class AgendaSemanal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = 1;

        do {
            System.out.print("Compromissos para o dia " + dia + ": ");
            String compromisso = scanner.nextLine();
            System.out.println("Agendado: " + compromisso);
            dia++;
        } while (dia <= 7);

        System.out.println("Semana agendada com sucesso!");
        scanner.close();
    }
}
