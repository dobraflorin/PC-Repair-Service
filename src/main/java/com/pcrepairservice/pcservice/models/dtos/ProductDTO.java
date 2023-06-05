package com.pcrepairservice.pcservice.models.dtos;

import lombok.Data;

import java.io.Serializable;
@Data
public class ProductDTO implements Serializable {
    private long id;
    private String model;
    private String price;
    private String problem;
    private String solution;

}
