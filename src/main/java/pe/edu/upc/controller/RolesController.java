package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Jefe;
import pe.edu.upc.entity.Roles;
import pe.edu.upc.service.iJefeService;
import pe.edu.upc.service.iRolesService;

@Named
@RequestScoped
public class RolesController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iRolesService rService;
	
	@Inject
	private iJefeService jService;
	
	private Roles roles;
	private Jefe jefe;
	
	
	List<Roles> listaRoles;
	List<Jefe> listaJefes;
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaRoles = new ArrayList<Roles>();		
		this.jefe = new Jefe();
		this.roles= new Roles();		
		this.listar();
		this.listarRol();
	}

	public String nuevoRol() {
		this.setRoles(new Roles());
		return "parte.xhtml";
	}
	
	public void insertar() {
		rService.insertar(roles);		
		limpiarRol();
		this.listarRol();
	}
	
	public void listar() {
		listaJefes = jService.listar();
	}

	public void listarRol() {
		listaRoles = rService.listar();
	}	
	public void limpiarRol() {
		this.init();
	}
	
	public void eliminar(Roles rol) {
		rService.eliminar(rol.getIdRol());
		this.listarRol();
	}

	public iRolesService getrService() {
		return rService;
	}

	public void setrService(iRolesService rService) {
		this.rService = rService;
	}

	public iJefeService getjService() {
		return jService;
	}

	public void setjService(iJefeService jService) {
		this.jService = jService;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public List<Roles> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Roles> listaRoles) {
		this.listaRoles = listaRoles;
	}

	public List<Jefe> getListaJefes() {
		return listaJefes;
	}

	public void setListaJefes(List<Jefe> listaJefes) {
		this.listaJefes = listaJefes;
	}

}
