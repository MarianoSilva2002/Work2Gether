package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iTiempoActividadDao;
import pe.edu.upc.entity.TiempoActividad;
import pe.edu.upc.service.iTiempoActividadService;

@Named
@RequestScoped
public class TiempoActividadServiceImpl implements iTiempoActividadService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iTiempoActividadDao tD;

	@Override
	public void insertar(TiempoActividad tiempo) {
		tD.insertar(tiempo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TiempoActividad> listar() {
		return tD.listar();
	}

	@Override
	public void eliminar(int idTiempoActividad) {
		tD.eliminar(idTiempoActividad);
	}
	
	
}
