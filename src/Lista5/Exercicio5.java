package Lista5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorDoPedidp;
        double total = 0;
        int quantidade = 0;

        while (true) {
            System.out.print("Digite o valor do pedido: ");
            valorDoPedidp = sc.nextDouble();

            if (valorDoPedidp == 0) {
                break;
            }

            if (valorDoPedidp < 0) {
                continue; // nao sabia que existia isso :))
            }

            total += valorDoPedidp;
            quantidade++;
        }

        if (quantidade > 0) {
            System.out.println("Total vendido: " + total);
            System.out.println("Quantidade de pedidos: " + quantidade);
        } else {
            System.out.println("Nenhum pedido válido registrado");
        }

        sc.close();
    }
}

