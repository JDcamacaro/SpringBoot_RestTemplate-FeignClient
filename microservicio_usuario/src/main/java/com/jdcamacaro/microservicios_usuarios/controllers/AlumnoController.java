package com.jdcamacaro.microservicios_usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdcamacaro.microservicios_usuarios.model.Alumno;
import com.jdcamacaro.microservicios_usuarios.service.AlumnoService;

@RestController
@RequestMapping

public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public ResponseEntity<?> Listar() {
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> ver(@PathVariable Long id) {
        Optional<Alumno> o = service.findById(id);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(o.get());
    }

    @PostMapping
    public ResponseEntity<?> crear(@RequestBody Alumno alumno) {
        Alumno alumnoDB = service.save(alumno);
        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDB);
    }

    @PutMapping("{id}")
    public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
        Optional<Alumno> o = service.findById(id);
        if (o.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Alumno alumnoDB = o.get();
        alumnoDB.setApellido(alumno.getApellido());
        alumnoDB.setNombre(alumno.getNombre());
        alumnoDB.setEmail(alumno.getEmail());

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDB));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
