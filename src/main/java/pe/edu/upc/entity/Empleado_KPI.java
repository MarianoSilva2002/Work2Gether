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
@Table(name="Empleado_KPI")
public class Empleado_KPI implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmpleado_KPI;
	
	@ManyToOne
	@JoinColumn(name="idEmpleado", nullable = false)
	private Empleado empleado;

	@ManyToOne
	@JoinColumn(name="idKPI", nullable = false)
	private KPI kpi;
	
	@ManyToOne
	@JoinColumn(name="idMes", nullable = false)
	private Mes mes;
	
	@ManyToOne
	@JoinColumn(name="idAnio", nullable = false)
	private Anio anio;
	
	@Column(name="Cantidad", nullable = false)
	private int Cantidad; 
	
	public Empleado_KPI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado_KPI(int idEmpleado_KPI, Empleado empleado, KPI kpi, Mes mes, Anio anio, int cantidad) {
		super();
		this.idEmpleado_KPI = idEmpleado_KPI;
		this.empleado = empleado;
		this.kpi = kpi;
		this.mes = mes;
		this.anio = anio;
		Cantidad = cantidad;
	}

	public int getIdEmpleado_KPI() {
		return idEmpleado_KPI;
	}

	public void setIdEmpleado_KPI(int idEmpleado_KPI) {
		this.idEmpleado_KPI = idEmpleado_KPI;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public KPI getKpi() {
		return kpi;
	}

	public void setKpi(KPI kpi) {
		this.kpi = kpi;
	}

	public Mes getMes() {
		return mes;
	}

	public void setMes(Mes mes) {
		this.mes = mes;
	}

	public Anio getAnio() {
		return anio;
	}

	public void setAnio(Anio anio) {
		this.anio = anio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Cantidad;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((empleado == null) ? 0 : empleado.hashCode());
		result = prime * result + idEmpleado_KPI;
		result = prime * result + ((kpi == null) ? 0 : kpi.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado_KPI other = (Empleado_KPI) obj;
		if (Cantidad != other.Cantidad)
			return false;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (empleado == null) {
			if (other.empleado != null)
				return false;
		} else if (!empleado.equals(other.empleado))
			return false;
		if (idEmpleado_KPI != other.idEmpleado_KPI)
			return false;
		if (kpi == null) {
			if (other.kpi != null)
				return false;
		} else if (!kpi.equals(other.kpi))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}

}
