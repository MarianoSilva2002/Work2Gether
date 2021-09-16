package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Roles;

public interface iRolesService {
	public void insertar(Roles rol);
	public List<Roles> listar();
	public void eliminar(int idRol);
}
