package Lista5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gorjetaRecebida;
        double valorTotalDeGorjeta = 0;

        System.out.print("Digite o valor da gorjeta: ");
        gorjetaRecebida = sc.nextDouble();

        while (gorjetaRecebida != 0) {
            valorTotalDeGorjeta += gorjetaRecebida;

            System.out.print("Gorjeta: ");
            gorjetaRecebida = sc.nextDouble();
        }

        System.out.println("Valor total recebido de gorjetas: " + valorTotalDeGorjeta);

        sc.close();
    }
}
