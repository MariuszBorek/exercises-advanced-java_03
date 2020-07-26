package zad_12_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CarService {
    private List<Car> cars = new ArrayList<>(Arrays.asList(
            new Car(
                    "VW", "Passat", 150_000, 2019,
                    new ArrayList<>(Arrays.asList(new Manufacturer("VAG", 2019, "GER"))),
                    EngineType.V8),
            new Car(
                    "Ferrari", "360", 700_000, 2018,
                    new ArrayList<>(Arrays.asList(
                            new Manufacturer("Ferrari", 2018, "ITA"),
                            new Manufacturer("Lamborgini", 2017, "ITA")
                    )),
                    EngineType.V12),
            new Car(
                    "Fiat", "Panda", 30_000, 2016,
                    new ArrayList<>(Arrays.asList(
                            new Manufacturer("Ferrari", 2011, "ITA"),
                            new Manufacturer("Fiat", 2014, "ITA"),
                            new Manufacturer("Renault", 2011, "FRA")
                    )),
                    EngineType.S3),
            new Car("Nissan", "GTR", 550_000, 2020,
                    new ArrayList<>( Arrays.asList(new Manufacturer("Nissan", 2020, "JAP"))),
                    EngineType.S6)
    ));

    public void getAllCars(List<Car> cars) {
        final int[] id = {1};
        cars.forEach(car -> System.out.printf("Id: %-2d Marka: %-15s Model: %-10s Cena: %10.2f zł Rok: %-4d Producenci: %-80s Engine: %-5s\n",
                id[0]++,
                car.getBrand(), car.getModel(), car.getPrice(), car.getYear(),
                car.getManufacturerList().stream()
                        .map(manufacturer -> String.format("nazwa: %s Kraj: %s",
                                manufacturer.getName(), manufacturer.getCountry())).collect(Collectors.joining(", ")),
                car.getEngineType()));
    }

    public void removeCarByIndex(int index) {
        try {
            cars.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego samochodu");
        }

    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream().filter(car -> car.getEngineType() == EngineType.V12).collect(Collectors.toList());
    }

    public List<Car> getCarsManufacturedBefore1999() {
        return cars.stream().filter(car -> car.getYear() < 1999).collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        List<Car> collect = cars.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
        return collect.get(collect.size() -1);
    }

    public Car getTheCheapestCar() {
        List<Car> collect = cars.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
        return collect.get(0);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        return cars.stream().filter(car -> car.getManufacturerList().size() == 3).collect(Collectors.toList());
    }

    public List<Car> sortAscending(boolean isAscending) {
        if(isAscending) {
            return cars.stream().sorted(Comparator.comparing(car -> car.getBrand())).collect(Collectors.toList());
        } else {
            return null;
        }
    }

    public List<Car> isExist(String model) {
        return cars.stream().filter(car -> car.getBrand().equals(model)).collect(Collectors.toList());
    }

    public List<Car> findByManufacturer(Manufacturer manufacturer) {
        return cars.stream().filter(car -> car.getManufacturerList().contains(manufacturer)).collect(Collectors.toList());
    }

    public List<Car> findByManufacturerAndYear(Manufacturer manufacturer, int year) {
        return cars.stream().filter(car -> car.getManufacturerList().contains(manufacturer)).filter(car -> car.getYear() == year).collect(Collectors.toList());
    }






}
