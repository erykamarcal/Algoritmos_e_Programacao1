package Lista9;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de produtos?");
        int qtdDeProdutos = sc.nextInt();

        int [] estoque = new int[qtdDeProdutos];
        int cont = 0;
        for (int i = 0; i < qtdDeProdutos; i++) {
            System.out.println("Produtos em estoque: " + (i + 1) + ":" );
            estoque[i]= sc.nextInt();

            if (estoque[i] < 5){
                cont++;
            }
        }
        System.out.println("Produtos com estoque baixo: " + cont);
        sc.close();

    }
}

