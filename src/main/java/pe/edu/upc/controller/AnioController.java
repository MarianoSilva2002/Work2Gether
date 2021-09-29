package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Anio;
import pe.edu.upc.service.iAnioService;

@Named
@RequestScoped
public class AnioController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iAnioService aService;
	
	private Anio anio;
	List<Anio> listaAnios;
	
	@PostConstruct
	public void init() {
		this.listaAnios = new ArrayList<Anio>();
		this.anio= new Anio();
		this.listar();
	}

	public String nuevaAnio() {
		this.setAnio(new Anio());
		return "anio.xhtml";
	}
	
	public void insertar() {
		aService.insertar(anio);
		limpiarAnio();
	}
	
	public void listar() {
		listaAnios = aService.listar();
	}

	public void limpiarAnio() {
		this.init();
	}
	
	public void eliminar(Anio anio) {
		aService.eliminar(anio.getIdAnio());
		this.listar();
	}

	public Anio getAnio() {
		return anio;
	}

	public void setAnio(Anio anio) {
		this.anio = anio;
	}

	public List<Anio> getListaAnios() {
		return listaAnios;
	}

	public void setListaAnios(List<Anio> listaAnios) {
		this.listaAnios = listaAnios;
	}
	
}
