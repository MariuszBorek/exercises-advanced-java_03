package zad_4;

import java.util.*;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, List<String>> products;

    public Storage(Map<String, List<String>> map) {
        this.products = map;
    }

    public void addToStorage(String key, String value) {
//        if(!products.containsKey(key)) {
//            products.put(key, new ArrayList<>(List.of(value)));
//        } else {
//            List<String> currentProducts = products.get(key);
//            currentProducts.add(value);
//            products.put(key, currentProducts);

//        }
        products.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        System.out.println(products);
    }

    public void printValues(String key) {
        products.get(key).forEach(System.out::println);
//        products.forEach((key1, value) -> System.out.println(products.values()));
    }

    public List<String> findValue(String value) {
        List<String> keys = new ArrayList<>();
        products.forEach((k, v) -> {
            if(v.contains(value)) {
                keys.add(k);
            }
        });
        return keys;
    }


    public static void main(String[] args) {
        Storage storage = new Storage(new HashMap<>());
        storage.addToStorage("1", "P1");
        storage.addToStorage("2", "P2");
        storage.addToStorage("1", "P3");
        storage.addToStorage("3", "P4");
        storage.addToStorage("1", "P1");
        storage.addToStorage("5", "P1");
        storage.addToStorage("6", "P4");
        storage.addToStorage("7", "P4");
        storage.printValues("1");
        System.out.println(storage.findValue("P1"));
        System.out.println(storage.findValue("P4"));
        System.out.println(storage.findValue("P10"));
    }

}
