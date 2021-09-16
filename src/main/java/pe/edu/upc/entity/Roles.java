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
@Table(name="Roles")
public class Roles implements Serializable{
	
	private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRol;
	
	@Column(name="Nombre", nullable = false, length = 60)
	private String Nombre;
	
	@ManyToOne
	@JoinColumn(name="idJefe", nullable = false)
	private Jefe jefe;

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(int idRol, String nombre, Jefe jefe) {
		super();
		this.idRol = idRol;
		Nombre = nombre;
		this.jefe = jefe;
	}

	public int getIdRol() {
		return idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	
	
}
