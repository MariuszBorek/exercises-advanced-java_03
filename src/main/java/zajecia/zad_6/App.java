package zajecia.zad_6;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Map<Integer, String> strs = new TreeMap<>();
        strs.put(10, "P1");
        strs.put(3, "P0");
        strs.put(4, "P5");
        strs.put(2, "P4");
        App.displayFirstAndLastElement(strs);

    }

    public static <K, V> void displayFirstAndLastElement(Map<K,V> treeMap) {
        List<Map.Entry> entries = new ArrayList<>(treeMap.entrySet());
        System.out.println(entries.get(0));
        System.out.println(entries.get(entries.size() -1));

//        System.out.println("Pierwszy ES: " + treeMap.entrySet()
//                .stream()
//                .findFirst()
//                .get());
//


    }
}
