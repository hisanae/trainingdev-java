package com.trainingdev.td_bs_management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserComment {
    private int id;
    private String name;
    private String profilePhoto;
}
