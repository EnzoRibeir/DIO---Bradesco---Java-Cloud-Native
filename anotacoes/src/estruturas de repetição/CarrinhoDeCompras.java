import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produto;
        int contador = 1;

        System.out.println("Digite os produtos (digite 'sair' para finalizar):");
        while (true) {
            System.out.print("Produto " + contador + ": ");
            produto = scanner.nextLine();

            if (produto.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println(produto + " adicionado ao carrinho!");
            contador++;
        }

        System.out.println("Finalizando compra...");
        scanner.close();
    }
}
