package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iJefeDao;
import pe.edu.upc.entity.Jefe;
import pe.edu.upc.service.iJefeService;

@Named
@RequestScoped
public class JefeServiceImpl implements iJefeService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iJefeDao jD;

	@Override
	public void insertar(Jefe jefe) {
		jD.insertar(jefe);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Jefe> listar() {
		return jD.listar();
	}
	
	@Override
	public void eliminar(int idJefe) {
		jD.eliminar(idJefe);
	}

	
	
	
}
