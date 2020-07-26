package sesja_samodzielna.zad_7_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>(List.of(
                new Employee(1, "Bartek", 5234.23),
                new Employee(2, "Katarzyna", 7476.86),
                new Employee(3, "Mariusz", 30002.13),
                new Employee(3, "Marta", 2023.51),
                new Employee(3, "Grzegorz", 2999.95),
                new Employee(3, "Weronika", 1506.30)
                ));

        System.out.println("zadanie 7");
        System.out.println(listOfEmployee.stream().filter(e -> e.getSalary() > 30_000).findFirst().orElseThrow());

        System.out.println("\nzadanie 8");
        System.out.println(listOfEmployee.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

        System.out.println("\nzadanie 9");
        System.out.println(listOfEmployee.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList()));

    }
}
