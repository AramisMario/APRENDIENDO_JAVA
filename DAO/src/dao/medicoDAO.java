package dao;
import model.Medico;
public interface medicoDAO extends CRUD<Medico> {
	void curar();
}
