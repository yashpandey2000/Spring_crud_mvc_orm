package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.user;

@Repository
public class userdao {
	
	@Autowired 
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int add(user us){
		
	int id = 	(Integer) this.hibernateTemplate.save(us);
		
		return id;
		
	}
	

}
