package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Anio;

public interface iAnioService {
	public void insertar(Anio anio);
	public List<Anio> listar();
	public void eliminar(int idAnio);
}
