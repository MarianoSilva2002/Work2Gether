package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.iEmpresaDao;
import pe.edu.upc.entity.Empresa;

public class EmpresaDaoImpl implements iEmpresaDao, Serializable{

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Empresa empresa) {
		em.persist(empresa);
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Empresa> listar() {
		List<Empresa> lista = new ArrayList<Empresa>();
		Query q= em.createQuery("select emp from Empresa emp");
		lista = (List<Empresa>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override
	public void eliminar(int idEmpresa) {
		Empresa empresa = new Empresa();
		empresa = em.getReference(Empresa.class, idEmpresa);
		em.remove(empresa);
		// TODO Auto-generated method stub
		
	}
	
	@Transactional
	@Override
	public void editar (Empresa empresa) {
		em.merge(empresa);
	}
}
