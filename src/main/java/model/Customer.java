package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private String id;
    private String title;
    private String name;
    private String address;
    private String city;
    private String province;
    private String postalCode;
}
