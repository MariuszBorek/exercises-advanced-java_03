package zad_3;

import org.w3c.dom.ls.LSOutput;

import java.text.DateFormat;
import java.time.LocalDate;

public class StringFormat {
    public static void main(String[] args) {

        String name = "Adam";
        String lastName = "Kowalaski";
        Boolean status = true;
        LocalDate birthDate = LocalDate.of(1995, 1, 23);
        double salary = 7555.2;
        int high = 185;

        System.out.printf("|%-20s|%20s|%5s|%10s|%10.2f zł|%5d cm|\n", name, lastName, status, birthDate, salary, high); // znak - np w: "%-20s" justowanie do lewej
        System.out.printf("|%20s|%20s|%5s|%10s|%10.2f zł|%+5d cm|\n", name, lastName, status, birthDate, salary, high); // znak + np w: "%+5d" dodaje znak prze liczbą
        System.out.printf("|%20s|%20s|%5s|%10s|%10.2f zł|%-5d cm|\n", name, lastName, status, birthDate, salary, high);
        System.out.printf("|%20s|%20s|%5s|%10s|%10.2f zł|%5d cm|\n", name, lastName, status, birthDate, salary, high);
        System.out.printf("|%20s|%20s|%5s|%10s|%10.2f zł|%5d cm|\n", name, lastName, status, birthDate, salary, high);
    }
}
