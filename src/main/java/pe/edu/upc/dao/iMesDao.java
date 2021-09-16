package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Mes;

public interface iMesDao {
	public void insertar(Mes mes);
	public List<Mes> listar();
	public void eliminar(int idMes);
}
