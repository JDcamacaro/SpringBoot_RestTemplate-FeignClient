package api_ejerc3.api_ejerc3.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {

    private Long Id;
    private String name;
    private String lastname;
    private String email;

}
