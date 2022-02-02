package in.co.rays.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="st")

public class RoleDTO extends BaseDTO {
	
	public static final int ADMIN = 1;
	
	public static final int STUDENT = 2;
	
	public static final int COLLEGE = 3 ;
	
	
	@Column(name="role_name" , length=50)
	private String rolename;
	@Column(name="Description" , length=70)
	private String description;
	
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int compareTo(BaseDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getkey() {
		// TODO Auto-generated method stub
		return id+"";
	}
	public String getvalue() {
		// TODO Auto-generated method stub
		return rolename;
	}
    
	

}
