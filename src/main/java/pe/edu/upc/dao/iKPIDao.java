package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.KPI;

public interface iKPIDao {
	public void insertar(KPI kpi);
	public List<KPI> listar();
	public void eliminar(int idKPI);
}
