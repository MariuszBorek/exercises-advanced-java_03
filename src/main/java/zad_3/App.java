package zad_3;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 12);
        map.put("PHP", 14);
        map.put("C++", 8);
        map.put("C#", 12);

        App.displayMap(map);


    }

    public static <K, V> void displayMap(Map<K, V> map) {
        String collect = map.keySet()
                .stream()
                .map(s -> String.format("Klucz: %s, Wartość: %d", s, map.get(s)))
                .collect(Collectors.joining(",\n"));

        System.out.println(collect + ".");

    }

}
