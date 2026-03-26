package Lista5;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaCorreta = 1234;
        int senhaDigitada;
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();

            if (senhaDigitada == senhaCorreta) {
                System.out.println("Acesso permitido");
                break;
            }

            tentativas++;
        }

        if (tentativas == 3) {
            System.out.println("Acesso bloqueado");
        }

        sc.close();

    }
}
