package main;

import dao.PersonaDAO;
import dao.PersonaDAOImpl;
import model.Persona;
import dao.CRUD;

public class Main {
	public static void main(String[] args) {
		CRUD dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombre()));
		
		Persona per = new Persona();
		per.setNombre("alguien");
		dao.registrar(per);
	}
}
