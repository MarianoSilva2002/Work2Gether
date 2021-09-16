package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="KPI")
public class KPI implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKPI;
	
	@Column(name="Nombre", nullable = false, length = 60)
	private String Nombre;
	
	@Column(name="CantidadEstimada", nullable = false)
	private int CantidadEstimada;
	
	@ManyToOne
	@JoinColumn(name="idJefe", nullable = false)
	private Jefe jefe;

	public KPI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KPI(int idKPI, String nombre, int cantidadEstimada, Jefe jefe) {
		super();
		this.idKPI = idKPI;
		Nombre = nombre;
		CantidadEstimada = cantidadEstimada;
		this.jefe = jefe;
	}

	public int getIdKPI() {
		return idKPI;
	}

	public void setIdKPI(int idKPI) {
		this.idKPI = idKPI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCantidadEstimada() {
		return CantidadEstimada;
	}

	public void setCantidadEstimada(int cantidadEstimada) {
		CantidadEstimada = cantidadEstimada;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

}
