package edu.agt.entornoServidor.alumnosBD.ejercicioJPA1.repository;

import org.springframework.data.repository.CrudRepository;

import edu.agt.entornoServidor.alumnosBD.ejercicioJPA1.POJOS.Alumno;

public interface alumnoRepository extends CrudRepository<Alumno, Integer> {
	

}