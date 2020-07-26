package zajecia.zad_14;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayService {

    public Set<Integer> getUniqueValues(Integer[] array) {
        return new HashSet<Integer>(Arrays.asList(array));
    }

    public Set<Integer> getNonUniqueValues(Integer[] array) {
        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(array));
        List<Integer> uniqueValues = new ArrayList<>();
        Set<Integer> nonUniqueValues = new HashSet<>();

        for(Integer e: arrayToList) {
            if(!uniqueValues.contains(e)) {
                uniqueValues.add(e);
            } else {
                nonUniqueValues.add(e);
            }
        }
        return nonUniqueValues;
    }

    public Map<Integer, Integer> countValues(Integer[] array) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(array));
        Map<Integer, Integer> counterOfValues = new HashMap<>();
        for (Integer e : listOfIntegers) {
            if(!counterOfValues.containsKey(e)) {
                counterOfValues.put(e, 1);
            } else {
                counterOfValues.put(e, counterOfValues.get(e) + 1);
            }
        }
        return counterOfValues;
    }

    public List<Map.Entry<Integer, Integer>> getTheMostRecurrentValues(Integer[] array, int limit) {
        return countValues(array).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(limit).collect(Collectors.toList());
    }

}
