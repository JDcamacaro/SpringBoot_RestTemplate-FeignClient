package com.jdcamacaro.microservicios_usuarios.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jdcamacaro.microservicios_usuarios.model.Alumno;

@Repository

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
