package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empresa")
public class Empresa implements Serializable{
private static final long serialVersionUID = 11;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEmpresa;
	
	@Column(name="Nombre", nullable = false, length = 60)
	private String Nombre;
	
	@Column(name="RUC", nullable = false)
	private long RUC;
	
	@Column(name="Razon_Social", nullable = false, length = 60)
	private String RazonSocial;
	
	@Column(name="Direccion", nullable = false, length = 60)
	private String Direccion;
	
	@Column(name="Distrito", nullable = false, length = 60)
	private String Distrito;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(int idEmpresa, String nombre, long rUC, String razonSocial, String direccion, String distrito) {
		super();
		this.idEmpresa = idEmpresa;
		Nombre = nombre;
		RUC = rUC;
		RazonSocial = razonSocial;
		Direccion = direccion;
		Distrito = distrito;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public long getRUC() {
		return RUC;
	}

	public void setRUC(long rUC) {
		RUC = rUC;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		Distrito = distrito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Direccion == null) ? 0 : Direccion.hashCode());
		result = prime * result + ((Distrito == null) ? 0 : Distrito.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + (int) (RUC ^ (RUC >>> 32));
		result = prime * result + ((RazonSocial == null) ? 0 : RazonSocial.hashCode());
		result = prime * result + idEmpresa;
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
		Empresa other = (Empresa) obj;
		if (Direccion == null) {
			if (other.Direccion != null)
				return false;
		} else if (!Direccion.equals(other.Direccion))
			return false;
		if (Distrito == null) {
			if (other.Distrito != null)
				return false;
		} else if (!Distrito.equals(other.Distrito))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (RUC != other.RUC)
			return false;
		if (RazonSocial == null) {
			if (other.RazonSocial != null)
				return false;
		} else if (!RazonSocial.equals(other.RazonSocial))
			return false;
		if (idEmpresa != other.idEmpresa)
			return false;
		return true;
	}

	
}
