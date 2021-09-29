package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empresa;
import pe.edu.upc.service.iEmpresaService;

@Named
@RequestScoped
public class EmpresaController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iEmpresaService eService;
	
	private Empresa empresa;
	List<Empresa> listaEmpresas;
	
	@PostConstruct
	public void init() {
		this.listaEmpresas = new ArrayList<Empresa>();
		this.empresa= new Empresa();
		this.listar();
	}

	public String nuevaEmpresa() {
		this.setEmpresa(new Empresa());
		return "empresa.xhtml";
	}
	
	public void insertar() {
		eService.insertar(empresa);
		limpiarEmpresa();
		this.listar();
	}
	
	public void listar() {
		listaEmpresas = eService.listar();
	}

	public void limpiarEmpresa() {
		this.init();
	}
	
	public void eliminar(Empresa empresa) {
		eService.eliminar(empresa.getIdEmpresa());
		this.listar();
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	
}
