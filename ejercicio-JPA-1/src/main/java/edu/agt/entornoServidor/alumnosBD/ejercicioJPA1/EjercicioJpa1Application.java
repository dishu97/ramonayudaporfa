package edu.agt.entornoServidor.alumnosBD.ejercicioJPA1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.agt.entornoServidor.alumnosBD.ejercicioJPA1.repository.*;
import edu.agt.entornoServidor.alumnosBD.ejercicioJPA1.POJOS.Alumno;

@SpringBootApplication
public class EjercicioJpa1Application implements CommandLineRunner {
	

	@Autowired
	private alumnoRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioJpa1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		//6º invocar al método, como devuelve una lista, tendremos que imprimirla (sysout)
		
	}
	
//5ºcambiar el void, ya que lo que devuelve el método, será una lista
private void buscarporEdad() {
	List<Alumno> lista = (List<Alumno>) repository.findAll();
	
	for(Alumno alumno : lista) {
		System.out.println(lista);
		//1º por cada alumno, acceder a su edad y comprobar que esté entre 20 y 25 años (if)
		
		
		
		//2º para almacenar los alumnos que tengan entre 20 y 25 años, necesitaremos una variables de tipo Lista, hay que instanciar una
		//3º meter los alumnos "válidos" en la lista
	}
	//4º retornar la lista
	
}



}