package Lista5;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaDoAtendimento;
        int somaDasNotas = 0;
        int quantidade = 0;

        System.out.print("Nota: ");
        notaDoAtendimento = sc.nextInt();

        while (notaDoAtendimento != 0) {
            if (notaDoAtendimento >= 1 && notaDoAtendimento <= 5) {
                somaDasNotas += notaDoAtendimento;
                quantidade++;
            } else {
                System.out.println("Nota inválida! Digite de 1 a 5.");
            }

            System.out.print("Nota: ");
            notaDoAtendimento = sc.nextInt();
        }

        if (quantidade > 0) {
            double media = (double) somaDasNotas / quantidade;
            System.out.println("Média das avaliações: " + media);
        } else {
            System.out.println("Nenhuma avaliação registrada");
        }

        sc.close();
    }
}

