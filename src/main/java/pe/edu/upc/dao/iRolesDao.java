package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Roles;

public interface iRolesDao {
	public void insertar(Roles rol);
	public List<Roles> listar();
	public void eliminar(int idRol);
}
