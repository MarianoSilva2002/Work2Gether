package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface iEmpresaDao {
	public void insertar(Empresa empresa);
	public List<Empresa> listar();
	public void eliminar(int idEmpresa);
	public void editar(Empresa empresa);
	
}
