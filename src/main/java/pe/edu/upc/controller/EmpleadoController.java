package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empleado;
import pe.edu.upc.entity.Jefe;
import pe.edu.upc.entity.Roles;

import pe.edu.upc.service.iEmpleadoService;
import pe.edu.upc.service.iJefeService;
import pe.edu.upc.service.iRolesService;

@Named
@RequestScoped
public class EmpleadoController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iEmpleadoService eService;
	
	@Inject
	private iJefeService jService;
	
	@Inject
	private iRolesService rService;
	
	private Empleado empleado;
	private Jefe jefe;
	private Roles rol;
	
	List<Empleado> listaEmpleados;
	List<Jefe> listaJefes;
	List<Roles> listaRoles;
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaRoles = new ArrayList<Roles>();	
		this.listaEmpleados = new ArrayList<Empleado>();
		this.jefe = new Jefe();
		this.rol= new Roles();
		this.empleado = new Empleado();
		this.listar();
		this.listarRoles();
		this.listarEmpleado();
	}

	public String nuevoEmpleado() {
		this.setEmpleado(new Empleado());
		return "empleado.xhtml";
	}
	
	public void insertar() {
		eService.insertar(empleado);		
		limpiarEmpleado();
		this.listarEmpleado();
	}
	
	public void listar() {
		listaJefes = jService.listar();
	}

	public void listarRoles() {
		listaRoles = rService.listar();
	}
	
	
	public void listarEmpleado() {
		listaEmpleados = eService.listar();
	}	
	public void limpiarEmpleado() {
		this.init();
	}
	
	public void eliminar(Empleado empleado) {
		eService.eliminar(empleado.getIdEmpleado());
		this.listarEmpleado();
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public List<Jefe> getListaJefes() {
		return listaJefes;
	}

	public void setListaJefes(List<Jefe> listaJefes) {
		this.listaJefes = listaJefes;
	}

	public List<Roles> getListaRoles() {
		return listaRoles;
	}

	public void setListaRoles(List<Roles> listaRoles) {
		this.listaRoles = listaRoles;
	}

	
	
}
