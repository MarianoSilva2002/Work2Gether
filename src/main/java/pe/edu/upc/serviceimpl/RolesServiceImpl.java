package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iRolesDao;
import pe.edu.upc.entity.Roles;
import pe.edu.upc.service.iRolesService;

@Named
@RequestScoped
public class RolesServiceImpl implements iRolesService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iRolesDao rD;

	@Override
	public void insertar(Roles rol) {
		rD.insertar(rol);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Roles> listar() {
		return rD.listar();
	}

	@Override
	public void eliminar(int idRol) {
		rD.eliminar(idRol);
	}
	
	
}
