package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Mes;

public interface iMesService {
	public void insertar(Mes mes);
	public List<Mes> listar();
	public void eliminar(int idMes);
}
