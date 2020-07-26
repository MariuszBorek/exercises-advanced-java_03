package sesja_samodzielna.zad_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(List.of(
                "Karyna",
                "Angelica",
                "ala",
                "Barbara",
                "Grażyna",
                "Ana",
                "aro",
                "bernadetta",
                "afp"
                ));
        System.out.println(getStringStartWithA(listOfStrings));
    }

    public static List<String> getStringStartWithA(List<String> list) {
        return list.stream().filter(e -> e.startsWith("a") && e.length() == 3).collect(Collectors.toList());
    }
}
