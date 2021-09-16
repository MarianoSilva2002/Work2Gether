package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Empleado;

public interface iEmpleadoDao {
	public void insertar(Empleado empleado);
	public List<Empleado> listar();
	public void eliminar(int idEmpleado);
}
