package in.co.rays.spring.test;

import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.spring.dto.RoleDTO;
import in.co.rays.spring.exception.DuplicateRecordException;
import in.co.rays.spring.service.RoleServiceInt;



@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
public class TestRole{
	
	
	@Autowired
RoleServiceInt model;

	
	@Test
	public void testadd(){
		
		RoleDTO dto = new RoleDTO();
		dto.setRolename("ADMIN");
		dto.setDescription("hello i am admin,yash");
		try{
		model.add(dto);
		}catch (DuplicateRecordException e) {
			e.printStackTrace();
			fail("testadd");
		}
		
	}
	
	@Ignore
	public void testfindbyname(){
		
		RoleDTO dto = new RoleDTO();
		
		List list = (List) model.findbyname("staff");
		
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
		
			dto = (RoleDTO) it.next();
		System.out.println(dto.getRolename());
		System.out.println(dto.getDescription());
		System.out.println(dto.getId());
	
		}
		
	}
	
	
@Ignore
public void testdelete(){
	model.delete(2l);
}
	
	

}
