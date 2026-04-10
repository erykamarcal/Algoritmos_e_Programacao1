package Lista8;

import java.util.Scanner;

public class Ghosting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a mensagem: ");
        String message = sc.nextLine();

        if (message.isBlank()){
            System.out.println("Erro: A mensagem não pode estar vazia!");
        } else {
            System.out.println("Mensagem enviada!");
            System.out.println("Tamanho: " + message.length() + " caracteres");
        }
    }

}
