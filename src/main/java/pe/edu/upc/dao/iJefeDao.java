package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Jefe;

public interface iJefeDao {
	public void insertar(Jefe jefe);
	public List<Jefe> listar();
	public void eliminar(int idJefe);
}
