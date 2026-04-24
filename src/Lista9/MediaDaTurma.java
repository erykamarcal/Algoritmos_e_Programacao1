package Lista9;

import java.util.Scanner;

public class MediaDaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o numero de alunos?");
        int numeroDeAlunos = sc.nextInt();

        double[]notas = new double[numeroDeAlunos];
        double somaNotas = 0;
        for (int i = 0; i < numeroDeAlunos; i++) {
            System.out.println("Notas do aluno: " + (i + 1) + ":" );
            notas[i]= sc.nextDouble();
            somaNotas = somaNotas + notas[i];

        }
        double mediaDaTurma = somaNotas/ numeroDeAlunos;
        System.out.println("Media da turma: " + mediaDaTurma);
        sc.close();

    }
}
