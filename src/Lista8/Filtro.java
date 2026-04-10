package Lista8;

import java.util.Scanner;

public class Filtro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opniaoCensurada;
        System.out.println("Qual sua opnião sobre o sistema? ");
        String opniaoDoUsuario = sc.nextLine().toLowerCase();

        if (opniaoDoUsuario.contains("ruim")){
            opniaoCensurada = opniaoDoUsuario.replace("ruim", "****");
            System.out.println("Seu comentário foi marcado para revisão! ");
            System.out.println(opniaoCensurada);
    } else if (opniaoDoUsuario.contains("horrivel")){
            opniaoCensurada = opniaoDoUsuario.replace("horrivel", "****");
            System.out.println("Seu comentário foi marcado para revisão! ");
            System.out.println(opniaoCensurada);
        } else {
            System.out.println("Comentário publicado com sucesso!");
        }

    }
}
