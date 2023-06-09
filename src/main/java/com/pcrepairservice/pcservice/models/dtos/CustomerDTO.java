package com.pcrepairservice.pcservice.models.dtos;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class CustomerDTO {
    private Long id;
    private String fistName;
    private String lastName;
    private String email;
}
