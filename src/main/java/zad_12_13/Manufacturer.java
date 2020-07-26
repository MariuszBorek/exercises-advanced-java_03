package zad_12_13;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Manufacturer {
    private String name;
    private Integer year;
    private String country;
}
