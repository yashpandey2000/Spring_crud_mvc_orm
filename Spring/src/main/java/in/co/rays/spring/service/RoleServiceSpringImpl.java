package in.co.rays.spring.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.rays.spring.dao.RoleDAOInt;
import in.co.rays.spring.dto.RoleDTO;
import in.co.rays.spring.exception.DuplicateRecordException;

@Service("roleService")
public class RoleServiceSpringImpl implements RoleServiceInt{

	
	@Autowired
	private RoleDAOInt dao ;
	
	
	//private static Logger log = Logger.getLogger(RoleServiceSpringImpl.class);
	
	@Transactional(propagation=Propagation.REQUIRED,readOnly=false)
	public long add(RoleDTO dto) throws DuplicateRecordException {
		// TODO Auto-generated method stub
		//log.debug("Role Service Add Started");
		
		/*RoleDTO dtoexist = dao.findbyname(dto.getRolename());
		if(dtoexist!=null){
			throw new DuplicateRecordException("Role Already Exist !!");
		}*/
		
		System.out.println("1S");
		
		long pk = dao.add(dto);
		//log.debug("Role Service Add Ended");
		System.out.println("2S");
		
		return pk;
	}

	public void update(RoleDTO dto) throws DuplicateRecordException {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Transactional(propagation=Propagation.REQUIRED , readOnly=false)
	public RoleDTO findbyname(String rolename) {
		
		//log.debug("Role Service findByName Started");
        RoleDTO dto = dao.findbyname(rolename);
      //  log.debug("Role Service findByName Ended");
        return dto;
	}

	public RoleDTO findbyid(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto, int pagNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public List search(RoleDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
