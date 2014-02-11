package com.st.common.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.Size;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * base class intended to be used in all the domain classes which have a common 
 * set of columns, and use hibernate or JPA as persistence layer.
 *  
 * @author Ganesan
 *
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
	
	public BaseEntity() {
		Date date = new Date();
		String userId = "";
		
		this.createdDate = date;
		this.createdBy = userId;
		this.updatedDate = date;
		this.updatedBy = userId;
		this.id = "{" + UUID.randomUUID().toString() +"}";
		this.actionId = null;
	}
	
	/**
	 * default serial version ID
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	/**
	 * shall we use GUID as the value for the ID field? it is support by some
	 * big database such as Oracle, MySQL etc. There will be problem to do unit
	 * testing with GUID strategy due to embedded Database does not have GUID
	 * capability build in. 
	*/
	@Id
//	@GeneratedValue(generator="GUIDGenerator")
//	@GenericGenerator(name="GUIDGenerator", strategy="com.stee.ers.common.entity.ErsGUIDGenerator")
	@Column(name = "id", updatable = false, nullable = false, length=38)
	private String id = null;

	@Version
	@Column(name = "version")
	private int version = 0;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", updatable=false)
	private Date createdDate;

	@Column(name = "created_by", updatable=false)
	@Size(max=64)
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "updated_by")
	@Size(max=64)
	private String updatedBy;
	
	@Column(name = "action_id")
	@Size(max=38)
	private String actionId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id != null && !id.isEmpty()) {
			this.id = id;
		}
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = new Date();
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		//Changed to include schedule jobs
		if(updatedBy != null && updatedBy.equalsIgnoreCase("SYSTEM")) {
			this.updatedBy = updatedBy;
		}
	}
	
	public void setCreateModifier(String createdBy, Date createdDate) {
		if( createdBy != null && !createdBy.trim().isEmpty() ) {
			this.createdBy = createdBy;
		}
		if( createdDate != null ) {
			this.createdDate = createdDate;
		}		
	}
	
	public void updateModifier() {
		this.updatedDate = new Date();
		this.updatedBy = "System";
	}
	
	public String getActionId() {
		return actionId;
	}

	//In the transaction tables, set the generated action id.
	public void setActionId(String actionId) {
		this.actionId = actionId;
	}
	
	//This function needs to be invoked if need the reference need to be stored in transaction tables.
	public void generateActionId() {
		this.actionId = UUID.randomUUID().toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * Method to get a String representing the current state of the java content
	 * tree for the message.
	 * 
	 * @return string of fields listed within the content tree.
	 */
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}
}

