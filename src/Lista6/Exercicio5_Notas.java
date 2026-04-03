package Lista6;

import java.util.Scanner;

public class Exercicio5_Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma?");
        int quantidadeAluos = sc.nextInt();
        int somaDasNotas = 0;
        int quantidade = 0;
        for (int i = 1; i <= quantidadeAluos; i++) {
            System.out.println("Digite a nota do " + i + "o aluno: ");
            int nota = sc.nextInt();
            if (nota == -1){
                break;
            }
            if (nota < 0 || nota > 10){
                continue;
            }
            somaDasNotas += nota;
            quantidade++;
        }
        if (quantidade > 0) {
            System.out.println("Soma das notas: " + somaDasNotas);
            System.out.println("Quantidade de notas válidas: " + quantidade);
        } else {
            System.out.println("Nenhuma nota válida registrado");
        }

    }
}
