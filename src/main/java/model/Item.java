package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    private String code;
    private String description;
    private String size;
    private Double price;
    private int qtyOnHand;
}
