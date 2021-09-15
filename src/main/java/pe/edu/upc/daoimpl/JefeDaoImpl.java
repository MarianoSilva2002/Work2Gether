package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iJefeDao;
import pe.edu.upc.entity.Jefe;

public class JefeDaoImpl implements iJefeDao, Serializable{
private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Jefe jefe) {
		em.persist(jefe);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Jefe> listar() {
		List<Jefe> lista = new ArrayList<Jefe>();
		Query q= em.createQuery("select j from Jefe j");
		lista = (List<Jefe>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idJefe) {
		Jefe jefe = new Jefe();
		jefe = em.getReference(Jefe.class, idJefe);
		em.remove(jefe);
		// TODO Auto-generated method stub
		
	}
}
