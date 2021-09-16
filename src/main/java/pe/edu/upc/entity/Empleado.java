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
@Table(name="Empleado")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmpleado;
	
	@Column(name="Nombre", nullable = false, length = 60)
	private String Nombre;
	
	@Column(name="ApellidoPaterno", nullable = false, length = 60)
	private String APaterno;
	
	@Column(name="ApellidoMaterno", nullable = false, length = 60)
	private String AMaterno;
	
	@Column(name="Genero", nullable = false, length = 50)
	private String Genero;
	
	@Column(name="Correo", nullable = false, length = 60)
	private String Correo;
	
	@Column(name="Contrasena", nullable = false, length = 60)
	private String Contrasena;
	
	@ManyToOne
	@JoinColumn(name="idJefe", nullable = false)
	private Jefe jefe;

	@ManyToOne
	@JoinColumn(name="idRol", nullable = false)
	private Roles rol;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idEmpleado, String nombre, String aPaterno, String aMaterno, String genero, String correo,
			String contrasena, Jefe jefe, Roles rol) {
		super();
		this.idEmpleado = idEmpleado;
		Nombre = nombre;
		APaterno = aPaterno;
		AMaterno = aMaterno;
		Genero = genero;
		Correo = correo;
		Contrasena = contrasena;
		this.jefe = jefe;
		this.rol = rol;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAPaterno() {
		return APaterno;
	}

	public void setAPaterno(String aPaterno) {
		APaterno = aPaterno;
	}

	public String getAMaterno() {
		return AMaterno;
	}

	public void setAMaterno(String aMaterno) {
		AMaterno = aMaterno;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContrasena() {
		return Contrasena;
	}

	public void setContrasena(String contrasena) {
		Contrasena = contrasena;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	
}
