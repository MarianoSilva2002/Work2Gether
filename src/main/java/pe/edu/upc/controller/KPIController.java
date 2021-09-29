package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.KPI;

import pe.edu.upc.service.iKPIService;

@Named
@RequestScoped
public class KPIController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iKPIService kService;
		
	private KPI kpi;	
	
	List<KPI> listaKPIs;
	
	@PostConstruct
	public void init() {		
		this.listaKPIs = new ArrayList<KPI>();		
		this.kpi= new KPI();		
		this.listarKPI();
	}

	public String nuevoKPI() {
		this.setKpi(new KPI());
		return "KPI.xhtml";
	}
	
	public void insertar() {
		kService.insertar(kpi);		
		limpiarKPI();
		this.listarKPI();
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


	public KPI getKpi() {
		return kpi;
	}

	public void setKpi(KPI kpi) {
		this.kpi = kpi;
	}

	public List<KPI> getListaKPIs() {
		return listaKPIs;
	}

	public void setListaKPIs(List<KPI> listaKPIs) {
		this.listaKPIs = listaKPIs;
	}


}
