package in.co.rays.spring.service;

import java.util.List;

import in.co.rays.spring.dto.RoleDTO;
import in.co.rays.spring.exception.DuplicateRecordException;

public interface RoleServiceInt {
	
	public long add(RoleDTO dto)throws DuplicateRecordException;
	
	public void update(RoleDTO dto)throws DuplicateRecordException;
	
    public void delete(long id);
    
    public RoleDTO findbyname(String rolename);
    
    public RoleDTO findbyid(long id);
    
    public List search(RoleDTO dto , int pagNo , int pageSize);
	
    
    public List search(RoleDTO dto);
}
