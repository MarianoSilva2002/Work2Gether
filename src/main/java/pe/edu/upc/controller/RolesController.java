package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Roles;
import pe.edu.upc.service.iRolesService;

@Named
@RequestScoped
public class RolesController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iRolesService rService;
	
	private Roles roles;
	
	List<Roles> listaRoles;
	
	@PostConstruct
	public void init() {		
		this.listaRoles = new ArrayList<Roles>();		
		this.roles= new Roles();		
		this.listarRol();
	}

	public String nuevoRol() {
		this.setRoles(new Roles());
		return "rol.xhtml";
	}
	
	public void insertar() {
		rService.insertar(roles);		
		limpiarRol();
		this.listarRol();
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

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public List<Roles> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Roles> listaRoles) {
		this.listaRoles = listaRoles;
	}

}
