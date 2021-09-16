package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Jefe")
public class Jefe implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idJefe;
	
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
	
	@OneToOne
	@JoinColumn(name="idEmpresa", nullable = false)
	private Empresa empresa;

	public Jefe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jefe(int idJefe, String nombre, String aPaterno, String aMaterno, String genero, String correo,
			String contrasena, Empresa empresa) {
		super();
		this.idJefe = idJefe;
		Nombre = nombre;
		APaterno = aPaterno;
		AMaterno = aMaterno;
		Genero = genero;
		Correo = correo;
		Contrasena = contrasena;
		this.empresa = empresa;
	}

	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
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

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	
}
