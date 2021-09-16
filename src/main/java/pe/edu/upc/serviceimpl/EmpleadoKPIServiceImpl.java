package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iEmpleadoKPIDao;
import pe.edu.upc.entity.Empleado_KPI;
import pe.edu.upc.service.iEmpleadoKPIService;

@Named
@RequestScoped
public class EmpleadoKPIServiceImpl implements iEmpleadoKPIService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iEmpleadoKPIDao eD;

	@Override
	public void insertar(Empleado_KPI empleadoKPI) {
		eD.insertar(empleadoKPI);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empleado_KPI> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int idEmpleadoKPI) {
		eD.eliminar(idEmpleadoKPI);
	}
	
	
}
