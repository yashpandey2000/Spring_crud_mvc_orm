package in.co.rays.spring.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.co.rays.spring.dto.RoleDTO;

@Repository("roleDAO")
public class RoleDAOHibImpl implements RoleDAOInt {

	@Autowired
	SessionFactory sessionFactory = null;

	// private static Logger log = Logger.getLogger(RoleDAOHibImpl.class);

	public long add(RoleDTO dto) {
		// log.debug("Role Dao Add Started");
		System.out.println("1DAO");
		
		long pk = (Long) sessionFactory.getCurrentSession().save(dto);
		// log.debug("Role Dao Add End");

		return pk;
	}

	public void update(RoleDTO dto) {
		// TODO Auto-generated method stub

	}

	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	public RoleDTO findbyname(String rolename) {
		
		//log.debug("Role DAO Find by Name Started");
		RoleDTO dto=null;
		System.out.println("findbyname started");
		List list=sessionFactory.getCurrentSession().createCriteria(RoleDTO.class).add(Restrictions.eq("rolename",rolename)).list();
        System.out.println("list return size"+list.size());
		if(list.size()>0){
        	dto=(RoleDTO)list.get(0);
        }
        System.out.println("dto value"+dto);
       // log.debug("Role DAO Find by Name Ended");
		return dto;
		
		
	}

	public RoleDTO findbypk(long pk) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
