package com.pcrepairservice.pcservice.models.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class CustomerDTO {
    private long id;
    @NotBlank(message = "first name must not be blank")
    private String firstName;
    @NotBlank(message = "last name must not be blank")
    private String lastName;
    @NotBlank(message = "email must not be blank")
    private String email;
}
