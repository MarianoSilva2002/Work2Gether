package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iEmpleadoDao;
import pe.edu.upc.entity.Empleado;
import pe.edu.upc.service.iEmpleadoService;

@Named
@RequestScoped
public class EmpleadoServiceImpl implements iEmpleadoService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iEmpleadoDao eD;

	@Override
	public void insertar(Empleado empleado) {
		eD.insertar(empleado);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleado> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int idEmpleado) {
		eD.eliminar(idEmpleado);
	}
	
	
}
