package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Actividad")
public class Actividad implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idActividad;
	
	@Column(name="Nombre", nullable = false, length = 60)
	private String Nombre;
	
	@Column(name="Descripcion", nullable = false, length = 1000)
	private String Descripcion;
	
	@Column(name="HorasEstimadas", nullable = false)
	private Date HorasEstimadas;
	
	@Column(name="HorasInvertidas", nullable = true)
	private Date HorasInvertidas;
	
	@Column(name="FechaLimite", nullable = false)
	private Date FechaLimite;
	
	@Column(name="Prioridad", nullable = false)
	private Boolean Prioridad;
	
	@Column(name="Estado", nullable = false, length = 50)
	private String Estado;

	@ManyToOne
	@JoinColumn(name="idEmpleado", nullable = false)
	private Empleado empleado;
	
	@OneToOne
	@JoinColumn(name="idTiempoActividad", nullable = false)
	private TiempoActividad tiempo;
	
	public Actividad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actividad(int idActividad, String nombre, String descripcion, Date horasEstimadas, Date horasInvertidas,
			Date fechaLimite, Boolean prioridad, String estado, Jefe jefe, Empleado empleado, TiempoActividad tiempo) {
		super();
		this.idActividad = idActividad;
		Nombre = nombre;
		Descripcion = descripcion;
		HorasEstimadas = horasEstimadas;
		HorasInvertidas = horasInvertidas;
		FechaLimite = fechaLimite;
		Prioridad = prioridad;
		Estado = estado;
		this.empleado = empleado;
		this.tiempo = tiempo;
	}

	public int getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(int idActividad) {
		this.idActividad = idActividad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Date getHorasEstimadas() {
		return HorasEstimadas;
	}

	public void setHorasEstimadas(Date horasEstimadas) {
		HorasEstimadas = horasEstimadas;
	}

	public Date getHorasInvertidas() {
		return HorasInvertidas;
	}

	public void setHorasInvertidas(Date horasInvertidas) {
		HorasInvertidas = horasInvertidas;
	}

	public Date getFechaLimite() {
		return FechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		FechaLimite = fechaLimite;
	}

	public Boolean getPrioridad() {
		return Prioridad;
	}

	public void setPrioridad(Boolean prioridad) {
		Prioridad = prioridad;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public TiempoActividad getTiempo() {
		return tiempo;
	}

	public void setTiempo(TiempoActividad tiempo) {
		this.tiempo = tiempo;
	}
	
}
