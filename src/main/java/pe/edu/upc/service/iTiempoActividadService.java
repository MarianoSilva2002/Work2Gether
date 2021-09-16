package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.TiempoActividad;

public interface iTiempoActividadService {
	public void insertar(TiempoActividad tiempo);
	public List<TiempoActividad> listar();
	public void eliminar(int idTiempoActividad);
}
