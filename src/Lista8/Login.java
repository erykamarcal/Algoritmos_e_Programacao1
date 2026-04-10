package Lista8;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorreto = "admin";
        String usuario;
        System.out.println("Digite seu nome de usuário: ");
        usuario = sc.nextLine().trim();
        if (usuario.equalsIgnoreCase(usuarioCorreto)){
            System.out.println("Acesso concedido ao sistema!");
        } else {
            System.out.println("Usuaário não reconhecido!");
        }
    }
}
