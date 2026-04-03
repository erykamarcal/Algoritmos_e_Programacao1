package Lista6;

import java.util.Scanner;

public class Exercicio4_Economia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaDoValorGuardado = 0;

        System.out.println("Digite a quantia que será guardada por mês?: ");
        double valorMensal = sc.nextDouble();
        System.out.println("Por quantos meses?: ");
        int quantidadeDeMeses = sc.nextInt();

        for (int i = 1; i <= quantidadeDeMeses; i++) {
            somaDoValorGuardado = somaDoValorGuardado + valorMensal;
        }
        System.out.println("Total economizado: " + somaDoValorGuardado);
    }
}
