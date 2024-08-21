package com.trainingdev.td_bs_management.dto;

import com.trainingdev.td_bs_management.enums.Gender;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @NotEmpty(message = "firstName cannot be empty")
    @Size(max = 20, message = "firstname cannot have more than 20 characters")
    private String firstName;

    @NotEmpty(message = "lastName cannot be empty")
    @Size(max = 20, message = "lastName cannot have more than 20 characters")
    private String lastName;

    @NotEmpty(message = "birthday cannot be empty")
    private String birthday;

    @NotEmpty(message = "email cannot be empty")
    @Size(max = 60, message = "email cannot have more than 20 characters")
    @Email
    private String email;

    @NotEmpty(message = "password cannot be empty")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
            message = "The password must have at least one uppercase letter, at least one lowercase letter, at least one number, at least one special character, minimum 8 characters.")
    private String password;

    @NotNull(message = "gender cannot be null")
    private Gender gender;

}
