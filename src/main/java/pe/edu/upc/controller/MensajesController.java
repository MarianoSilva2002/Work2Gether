package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Empleado;
import pe.edu.upc.entity.Mensajes;

import pe.edu.upc.service.iEmpleadoService;
import pe.edu.upc.service.iMensajesService;

@Named
@RequestScoped
public class MensajesController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iEmpleadoService eService;
	
	@Inject
	private iMensajesService mService;
	
	private Empleado empleado;
	private Mensajes mensaje;
	
	List<Empleado> listaEmpleados;
	List<Mensajes> listaMensajes;
	
	@PostConstruct
	public void init() {		
		this.listaMensajes = new ArrayList<Mensajes>();	
		this.listaEmpleados = new ArrayList<Empleado>();
		this.mensaje= new Mensajes();
		this.empleado = new Empleado();
		this.listarMensaje();
		this.listarEmpleado();
	}

	public String nuevoMensaje() {
		this.setMensaje(new Mensajes());
		return "mensajes.xhtml";
	}
	
	public void insertar() {
		mService.insertar(mensaje);		
		limpiarMensaje();
		this.listarMensaje();
	}

	public void listarEmpleado() {
		listaEmpleados = eService.listar();
	}
	
	
	public void listarMensaje() {
		listaMensajes = mService.listar();
	}	
	public void limpiarMensaje() {
		this.init();
	}
	
	public void eliminar(Mensajes mensaje) {
		mService.eliminar(mensaje.getIdMensaje());
		this.listarMensaje();
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Mensajes getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensajes mensaje) {
		this.mensaje = mensaje;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public List<Mensajes> getListaMensajes() {
		return listaMensajes;
	}

	public void setListaMensajes(List<Mensajes> listaMensajes) {
		this.listaMensajes = listaMensajes;
	}

	
}
