package Lista5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        int permitidos = 0;
        int negados = 0;

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        while (idade != -1) {
            if (idade >= 16) {
                permitidos++;
            } else {
                negados++;
            }

            System.out.print("Idade: ");
            idade = sc.nextInt();
        }

        System.out.println("Acessos permitidos: " + permitidos);
        System.out.println("Acessos negados: " + negados);

        sc.close();
    }
}