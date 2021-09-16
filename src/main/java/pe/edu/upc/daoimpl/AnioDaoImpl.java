package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iAnioDao;
import pe.edu.upc.entity.Anio;

public class AnioDaoImpl implements iAnioDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Anio anio) {
		em.persist(anio);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Anio> listar() {
		List<Anio> lista = new ArrayList<Anio>();
		Query q= em.createQuery("select a from Anio a");
		lista = (List<Anio>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idAnio) {
		Anio anio = new Anio();
		anio = em.getReference(Anio.class, idAnio);
		em.remove(anio);
		// TODO Auto-generated method stub
		
	}
}
