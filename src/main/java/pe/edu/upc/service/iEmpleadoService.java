package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Empleado;

public interface iEmpleadoService {
	public void insertar(Empleado empleado);
	public List<Empleado> listar();
	public void eliminar(int idEmpleado);
}
