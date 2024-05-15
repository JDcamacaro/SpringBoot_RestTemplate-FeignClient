package api_ejerc2.api_ejerc2.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import api_ejerc2.api_ejerc2.dto.UserDTO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    @Value("${base-url}")
    private String basePath;

    private final RestTemplate restTemplate;

    public List<UserDTO> getAllUser() {
        UserDTO[] Response = restTemplate.getForObject(basePath, UserDTO[].class);
        return Arrays.asList(Response);
    }

    public void saveUser(UserDTO user) {
        restTemplate.postForObject(basePath, user, UserDTO.class);
    }

    public void updateUser(Integer id, UserDTO user) {
        restTemplate.put(basePath + "/" + id, user);
    }

    public void deleteUser(Integer id) {
        restTemplate.delete(basePath + "/" + id);
    }
}
