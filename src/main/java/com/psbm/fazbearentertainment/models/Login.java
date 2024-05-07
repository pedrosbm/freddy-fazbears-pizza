package com.psbm.fazbearentertainment.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Login {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String senha;
}
