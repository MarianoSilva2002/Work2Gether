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
	private int RUC;
	
	@Column(name="Razon_Social", nullable = false, length = 60)
	private String RazonSocial;
	
	@Column(name="Direccion", nullable = false, length = 60)
	private String Correo;
	
	@Column(name="Distrito", nullable = false, length = 60)
	private String Distrito;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(int idEmpresa, String nombre, int rUC, String razonSocial, String correo, String distrito) {
		super();
		this.idEmpresa = idEmpresa;
		Nombre = nombre;
		RUC = rUC;
		RazonSocial = razonSocial;
		Correo = correo;
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

	public int getRUC() {
		return RUC;
	}

	public void setRUC(int rUC) {
		RUC = rUC;
	}

	public String getRazonSocial() {
		return RazonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		RazonSocial = razonSocial;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDistrito() {
		return Distrito;
	}

	public void setDistrito(String distrito) {
		Distrito = distrito;
	}

}
