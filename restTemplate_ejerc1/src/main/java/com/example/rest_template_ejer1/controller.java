package com.example.rest_template_ejer1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor

public class controller {

    private final RestTemplate restTemplate;

    /*
     * @GetMapping("/test")
     * public Object getApi() {
     * String url ="https://jsonplaceholder.typicode.com/todos/1";
     * return restTemplate.getForObject(url, Object.class);
     * }
     */

    // peticion si no incluimos la capa model
    @GetMapping("/test/list")
    public List<Model> getListMode() {
        String url = "https://jsonplaceholder.typicode.com/todos";
        Model[] models = restTemplate.getForObject(url, Model[].class);
        return Arrays.asList(models);
    }

    @GetMapping("/test")
    public Model getApi() {
        String url = "https://jsonplaceholder.typicode.com/todos/1";
        return restTemplate.getForObject(url, Model.class);
    }
}
