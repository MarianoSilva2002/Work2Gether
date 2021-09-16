package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Mensajes;

public interface iMensajesService {
	public void insertar(Mensajes mensaje);
	public List<Mensajes> listar();
	public void eliminar(int idMensaje);
}
