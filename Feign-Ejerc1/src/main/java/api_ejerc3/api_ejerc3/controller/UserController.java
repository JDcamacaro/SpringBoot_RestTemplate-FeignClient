package api_ejerc3.api_ejerc3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import api_ejerc3.api_ejerc3.dto.UserDTO;
import api_ejerc3.api_ejerc3.service.UserService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import org.bouncycastle.util.Integers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @GetMapping
    //@ResponseStatus(HttpStatus.OK)
    public List<UserDTO> getAll() {
        //return new ResponseEntity<>(UserService.getUsers(), HttpStatus.OK);
        return userService.getUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void updateUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateUser(@PathVariable("id") Integers id, @RequestBody UserDTO userDTO) {
        userService.updateUser(userDTO);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable("id") Integers id) {
        userService.deleteUser(id);
    }

}
