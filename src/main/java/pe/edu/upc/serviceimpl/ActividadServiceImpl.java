package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iActividadDao;
import pe.edu.upc.entity.Actividad;
import pe.edu.upc.service.iActividadService;

@Named
@RequestScoped
public class ActividadServiceImpl implements iActividadService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iActividadDao aD;

	@Override
	public void insertar(Actividad actividad) {
		aD.insertar(actividad);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Actividad> listar() {
		return aD.listar();
	}

	@Override
	public void eliminar(int idActividad) {
		aD.eliminar(idActividad);
	}
	
	
}
