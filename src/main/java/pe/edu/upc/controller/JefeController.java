package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empresa;
import pe.edu.upc.entity.Jefe;
import pe.edu.upc.service.iEmpresaService;
import pe.edu.upc.service.iJefeService;

@Named
@RequestScoped
public class JefeController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private iJefeService jService;
	
	@Inject
	private iEmpresaService eService;
	
	private Jefe jefe;
	private Empresa empresa;
	
	List<Jefe> listaJefes;
	List<Empresa> listaEmpresas;
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaEmpresas = new ArrayList<Empresa>();		
		this.jefe = new Jefe();
		this.empresa= new Empresa();		
		this.listar();
		this.listarJefe();
	}

	public String nuevoJefe() {
		this.setJefe(new Jefe());
		return "jefe.xhtml";
	}
	
	public void insertar() {
		jService.insertar(jefe);		
		limpiarJefe();
		this.listarJefe();
	}
	
	public void listar() {
		listaEmpresas = eService.listar();
	}

	public void listarJefe() {
		listaJefes = jService.listar();
	}	
	public void limpiarJefe() {
		this.init();
	}
	
	public void eliminar(Jefe jefe) {
		jService.eliminar(jefe.getIdJefe());
		this.listarJefe();
	}

	public iJefeService getjService() {
		return jService;
	}

	public void setjService(iJefeService jService) {
		this.jService = jService;
	}

	public iEmpresaService geteService() {
		return eService;
	}

	public void seteService(iEmpresaService eService) {
		this.eService = eService;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Jefe> getListaJefes() {
		return listaJefes;
	}

	public void setListaJefes(List<Jefe> listaJefes) {
		this.listaJefes = listaJefes;
	}

	public List<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(List<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	
}
