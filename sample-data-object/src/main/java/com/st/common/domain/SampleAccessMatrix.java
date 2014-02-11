/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.domain;




/** 
 * <p>Class Description This is a ...
 * ... class doing ... </p>
 *
 * @since Jan 13, 2011
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

public class SampleAccessMatrix extends TableBase{

	
	private static final long serialVersionUID = 1L;

	private String resourceTableId;
	
	private String designationGroupId;
	
	
	private String reqDesignId;
	
	private boolean createRights;
	
	

	private boolean viewRights;
	
	private boolean updateRights;
	
	private boolean deleteRights;
	

	
	/**
	 * Retrieve the value of resourceTableId
	 * @return resourceTableId
	 * 					: A variable of type String
	 */
	public String getResourceTableId() {
		return resourceTableId;
	}

	/**
	 * Set the  Resource Table Id(resourceTableId)
	 * 
	 * @param resourceTableId
	 *            :A variable of type String 
	 */
	public void setResourceTableId(String resourceTableId) {
		this.resourceTableId = resourceTableId;
	}

	/**
	 * Retrieve the value of designationGroupId
	 * @return designationGroupId
	 * 					: A variable of type String
	 */
	public String getDesignationGroupId() {
		return designationGroupId;
	}

	/**
	 * Set the  Designation Group Id(designationGroupId)
	 * 
	 * @param designationGroupId
	 *            :A variable of type String 
	 */
	public void setDesignationGroupId(String designationGroupId) {
		this.designationGroupId = designationGroupId;
	}

	/**
	 * Retrieve the value of Requested Designation Group Id( reqDesignId)
	 * @return reqDesignId
	 * 					: A variable of type String
	 */
	public String getReqDesignId() {
		return reqDesignId;
	}

	/**
	 * Set the Requested Designation Group Id(reqDesignId)
	 * 
	 * @param reqDesignId
	 *            :A variable of type String 
	 */
	public void setReqDesignId(String reqDesignId) {
		this.reqDesignId = reqDesignId;
	}
	/**
	 * Retrieve the status of the createRights
	 * @return createRights
	 * 					: A variable of type boolean
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
	 * Retrieve the status of the ViewRights
	 * @return viewRights
	 * 					: A variable of type boolean
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
	 * Retrieve the status of the updateRights
	 * @return updateRights
	 * 					: A variable of type boolean
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
	 * Retrieve the status of the DeleteRights
	 * @return deleteRights
	 * 					: A variable of type boolean
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
