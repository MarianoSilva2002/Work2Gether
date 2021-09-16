package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iTiempoActividadDao;
import pe.edu.upc.entity.TiempoActividad;

public class TiempoActividadDaoImpl implements iTiempoActividadDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(TiempoActividad tiempo) {
		em.persist(tiempo);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TiempoActividad> listar() {
		List<TiempoActividad> lista = new ArrayList<TiempoActividad>();
		Query q= em.createQuery("select t from TiempoActividad t");
		lista = (List<TiempoActividad>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idTiempoActividad) {
		TiempoActividad tiempo = new TiempoActividad();
		tiempo = em.getReference(TiempoActividad.class, idTiempoActividad);
		em.remove(tiempo);
		// TODO Auto-generated method stub
		
	}
}
