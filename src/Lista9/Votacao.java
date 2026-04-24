package Lista9;

import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] votos = new int[3];

        System.out.println("Total de votos");
        int totalDeVotos = sc.nextInt();

        for (int i = 0; i < totalDeVotos; i++) {
            System.out.println("Voto: ");
            int voto = sc.nextInt();
            switch (voto) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                default:
                    System.out.println("Voto inválido.");
                    i--;
            }
        }
            for (int i = 0; i < 3 ; i++) {
                System.out.println("candidato" + (i + 1) + ": " + votos[i] + " votos");
            }
            int maior = votos[0];
            int vencedor = 1;

            for (int i = 1; i < 3; i++) {
                if (votos[i] > maior){
                maior = votos[i];
                vencedor = i+1;
            }
        }
        System.out.println("voto vencedor: candidato " + vencedor);


        sc.close();

    }
}
