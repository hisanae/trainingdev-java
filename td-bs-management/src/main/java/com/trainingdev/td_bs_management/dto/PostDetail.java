package com.trainingdev.td_bs_management.dto;

import com.trainingdev.td_bs_management.enums.Feeling;
import com.trainingdev.td_bs_management.enums.Type;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDetail {

    @NotEmpty
    private int id;
    private int userId;
    private Type type;
    private Feeling feeling;
    private String description;
    private String image;
    private String creationDate;
    private String modificationDate;
    private Comment[] commentList;

}
