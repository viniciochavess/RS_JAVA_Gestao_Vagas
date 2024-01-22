package com.vinicio.vagas.Modules.Candidate;
import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
@Data
public class CandidateEntity {
    private UUID id;
    private String name;
    
    @Pattern(regexp = "^(?!\\s*$).+", message = "username não pode haver espaço")
    private String username;

    @Email(message = "O Campo deve conter um email valido")
    private String email;
    @Length(min = 6 , max = 10 , message = "min 6 max 10")
    private String password;
    private String description;
    private String curriculum;
}
