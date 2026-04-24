package Lista9;

import java.util.Scanner;

public class Placar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de participantes? ");
        int qtdParticipantes = sc.nextInt();
        int[] placar = new int[qtdParticipantes];
        for (int i = 0; i < qtdParticipantes; i++) {
            System.out.println("Placar " + (i + 1) + ":");
            placar[i] = sc.nextInt();
        }
            int maior = placar[0];
            int menor = placar [0];

        for (int i = 1; i < qtdParticipantes; i++) {
            if (placar[i] > maior){
                maior = placar [i];
            }
            if (placar[i] < menor){
                menor = placar[i];
            }
        }
        System.out.println("Maior placar: " + maior);
        System.out.println("Menor placar: " + menor);

        sc.close();
    }
}
