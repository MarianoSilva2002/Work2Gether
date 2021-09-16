package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iRolesDao;
import pe.edu.upc.entity.Roles;

public class RolesDaoImpl implements iRolesDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Roles roles) {
		em.persist(roles);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Roles> listar() {
		List<Roles> lista = new ArrayList<Roles>();
		Query q= em.createQuery("select r from Roles r");
		lista = (List<Roles>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idRol) {
		Roles rol = new Roles();
		rol = em.getReference(Roles.class, idRol);
		em.remove(rol);
		// TODO Auto-generated method stub
		
	}
}
