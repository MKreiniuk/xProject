package cars_project.dto;

import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarAprDTO {
    @Id
    private int number;
    private String vin;
    private String brand;
    private String model;
    private boolean bumper;
    private boolean windscreen;
    private boolean clean;
    private int state;
    private String color;
    private int years;
    private int mileage;
    private int price;
}
