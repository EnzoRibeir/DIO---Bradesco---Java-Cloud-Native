import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classse scaner
        // Exibir as mensagens para o usuario
        // Obter pela classe snacer os valores digitados no terminal 
        // Exibir a mensegem onta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o número da agencia: ");
        String numeroAgencia = scanner.next();
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +numeroAgencia+ ", conta " +numeroConta+ " e seu saldo de R$" +saldoConta+ " já está disponível para saque");
    }
}
