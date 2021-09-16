package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iAnioDao;
import pe.edu.upc.entity.Anio;
import pe.edu.upc.service.iAnioService;

@Named
@RequestScoped
public class AnioServiceImpl implements iAnioService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iAnioDao aD;

	@Override
	public void insertar(Anio anio) {
		aD.insertar(anio);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Anio> listar() {
		return aD.listar();
	}

	@Override
	public void eliminar(int idAnio) {
		aD.eliminar(idAnio);
	}
	
	
}
