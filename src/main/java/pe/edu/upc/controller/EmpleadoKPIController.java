package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Anio;
import pe.edu.upc.entity.Empleado;
import pe.edu.upc.entity.Empleado_KPI;
import pe.edu.upc.entity.KPI;
import pe.edu.upc.entity.Mes;
import pe.edu.upc.service.iAnioService;
import pe.edu.upc.service.iEmpleadoKPIService;
import pe.edu.upc.service.iEmpleadoService;
import pe.edu.upc.service.iKPIService;
import pe.edu.upc.service.iMesService;

@Named
@RequestScoped
public class EmpleadoKPIController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iEmpleadoService eService;
	
	@Inject
	private iMesService mService;
	
	@Inject
	private iKPIService kService;
	
	@Inject
	private iAnioService aService;
	
	@Inject
	private iEmpleadoKPIService ekService;
	
	private Empleado empleado;
	private Mes mes;
	private KPI kpi;
	private Anio anio;
	private Empleado_KPI empleadoKPI;
	
	List<Empleado> listaEmpleados;
	List<Mes> listaMeses;
	List<Anio> listaAnios;
	List<KPI> listaKPI;
	List<Empleado_KPI> listaEmpleadosKPI;
	
	@PostConstruct
	public void init() {		
		this.listaMeses = new ArrayList<Mes>();
		this.listaAnios = new ArrayList<Anio>();	
		this.listaEmpleados = new ArrayList<Empleado>();
		this.listaKPI = new ArrayList<KPI>();
		this.listaEmpleadosKPI = new ArrayList<Empleado_KPI>();
		this.mes = new Mes();
		this.anio= new Anio();
		this.empleado = new Empleado();
		this.kpi = new KPI();
		this.empleadoKPI = new Empleado_KPI();
		this.listar();
		this.listarMes();
		this.listarAnio();
		this.listarKPI();
		this.listarEmpleadoKPI();
	}

	public String nuevoEmpleadoKPI() {
		this.setEmpleadoKPI(new Empleado_KPI());
		return "parte.xhtml";
	}
	
	public void insertar() {
		ekService.insertar(empleadoKPI);		
		limpiarEmpleadoKPI();
		this.listarEmpleadoKPI();
	}
	
	public void listar() {
		listaEmpleados = eService.listar();
	}

	public void listarMes() {
		listaMeses = mService.listar();
	}
	
	
	public void listarAnio() {
		listaAnios = aService.listar();
	}	
	
	public void listarKPI() {
		listaKPI = kService.listar();
	}
	
	public void listarEmpleadoKPI() {
		listaEmpleadosKPI = ekService.listar();
	}
	
	public void limpiarEmpleadoKPI() {
		this.init();
	}
	
	public void eliminar(Empleado_KPI empleadoKPI) {
		ekService.eliminar(empleadoKPI.getIdEmpleado_KPI());
		this.listarEmpleadoKPI();
	}

	public iEmpleadoService geteService() {
		return eService;
	}

	public void seteService(iEmpleadoService eService) {
		this.eService = eService;
	}

	public iMesService getmService() {
		return mService;
	}

	public void setmService(iMesService mService) {
		this.mService = mService;
	}

	public iKPIService getkService() {
		return kService;
	}

	public void setkService(iKPIService kService) {
		this.kService = kService;
	}

	public iAnioService getaService() {
		return aService;
	}

	public void setaService(iAnioService aService) {
		this.aService = aService;
	}

	public iEmpleadoKPIService getEkService() {
		return ekService;
	}

	public void setEkService(iEmpleadoKPIService ekService) {
		this.ekService = ekService;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public KPI getKpi() {
		return kpi;
	}

	public void setKpi(KPI kpi) {
		this.kpi = kpi;
	}

	public Anio getAnio() {
		return anio;
	}

	public void setAnio(Anio anio) {
		this.anio = anio;
	}

	public Empleado_KPI getEmpleadoKPI() {
		return empleadoKPI;
	}

	public void setEmpleadoKPI(Empleado_KPI empleadoKPI) {
		this.empleadoKPI = empleadoKPI;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public List<Mes> getListaMeses() {
		return listaMeses;
	}

	public void setListaMeses(List<Mes> listaMeses) {
		this.listaMeses = listaMeses;
	}

	public List<Anio> getListaAnios() {
		return listaAnios;
	}

	public void setListaAnios(List<Anio> listaAnios) {
		this.listaAnios = listaAnios;
	}

	public List<KPI> getListaKPI() {
		return listaKPI;
	}

	public void setListaKPI(List<KPI> listaKPI) {
		this.listaKPI = listaKPI;
	}

	public List<Empleado_KPI> getListaEmpleadosKPI() {
		return listaEmpleadosKPI;
	}

	public void setListaEmpleadosKPI(List<Empleado_KPI> listaEmpleadosKPI) {
		this.listaEmpleadosKPI = listaEmpleadosKPI;
	}

}
