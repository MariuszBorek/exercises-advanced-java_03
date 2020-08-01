package notes.example_functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        Function<Employee, String> employeeToString = (employee) -> employee.getName();
        List<Employee> employees = Arrays.asList(new Employee("test"), new Employee("test2"));

        showEmployee(employees, employeeToString);
    }

    static void showEmployee(List<Employee> employees, Function<Employee, String> showFunction) {
        for (Employee employee : employees) {
            System.out.println(showFunction.apply(employee));;
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}