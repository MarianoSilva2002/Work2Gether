package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iKPIDao;
import pe.edu.upc.entity.KPI;

public class KPIDaoImpl implements iKPIDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(KPI kpi) {
		em.persist(kpi);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<KPI> listar() {
		List<KPI> lista = new ArrayList<KPI>();
		Query q= em.createQuery("select k from KPI k");
		lista = (List<KPI>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idKPI) {
		KPI kpi = new KPI();
		kpi = em.getReference(KPI.class, idKPI);
		em.remove(kpi);
		// TODO Auto-generated method stub
		
	}
}
