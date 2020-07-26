package zajecia.zad_5;

import java.util.HashSet;
import java.util.Set;

public class SDAHashSet<E> extends HashSet<E> {

    @Override
    public boolean add(E e) {
        return super.add((E) ("SDA:" + e));
    }

    public static void main(String[] args) {
        Set<String> sdaHashSet = new SDAHashSet<>();

        sdaHashSet.add("1");
        sdaHashSet.add("2");
        System.out.println(sdaHashSet.add("3"));
        System.out.println(sdaHashSet.add("3")); // zwróci false, bo juz element istnieje
        sdaHashSet.add("4");
        sdaHashSet.remove("SDA:2");
        System.out.println(sdaHashSet);

        Set<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        System.out.println(hashSet);

    }

}
