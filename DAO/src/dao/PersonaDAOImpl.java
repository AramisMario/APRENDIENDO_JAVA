package dao;

import java.util.ArrayList;
import java.util.List;

import model.Persona;

public class PersonaDAOImpl implements PersonaDAO{
	@Override
	public List<Persona> listarTodos(){
		List<Persona> lista = new ArrayList<>();
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Jhon");
		
		lista.add(per);
		
		per = new Persona();
		per.setId(2);
		per.setNombre("Albert");
		
		lista.add(per);
		
		return lista;
	}
	
	@Override
	public Persona leerPorId(int id) {
		return null;
	}
	
	@Override
	public void registrar(Persona persona) {
		System.out.println("Persona "+ persona.getNombre() + " registrada");
	}
	
	@Override
	public void actualizar(Persona persona) {
		System.out.println("Persona "+ persona.getNombre() + " actualizada");
	}
	
	@Override
	public void eliminar(int id) {
		System.out.println("id  "+ id + " eliminado");
	}
}
