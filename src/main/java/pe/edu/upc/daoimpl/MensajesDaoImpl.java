package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iMensajesDao;
import pe.edu.upc.entity.Mensajes;

public class MensajesDaoImpl implements iMensajesDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Mensajes mensaje) {
		em.persist(mensaje);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mensajes> listar() {
		List<Mensajes> lista = new ArrayList<Mensajes>();
		Query q= em.createQuery("select m from Mensajes m");
		lista = (List<Mensajes>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idMensaje) {
		Mensajes mensaje = new Mensajes();
		mensaje = em.getReference(Mensajes.class, idMensaje);
		em.remove(mensaje);
		// TODO Auto-generated method stub
		
	}
}
