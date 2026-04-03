package Lista6;

import java.util.Scanner;

public class Exercicio1_Evento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroTotalDeConvidados;
        String nomeDoConvidado;

        System.out.println("Digite o numero total de convidados: ");
        numeroTotalDeConvidados = sc.nextInt();

        for (int i = 0; i < numeroTotalDeConvidados; i++) {
            System.out.println("Digite o nome do convidado: ");
            nomeDoConvidado = sc.next();
            System.out.println("Entrada liberada para: "+nomeDoConvidado);
        }
        System.out.println("Todos os convidados foram ");


    }
}
