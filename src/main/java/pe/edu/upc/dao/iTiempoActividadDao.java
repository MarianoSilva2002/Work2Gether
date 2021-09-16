package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.TiempoActividad;

public interface iTiempoActividadDao {
	public void insertar(TiempoActividad tiempo);
	public List<TiempoActividad> listar();
	public void eliminar(int idTiempoActividad);
}
