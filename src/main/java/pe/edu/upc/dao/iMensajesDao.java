package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Mensajes;

public interface iMensajesDao {
	public void insertar(Mensajes mensaje);
	public List<Mensajes> listar();
	public void eliminar(int idMensaje);
}
