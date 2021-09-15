package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.iEmpresaDao;
import pe.edu.upc.entity.Empresa;
import pe.edu.upc.service.iEmpresaService;

@Named
@RequestScoped
public class EmpresaServiceImpl implements iEmpresaService, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private iEmpresaDao eD;

	@Override
	public void insertar(Empresa empresa) {
		eD.insertar(empresa);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Empresa> listar() {
		return eD.listar();
	}

	@Override
	public void eliminar(int idEmpresa) {
		eD.eliminar(idEmpresa);
	}
	
	
}
