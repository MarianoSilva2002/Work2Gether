package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Empleado_KPI;

public interface iEmpleadoKPIDao {
	public void insertar(Empleado_KPI empleado_KPI);
	public List<Empleado_KPI> listar();
	public void eliminar(int idEmpleadoKPI);
}
