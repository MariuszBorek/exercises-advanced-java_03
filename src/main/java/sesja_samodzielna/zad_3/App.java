package sesja_samodzielna.zad_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(List.of(
                5.0,
                3.0,
                4.0
        ));
        getAverage(list).ifPresent(System.out::println);

    }

    public static Optional<Object> getAverage(List<Double> list) {
        return list.stream().reduce(Double::sum).map(e -> e / list.size());
    }
}
