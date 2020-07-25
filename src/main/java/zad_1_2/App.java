package zad_1_2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> list = List.of(
                "Marta",
                "Paweł",
                "Ania",
                "dorota",
                "Barbara",
                "Weronika",
                "ola",
                "Katarzyna",
                "krzysiek",
                "Gabrysia"
        );




        App app = new App();
        List<String> strings = app.sorTheList(list);
        System.out.println(strings);


        List<String> strings1 = app.orderByStringLength(list);
        System.out.println(strings1);

        Map<Integer, List<String>> integerListMap = app.groupingByLength(list);
        System.out.println(integerListMap);

    }

    private Map<Integer, List<String>> groupingByLength(List<String> strs) {
        return strs.stream().collect(Collectors.groupingBy(String::length));
    }


    private String stringToLoweCase(String s) {
        return s.toLowerCase();
    }

    public List<String> orderByStringLength(List<String> strs) {
        List<String> collect = strs.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        return collect;
    }

    public List<String> sorTheList(List<String> list) {
        return list.stream()
                .sorted(Comparator.comparing(this::stringToLoweCase).reversed())
                .collect(Collectors.toList());

    }

}
