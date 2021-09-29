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
import pe.edu.upc.entity.Roles;
import pe.edu.upc.service.iEmpresaService;
import pe.edu.upc.service.iJefeService;
import pe.edu.upc.service.iRolesService;
import pe.edu.upc.util.Message;

@Named
@RequestScoped
public class JefeController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;

	@Inject
	private iJefeService jService;
	
	@Inject
	private iEmpresaService eService;
	
	@Inject
	private iRolesService rService;
	
	private Jefe jefe;
	private Empresa empresa;
	private Roles rol;
	
	List<Jefe> listaJefes;
	List<Empresa> listaEmpresas;
	List<Roles> listaRoles;
	
	private String repetircontrasena;
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaEmpresas = new ArrayList<Empresa>();	
		this.listaRoles = new ArrayList<Roles>();
		this.jefe = new Jefe();
		this.empresa= new Empresa();		
		this.rol = new Roles();
		this.listar();
		this.listarJefe();
		this.listarRoles();
	}

	public String nuevoJefe() {
		this.setJefe(new Jefe());
		return "jefe.xhtml";
	}
	
	public void insertar() {
		if(repetircontrasena == jefe.getContrasena())
		{
			jService.insertar(jefe);		
			limpiarJefe();
			this.listarJefe();
		}
		else 
		{
			Message.messageError("La contraseña ingresada no es la misma. Intente de nuevo.");
		}
	}
	
	public void listar() {
		listaEmpresas = eService.listar();
	}

	public void listarJefe() {
		listaJefes = jService.listar();
	}	
	public void listarRoles() {
		listaRoles = rService.listar();
	}

	public void limpiarJefe() {
		this.init();
	}
	
	public void eliminar(Jefe jefe) {
		jService.eliminar(jefe.getIdJefe());
		this.listarJefe();
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

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
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

	public List<Roles> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Roles> listaRoles) {
		this.listaRoles = listaRoles;
	}


	
}
