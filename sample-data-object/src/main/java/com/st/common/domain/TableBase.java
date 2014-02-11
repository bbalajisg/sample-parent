/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.domain;

import java.io.Serializable;
import java.util.Date;


/** 
 * <p>Class Description This is a ...
 * ... class doing ... </p>
 *
 * @since Dec 21, 2010
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

public abstract class TableBase implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id = null;

	private int version = 0;

	private Date createdDate;

	private Date updatedDate;

    private String createdBy;
    
    private String updatedBy;


	

	/**
	 * Method to get a String representing the current state of the java content
	 * tree for the message.
	 * 
	 * @return string of fields listed within the content tree.
	 */
//	@Override
//	public String toString() {
//		return ReflectionToStringBuilder.toString(this,
//				ToStringStyle.MULTI_LINE_STYLE);
//	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TableBase other = (TableBase) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
