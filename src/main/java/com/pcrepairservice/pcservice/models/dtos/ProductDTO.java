package com.pcrepairservice.pcservice.models.dtos;

import lombok.Data;
@Data
public class ProductDTO {
    private long id;
    private String model;
    private Double price;
    private String problem;
    private String solution;

}
