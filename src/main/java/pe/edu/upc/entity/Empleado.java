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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AMaterno == null) ? 0 : AMaterno.hashCode());
		result = prime * result + ((APaterno == null) ? 0 : APaterno.hashCode());
		result = prime * result + ((Contrasena == null) ? 0 : Contrasena.hashCode());
		result = prime * result + ((Correo == null) ? 0 : Correo.hashCode());
		result = prime * result + ((Genero == null) ? 0 : Genero.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + idEmpleado;
		result = prime * result + ((jefe == null) ? 0 : jefe.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
		Empleado other = (Empleado) obj;
		if (AMaterno == null) {
			if (other.AMaterno != null)
				return false;
		} else if (!AMaterno.equals(other.AMaterno))
			return false;
		if (APaterno == null) {
			if (other.APaterno != null)
				return false;
		} else if (!APaterno.equals(other.APaterno))
			return false;
		if (Contrasena == null) {
			if (other.Contrasena != null)
				return false;
		} else if (!Contrasena.equals(other.Contrasena))
			return false;
		if (Correo == null) {
			if (other.Correo != null)
				return false;
		} else if (!Correo.equals(other.Correo))
			return false;
		if (Genero == null) {
			if (other.Genero != null)
				return false;
		} else if (!Genero.equals(other.Genero))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (idEmpleado != other.idEmpleado)
			return false;
		if (jefe == null) {
			if (other.jefe != null)
				return false;
		} else if (!jefe.equals(other.jefe))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		return true;
	}

	
}
