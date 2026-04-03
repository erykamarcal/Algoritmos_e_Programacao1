package Lista6;

import java.util.Scanner;

public class Exercicio2_Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeDeProdutos;
        double valorProduto;
        double somaTotalDaCompra = 0;

        System.out.println("Quantos produtos você deseja comprar?");
        quantidadeDeProdutos = sc.nextInt();

        for (int i = 1; i <= quantidadeDeProdutos; i++) {
            System.out.println("Digite o valor do " + i + "o produto: ");
            valorProduto = sc.nextDouble();
            somaTotalDaCompra = somaTotalDaCompra + valorProduto;
        }
        System.out.println("Total da compra: " + somaTotalDaCompra);
    }
}
