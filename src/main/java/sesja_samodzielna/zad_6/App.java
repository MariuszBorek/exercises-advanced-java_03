package sesja_samodzielna.zad_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = new ArrayList<>(List.of(
                23,
                12,
                1,
                4,
                15,
                18,
                13
        ));

        System.out.println(markEvenAndOddNumbers(listOfNumbers));
    }

    public static List<String> markEvenAndOddNumbers(List<Integer> list) {
        return list.stream().map(e -> e % 2 == 0 ? "e" + e : "o" + e).collect(Collectors.toList());
    }
}
