package Lista8;

import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a placa: ");
        String placa = sc.next().toUpperCase().trim();
        placa = placa.toUpperCase();
        String placaMercoSul = "[A-Z]{3}[0-9][A-Z][0-9][0-9]";
        if (placa.matches(placaMercoSul)){
            System.out.println("Placa Válica!");
        }else{
            System.out.println("Placa inválida");
        }

    }
}
