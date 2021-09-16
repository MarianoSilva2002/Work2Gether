package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Jefe;
import pe.edu.upc.entity.KPI;

import pe.edu.upc.service.iJefeService;
import pe.edu.upc.service.iKPIService;

@Named
@RequestScoped
public class KPIController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iKPIService kService;
	
	@Inject
	private iJefeService jService;
	
	private KPI kpi;
	private Jefe jefe;
	
	
	List<KPI> listaKPIs;
	List<Jefe> listaJefes;
	
	@PostConstruct
	public void init() {		
		this.listaJefes = new ArrayList<Jefe>();
		this.listaKPIs = new ArrayList<KPI>();		
		this.jefe = new Jefe();
		this.kpi= new KPI();		
		this.listar();
		this.listarKPI();
	}

	public String nuevoKPI() {
		this.setKpi(new KPI());
		return "parte.xhtml";
	}
	
	public void insertar() {
		kService.insertar(kpi);		
		limpiarKPI();
		this.listarKPI();
	}
	
	public void listar() {
		listaJefes = jService.listar();
	}

	public void listarKPI() {
		listaKPIs = kService.listar();
	}	
	public void limpiarKPI() {
		this.init();
	}
	
	public void eliminar(KPI kpi) {
		kService.eliminar(kpi.getIdKPI());
		this.listarKPI();
	}

	public iKPIService getkService() {
		return kService;
	}

	public void setkService(iKPIService kService) {
		this.kService = kService;
	}

	public iJefeService getjService() {
		return jService;
	}

	public void setjService(iJefeService jService) {
		this.jService = jService;
	}

	public KPI getKpi() {
		return kpi;
	}

	public void setKpi(KPI kpi) {
		this.kpi = kpi;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public List<KPI> getListaKPIs() {
		return listaKPIs;
	}

	public void setListaKPIs(List<KPI> listaKPIs) {
		this.listaKPIs = listaKPIs;
	}

	public List<Jefe> getListaJefes() {
		return listaJefes;
	}

	public void setListaJefes(List<Jefe> listaJefes) {
		this.listaJefes = listaJefes;
	}

	

}
