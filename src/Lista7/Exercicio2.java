package Lista7;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 10, 15, 20);
        nums.stream()
                .filter(n -> n > 10)
                .map(n -> n / 5)
                .toList()
                .forEach(System.out::println);

        //QUE LINGUA MAIA É ESSA? (mas entendi a ideia, genial)
    }
}
