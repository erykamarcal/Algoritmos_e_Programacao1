package Lista6;

import java.util.Scanner;

public class Exercicio3_Avaliacoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int notaDoAtendimento;
        int avaliacoesPositivas = 0;
        int avaliacoesNegativas = 0;


        System.out.print("Qual a quantidade de notas a serem avaliadas?: ");
        quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a " + i + "a nota: ");
            notaDoAtendimento = sc.nextInt();
            if (notaDoAtendimento >= 1 && notaDoAtendimento <= 5) {
                if (notaDoAtendimento >= 4) {
                    avaliacoesPositivas++;
                }else {
                    avaliacoesNegativas++;
            }
            } else {
                System.out.println("Nota inválida! Digite de 1 a 5.");
            }
        }
        System.out.println("Avaliações positivas: "+ avaliacoesPositivas);
        System.out.println("Avaliações Negativas: "+ avaliacoesNegativas);
        sc.close();
    }
}
