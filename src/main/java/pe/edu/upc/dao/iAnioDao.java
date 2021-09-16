package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Anio;

public interface iAnioDao {
	public void insertar(Anio anio);
	public List<Anio> listar();
	public void eliminar(int idAnio);
}
