package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iEmpleadoDao;
import pe.edu.upc.entity.Empleado;

public class EmpleadoDaoImpl implements iEmpleadoDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Empleado empleado) {
		em.persist(empleado);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empleado> listar() {
		List<Empleado> lista = new ArrayList<Empleado>();
		Query q= em.createQuery("select emp from Empleado emp");
		lista = (List<Empleado>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEmpleado) {
		Empleado empleado = new Empleado();
		empleado = em.getReference(Empleado.class, idEmpleado);
		em.remove(empleado);
		// TODO Auto-generated method stub
		
	}
}
