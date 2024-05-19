package api_ejerc3.api_ejerc3.service;

import org.springframework.stereotype.Service;
import api_ejerc3.api_ejerc3.client.UserFeignClient;
import api_ejerc3.api_ejerc3.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserFeignClient userFeignClient;

    public List<UserDTO> getUsers(){
        List<UserDTO> response = userFeignClient.getUsers();
        return response;
    }

    public UserDTO byId(Long id){
/*         UserDTO userDTO = UserFeignClient.getById();
        return userDTO; */
        return UserFeignClient.getById(id);
    }

    public void saveUser(UserDTO userDTO) {
        //userFeignClient.getById();
        
    }

    public void updateUser(UserDTO userDTO) {
    }

    public void deleteUser(Long id) {
    }

}
