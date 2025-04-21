import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double preco = 0;

        try {
            System.out.print("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            preco = Double.parseDouble(scanner.nextLine());

            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("Nome: " + nome + " | Preço: R$" + preco);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Digite um valor numérico válido para o preço.");
        } finally {
            scanner.close();
        }
    }
}
