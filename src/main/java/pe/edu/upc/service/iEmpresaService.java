package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Empresa;

public interface iEmpresaService {
	public void insertar(Empresa empresa);
	public List<Empresa> listar();
	public void eliminar(int idEmpresa);
	public void editar(Empresa empresa);
}
