package api_ejerc3.api_ejerc3.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import api_ejerc3.api_ejerc3.configuration.FeignClientConfig;
import api_ejerc3.api_ejerc3.dto.UserDTO;

@FeignClient(name = "USER-MOCK-API", url = "https://664257f63d66a67b34371716.mockapi.io/api_prueba1") //, configuration = FeignClientConfig.class
public interface UserFeignClient {

    @GetMapping() //value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE
    public List<UserDTO> getUsers();

    @PostMapping
    public void updateUser(@RequestBody UserDTO userDTO);

}
