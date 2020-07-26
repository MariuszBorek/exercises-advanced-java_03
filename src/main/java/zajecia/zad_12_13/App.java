package zajecia.zad_12_13;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.removeCarByIndex(0);
        carService.removeCarByIndex(6);
        carService.addCar(new Car("Toyota", "RAV4", 200_000, 1998,
                new ArrayList<>( Arrays.asList(new Manufacturer("Toyota", 2020, "JAP"))),
                EngineType.V8));
        carService.getAllCars(carService.getCars());
        System.out.println("-------------");
        System.out.println(carService.getCarsWithV12Engine());
        System.out.println("-------------");
        carService.getAllCars(carService.getCarsWithV12Engine()); // wykorzystanie juz przygotowanej metody do wyswietlania
        System.out.println("------");
        carService.getAllCars(carService.getCarsManufacturedBefore1999());
        System.out.println("---------------");
        carService.getAllCars(Arrays.asList(carService.getMostExpensiveCar()));
        carService.getAllCars(Arrays.asList(carService.getTheCheapestCar()));

        System.out.println("\nSESJA SAMODZIELNA");
        System.out.println("-------------- 8. zwracanie auta z co najmniej 3 producentami");
        carService.getAllCars(carService.getCarsWithAtLeastThreeManufacturers());

        System.out.println("-------------- 9. zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco");
        carService.getAllCars(carService.sortAscending(true));

        System.out.println("-------------- 10. sprawdzanie czy konkretne auto znajduje się na liście");
        carService.getAllCars(carService.isExist("Ferrari"));

        System.out.println("-------------- 11. zwracanie listy aut wyprodukowanych przez konkretnego producenta");
        carService.getAllCars(carService.findByManufacturer(new Manufacturer("Toyota", 2020, "JAP")));

        System.out.println("-------------- 12. zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.");
        carService.getAllCars(carService.findByManufacturerAndYear(new Manufacturer("Toyota", 2020, "JAP"), 1998));

    }
}
