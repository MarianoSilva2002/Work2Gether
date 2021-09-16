package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iMesDao;
import pe.edu.upc.entity.Mes;
import pe.edu.upc.service.iMesService;

@Named
@RequestScoped
public class MesServiceImpl implements iMesService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iMesDao mD;

	@Override
	public void insertar(Mes mes) {
		mD.insertar(mes);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Mes> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idMes) {
		mD.eliminar(idMes);
	}
	
	
}
