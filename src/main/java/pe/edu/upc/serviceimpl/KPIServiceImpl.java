package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iKPIDao;
import pe.edu.upc.entity.KPI;
import pe.edu.upc.service.iKPIService;

@Named
@RequestScoped
public class KPIServiceImpl implements iKPIService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iKPIDao kD;

	@Override
	public void insertar(KPI kpi) {
		kD.insertar(kpi);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KPI> listar() {
		return kD.listar();
	}

	@Override
	public void eliminar(int idKPI) {
		kD.eliminar(idKPI);
	}
	
	
}
