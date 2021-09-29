package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Mes;
import pe.edu.upc.service.iMesService;

@Named
@RequestScoped
public class MesController implements Serializable{

	private static final long serialVersionUID = -3351318371418292111L;
	
	@Inject
	private iMesService mService;
	
	private Mes mes;
	List<Mes> listaMeses;
	
	@PostConstruct
	public void init() {
		this.listaMeses = new ArrayList<Mes>();
		this.mes= new Mes();
		this.listar();
	}

	public String nuevaMes() {
		this.setMes(new Mes());
		return "mes.xhtml";
	}
	
	public void insertar() {
		mService.insertar(mes);
		limpiarMes();
	}
	
	public void listar() {
		listaMeses = mService.listar();
	}

	public void limpiarMes() {
		this.init();
	}
	
	public void eliminar(Mes mes) {
		mService.eliminar(mes.getIdMes());
		this.listar();
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public List<Mes> getListaMeses() {
		return listaMeses;
	}

	public void setListaMeses(List<Mes> listaMeses) {
		this.listaMeses = listaMeses;
	}

}
