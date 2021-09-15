package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Jefe;

public interface iJefeService {
	public void insertar(Jefe jefe);
	public List<Jefe> listar();
	public void eliminar(int idJefe);
}
