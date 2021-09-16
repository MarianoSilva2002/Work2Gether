package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iMensajesDao;
import pe.edu.upc.entity.Mensajes;
import pe.edu.upc.service.iMensajesService;

@Named
@RequestScoped
public class MensajesServiceImpl implements iMensajesService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iMensajesDao mD;

	@Override
	public void insertar(Mensajes mensaje) {
		mD.insertar(mensaje);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mensajes> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMensaje) {
		mD.eliminar(idMensaje);
	}
	
	
}
