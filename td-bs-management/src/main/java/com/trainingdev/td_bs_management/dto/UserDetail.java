package com.trainingdev.td_bs_management.dto;

import com.trainingdev.td_bs_management.enums.Gender;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDetail {

    @NotEmpty
    private int id;
    private String name;
    private String birthday;
    private String password;
    private Gender gender;
    private String profilePhoto;
    private String coverPhoto;
    private String creationDate;
    private String modificationDate;

}
