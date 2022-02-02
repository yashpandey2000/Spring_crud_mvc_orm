package in.co.rays.spring.dao;

import java.util.List;

import in.co.rays.spring.dto.RoleDTO;

public interface RoleDAOInt {
	
	public long add(RoleDTO dto);
	
	public void update(RoleDTO dto);
	
	public void delete(long id);
	
	public RoleDTO findbyname(String rolename);
	
	public RoleDTO findbypk(long pk);
	
	public List search(RoleDTO dto , int pageNo , int pageSize);
	
	public List search(RoleDTO dto);
}
