package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TiempoActividad;
import pe.edu.upc.service.iTiempoActividadService;

@Named
@RequestScoped
public class TiempoActividadController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iTiempoActividadService tService;
	
	private TiempoActividad tiempo;
	List<TiempoActividad> listaTiempo;
	
	@PostConstruct
	public void init() {
		this.listaTiempo = new ArrayList<TiempoActividad>();
		this.tiempo= new TiempoActividad();
		this.listar();
	}

	public String nuevaTiempo() {
		this.setTiempo(new TiempoActividad());
		return "TiempoActividad.xhtml";
	}
	
	public void insertar() {
		tService.insertar(tiempo);
		limpiarTiempo();
	}
	
	public void listar() {
		listaTiempo = tService.listar();
	}

	public void limpiarTiempo() {
		this.init();
	}
	
	public void eliminar(TiempoActividad tiempo) {
		tService.eliminar(tiempo.getIdTiempoActividad());
		this.listar();
	}

	public TiempoActividad getTiempo() {
		return tiempo;
	}

	public void setTiempo(TiempoActividad tiempo) {
		this.tiempo = tiempo;
	}

	public List<TiempoActividad> getListaTiempo() {
		return listaTiempo;
	}

	public void setListaTiempo(List<TiempoActividad> listaTiempo) {
		this.listaTiempo = listaTiempo;
	}

	
}
