package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.KPI;

public interface iKPIService {
	public void insertar(KPI kpi);
	public List<KPI> listar();
	public void eliminar(int idKPI);
}
