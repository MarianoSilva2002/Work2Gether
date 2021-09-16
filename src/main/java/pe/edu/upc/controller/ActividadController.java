package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Actividad;
import pe.edu.upc.entity.Empleado;
import pe.edu.upc.entity.Jefe;
import pe.edu.upc.entity.TiempoActividad;
import pe.edu.upc.service.iActividadService;
import pe.edu.upc.service.iEmpleadoService;
import pe.edu.upc.service.iJefeService;
import pe.edu.upc.service.iTiempoActividadService;

@Named
@RequestScoped
public class ActividadController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iEmpleadoService eService;
	
	@Inject
	private iJefeService jService;
	
	@Inject
	private iTiempoActividadService tService;
	
	@Inject
	private iActividadService aService;
	
	private Empleado empleado;
	private Jefe jefe;
	private TiempoActividad tiempo;
	private Actividad actividad;
	
	List<Empleado> listaEmpleados;
	List<Jefe> listaJefes;
	List<TiempoActividad> listaTiempo;
	List<Actividad> listaActividad;
	
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaTiempo = new ArrayList<TiempoActividad>();	
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaActividad = new ArrayList<Actividad>();
		this.jefe = new Jefe();
		this.tiempo= new TiempoActividad();
		this.empleado = new Empleado();
		this.actividad = new Actividad();
		this.listar();
		this.listarTiempo();
		this.listarEmpleado();
		this.listarActividad();
	}

	public String nuevoActividad() {
		this.setActividad(new Actividad());
		return "parte.xhtml";
	}
	
	public void insertar() {
		aService.insertar(actividad);		
		limpiarActividad();
		this.listarActividad();
	}
	
	public void listar() {
		listaJefes = jService.listar();
	}

	public void listarTiempo() {
		listaTiempo = tService.listar();
	}
	
	
	public void listarEmpleado() {
		listaEmpleados = eService.listar();
	}	
	
	public void listarActividad() {
		listaActividad = aService.listar();
	}
	
	public void limpiarActividad() {
		this.init();
	}
	
	public void eliminar(Actividad actividad) {
		aService.eliminar(actividad.getIdActividad());
		this.listarActividad();
	}

	public iEmpleadoService geteService() {
		return eService;
	}

	public void seteService(iEmpleadoService eService) {
		this.eService = eService;
	}

	public iJefeService getjService() {
		return jService;
	}

	public void setjService(iJefeService jService) {
		this.jService = jService;
	}

	public iTiempoActividadService gettService() {
		return tService;
	}

	public void settService(iTiempoActividadService tService) {
		this.tService = tService;
	}

	public iActividadService getaService() {
		return aService;
	}

	public void setaService(iActividadService aService) {
		this.aService = aService;
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

	public TiempoActividad getTiempo() {
		return tiempo;
	}

	public void setTiempo(TiempoActividad tiempo) {
		this.tiempo = tiempo;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
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

	public List<TiempoActividad> getListaTiempo() {
		return listaTiempo;
	}

	public void setListaTiempo(List<TiempoActividad> listaTiempo) {
		this.listaTiempo = listaTiempo;
	}

	public List<Actividad> getListaActividad() {
		return listaActividad;
	}

	public void setListaActividad(List<Actividad> listaActividad) {
		this.listaActividad = listaActividad;
	}

}
