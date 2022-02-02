package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.userdao;
import springmvc.model.user;

@Service
public class userservice {
	
	
	@Autowired
	private userdao dao;
	
	public int createuser(user us){
		return this.dao.add(us);
		
		
	}

}
