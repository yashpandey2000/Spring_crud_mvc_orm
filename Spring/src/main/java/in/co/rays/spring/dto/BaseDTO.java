package in.co.rays.spring.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;


@MappedSuperclass
public abstract class BaseDTO implements Serializable ,Comparable<BaseDTO>,DropdownList{
	
	@Id
	@GenericGenerator(name="hiIncrement",strategy="increment")
	@GeneratedValue(generator="hiIncrement")
	@Column(name="ID",unique=true,nullable=false)
	protected long id;
	
	@Column(name="CREATED_BY",length=50)
	protected String createdBy;

	/** The modified by. */
	@Column(name="MODIFIED_BY",length=50)
	protected String modifiedBy;

	/** The created date time. */
	@Column(name="CREATED_DATE_TIME")
	protected Timestamp createdDateTime;

	/** The modified date time. */
	@Column(name="MODIFIED_DATE_TIME")
	protected Timestamp modifiedDateTime;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}


	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}


	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}



}
