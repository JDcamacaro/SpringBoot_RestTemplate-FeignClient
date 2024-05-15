package com.example.rest_template_ejer1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Model {


    private Long UserId;
    private Long Id;
    private String Title;
    private Boolean Completed;

}
