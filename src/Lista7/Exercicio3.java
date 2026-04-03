package Lista7;

import java.util.Arrays;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("ana", "joao");
        nomes.stream()
                .map(nome -> nome.length())
                .toList()
                .forEach(System.out::println);

    }
}
