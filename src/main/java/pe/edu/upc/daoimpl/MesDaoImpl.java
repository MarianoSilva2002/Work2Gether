package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iMesDao;
import pe.edu.upc.entity.Mes;

public class MesDaoImpl implements iMesDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Mes actividad) {
		em.persist(actividad);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mes> listar() {
		List<Mes> lista = new ArrayList<Mes>();
		Query q= em.createQuery("select a from Mes a");
		lista = (List<Mes>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idMes) {
		Mes mes = new Mes();
		mes = em.getReference(Mes.class, idMes);
		em.remove(mes);
		// TODO Auto-generated method stub
		
	}
}
