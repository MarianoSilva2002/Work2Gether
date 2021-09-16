package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Actividad;

public interface iActividadDao {
	public void insertar(Actividad actividad);
	public List<Actividad> listar();
	public void eliminar(int idActividad);
}
