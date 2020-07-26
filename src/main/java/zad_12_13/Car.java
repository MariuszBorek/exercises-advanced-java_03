package zad_12_13;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
public class Car {
     private String brand;
     private String model;
     private double price;
     private int year;
     List<Manufacturer> manufacturerList;
     private EngineType engineType;
}
