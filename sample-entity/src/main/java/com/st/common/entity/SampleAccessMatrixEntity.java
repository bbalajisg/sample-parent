/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;


/** 
 * <p>Class Description This is a AccessMatrixEntity 
 *  class doing Data Access Right, This class is association with ResourceTablesEntity and DesignationGroupEntity.</p>
 *
 * @since Jan 12, 2011
 *
 * @author Ganesan
 * @version 1.0
 *
 * <p> Change History : <br><br>
 *
 * <TABLE WIDTH=605 BORDER=1 BORDERCOLOR="#000000" CELLPADDING=7 CELLSPACING=0>
 * <TR VALIGN=TOP>
 * <TD WIDTH=10 BGCOLOR="#cccccc">
 * <P ALIGN=CENTER><FONT COLOR="#000000"><B>S.No.</B></FONT></P></TD>
 * <TD WIDTH=60 BGCOLOR="#cccccc">
 * <P ALIGN=CENTER><FONT COLOR="#000000"><B>CR_No</B></FONT></P></TD>
 * <TD WIDTH=100 BGCOLOR="#cccccc">
 * <P ALIGN=CENTER><FONT COLOR="#000000"><B>Modified by</B></FONT></P></TD>
 * <TD WIDTH=60 BGCOLOR="#cccccc">
 * <P ALIGN=CENTER><FONT COLOR="#000000"><B>Date Modified</B></FONT></P></TD>
 * <TD WIDTH=500 BGCOLOR="#cccccc">
 * <P ALIGN=CENTER><FONT COLOR="#000000"><B>Comments</B></FONT></P></TD>
 * </TR>
 * <TR>
 * <TD></TD>
 * <TD></TD>
 * <TD></TD>
 * <TD></TD>
 * <TD></TD>
 * </TR>
 * </TABLE>
 * </p>
 */
@Entity
@Table(name="Sample_AccessMatrix")
//@Cache(usage = CacheConcurrencyStrategy.TRANSACTIONAL)
public class SampleAccessMatrixEntity extends BaseEntity{

	
	private static final long serialVersionUID = 4910150050958766941L;


	@Column
	private String resourceTableId;
	
	@Column
	private String designationGroupId;
	
	@Column
	private String	reqDesignId;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	
	@Column(nullable=false)
	@Type(type = "true_false")
	private boolean createRights;
	

	@Column(nullable=false)
	@Type(type = "true_false")
	private boolean viewRights;
	
	@Column(nullable=false)
	@Type(type = "true_false")
	private boolean updateRights;
	
	@Column(nullable=false)
	@Type(type = "true_false")
	private boolean deleteRights;
	
	
	
	
	public String getResourceTableId() {
		return resourceTableId;
	}

	
	public void setResourceTableId(String resourceTableId) {
		this.resourceTableId = resourceTableId;
	}

	
	public String getDesignationGroupId() {
		return designationGroupId;
	}

	
	public void setDesignationGroupId(
			String designationGroupId) {
		this.designationGroupId = designationGroupId;
	}
	

	
	public String getReqDesignId() {
		return reqDesignId;
	}

	
	public void setReqDesignId(String reqDesignId) {
		this.reqDesignId = reqDesignId;
	}
	/**
	 * Retrieve the Resource table create Access Right 
	 * @return createRights : A variable of type boolean(true or false)
	 */
	public boolean isCreateRights() {
		return createRights;
	}
	/**
	 * Set the createRights to the ResourceTable
	 * 
	 * @param createRights
	 *            :A variable of type boolean (true or false)
	 */
	public void setCreateRights(boolean createRights) {
		this.createRights = createRights;
	}

	/**
	 * Retrieve the Resource table view Access Right 
	 * @return viewRights : A variable of type boolean(true or false)
	 */
	public boolean isViewRights() {
		return viewRights;
	}
	/**
	 * Set the viewRights to the ResourceTable
	 * 
	 * @param viewRights
	 *            :A variable of type boolean (true or false)
	 */
	public void setViewRights(boolean viewRights) {
		this.viewRights = viewRights;
	}

	/**
	 * Retrieve the Resource table update Access Right 
	 * @return updateRights : A variable of type boolean(true or false)
	 */
	public boolean isUpdateRights() {
		return updateRights;
	}

	/**
	 * Set the updateRights to the ResourceTable
	 * 
	 * @param updateRights
	 *            :A variable of type boolean (true or false)
	 */
	public void setUpdateRights(boolean updateRights) {
		this.updateRights = updateRights;
	}

	/**
	 * Retrieve the Resource table delete Access Right 
	 * @return deleteRights : A variable of type boolean(true or false)
	 */
	public boolean isDeleteRights() {
		return deleteRights;
	}

	/**
	 * Set the deleteRights to the ResourceTable
	 * 
	 * @param deleteRights
	 *            :A variable of type boolean (true or false)
	 */
	public void setDeleteRights(boolean deleteRights) {
		this.deleteRights = deleteRights;
	}
   
	
	
}
