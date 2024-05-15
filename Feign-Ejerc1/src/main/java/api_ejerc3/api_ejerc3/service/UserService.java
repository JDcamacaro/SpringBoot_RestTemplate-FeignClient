package api_ejerc3.api_ejerc3.service;

import org.bouncycastle.util.Integers;
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

    public void saveUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
    }

    public void updateUser(UserDTO userDTO) {
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    public void deleteUser(Integers id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

}
