package sesja_samodzielna.zad_4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>(List.of(
                "Karyna",
                "angelica",
                "Barbara",
                "grażyna"));
        System.out.println(toUpperCase(listOfStrings));

    }

    public static List<String> toUpperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
