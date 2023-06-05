package com.pcrepairservice.pcservice.models.dtos;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String fistName;
    private String lastName;
    private String email;
}
