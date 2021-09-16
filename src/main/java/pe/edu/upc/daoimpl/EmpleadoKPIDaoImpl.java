package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iEmpleadoKPIDao;
import pe.edu.upc.entity.Empleado_KPI;

public class EmpleadoKPIDaoImpl implements iEmpleadoKPIDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Empleado_KPI empleado_kpi) {
		em.persist(empleado_kpi);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado_KPI> listar() {
		List<Empleado_KPI> lista = new ArrayList<Empleado_KPI>();
		Query q= em.createQuery("select e from Empleado_KPI e");
		lista = (List<Empleado_KPI>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEmpleado_KPI) {
		Empleado_KPI empleadoKPI = new Empleado_KPI();
		empleadoKPI = em.getReference(Empleado_KPI.class, idEmpleado_KPI);
		em.remove(empleadoKPI);
		// TODO Auto-generated method stub
		
	}
}
