/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.util;

import org.springframework.stereotype.Component;


import com.st.common.domain.SampleAccessMatrix;
import com.st.common.domain.SampleTable;
import com.st.common.entity.SampleAccessMatrixEntity;
import com.st.common.entity.SampleTableEntity;

/**
 * <p>
 * Class Description : This is a CodeTableBeanConvertorUtil class doing util functions of codetable
 * Information
 * </p>
 * 
 * @since july 10  ,2012
 * 
 * @author Ganesan
 * @version 1.0
 * 
 *          <p>
 *          Change History : <br>
 *          <br>
 * 
 *          <TABLE WIDTH=605 BORDER=1 BORDERCOLOR="#000000" CELLPADDING=7 CELLSPACING=0>
 *          <TR VALIGN=TOP>
 *          <TD WIDTH=10 BGCOLOR="#cccccc">
 *          <P ALIGN=CENTER>
 *          <FONT COLOR="#000000"><B>S.No.</B></FONT>
 *          </P>
 *          </TD>
 *          <TD WIDTH=60 BGCOLOR="#cccccc">
 *          <P ALIGN=CENTER>
 *          <FONT COLOR="#000000"><B>CR_No</B></FONT>
 *          </P>
 *          </TD>
 *          <TD WIDTH=100 BGCOLOR="#cccccc">
 *          <P ALIGN=CENTER>
 *          <FONT COLOR="#000000"><B>Modified by</B></FONT>
 *          </P>
 *          </TD>
 *          <TD WIDTH=60 BGCOLOR="#cccccc">
 *          <P ALIGN=CENTER>
 *          <FONT COLOR="#000000"><B>Date Modified</B></FONT>
 *          </P>
 *          </TD>
 *          <TD WIDTH=500 BGCOLOR="#cccccc">
 *          <P ALIGN=CENTER>
 *          <FONT COLOR="#000000"><B>Comments</B></FONT>
 *          </P>
 *          </TD>
 *          </TR>
 *          <TR>
 *          <TD></TD>
 *          <TD></TD>
 *          <TD></TD>
 *          <TD></TD>
 *          <TD></TD>
 *          </TR>
 *          </TABLE>
 *          </p>
 */

@Component("sampleTableBeanConvertor")
public class SampleTableBeanConvertorUtil {

	

	public SampleTableEntity convertSampleTableToSampleTableEntity(SampleTable sampleTable){
		SampleTableEntity sampleTableEntity=new SampleTableEntity();
		sampleTableEntity.setId(sampleTable.getId());
		sampleTableEntity.setVersion(sampleTable.getVersion());
		sampleTableEntity.setName(sampleTable.getName());
		sampleTableEntity.setPhoneNumber(sampleTable.getPhoneNumber());
		return sampleTableEntity;
	}
	
	public SampleTable convertSampleTableEntityToSampleTable(SampleTableEntity sampleTableEntity){
		SampleTable sampleTable=new SampleTable();
		sampleTable.setCreatedDate(sampleTableEntity.getCreatedDate());
		if(sampleTableEntity.getCreatedBy()!=null){
		String createdBy=sampleTableEntity.getCreatedBy();
		sampleTable.setCreatedBy(createdBy);
		}
		sampleTable.setUpdatedDate(sampleTableEntity.getUpdatedDate());
		if(sampleTableEntity.getUpdatedBy()!=null){
		String updatedBy=sampleTableEntity.getUpdatedBy();
		sampleTable.setUpdatedBy(updatedBy);
		}
		sampleTable.setId(sampleTableEntity.getId());
		sampleTable.setVersion(sampleTableEntity.getVersion());
		sampleTable.setName(sampleTableEntity.getName());
		sampleTable.setPhoneNumber(sampleTableEntity.getPhoneNumber());
		return sampleTable;
	}
	
	/**
     * Convert AccessMatrixEntity to AccessMatrix
     * @param accessMatrixEntity
     * @return AccessMatrix
     */
	public SampleAccessMatrix convertAccessMatrixEntityToAccessMatrix(SampleAccessMatrixEntity accessMatrixEntity) {
		SampleAccessMatrix accessMatrix = new SampleAccessMatrix();
		accessMatrix.setId(accessMatrixEntity.getId());
		accessMatrix.setCreatedDate(accessMatrixEntity.getCreatedDate());
		accessMatrix.setUpdatedDate(accessMatrixEntity.getUpdatedDate());
		accessMatrix.setVersion(accessMatrixEntity.getVersion());
		accessMatrix.setResourceTableId(accessMatrixEntity.getResourceTableId());				
		accessMatrix.setDesignationGroupId(accessMatrixEntity.getDesignationGroupId());				
		accessMatrix.setReqDesignId(accessMatrixEntity.getReqDesignId());				
		accessMatrix.setCreateRights(accessMatrixEntity.isCreateRights());
		accessMatrix.setViewRights(accessMatrixEntity.isViewRights());
		accessMatrix.setUpdateRights(accessMatrixEntity.isUpdateRights());
		accessMatrix.setDeleteRights(accessMatrixEntity.isDeleteRights());
		return accessMatrix;
	}
	
	public SampleAccessMatrixEntity convertAccessMatrixToAccessMatrixEntity(SampleAccessMatrix accessMatrix) {
		SampleAccessMatrixEntity accessMatrixEntity = new SampleAccessMatrixEntity();
		accessMatrixEntity.setId(accessMatrix.getId());
		//accessMatrixEntity.setCreatedDate(accessMatrix.getCreatedDate());
		//accessMatrixEntity.setUpdatedDate(accessMatrix.getUpdatedDate());
		accessMatrixEntity.setVersion(accessMatrix.getVersion());
		accessMatrixEntity.setResourceTableId(accessMatrix.getResourceTableId());
		accessMatrixEntity.setDesignationGroupId(accessMatrix.getDesignationGroupId());
		accessMatrixEntity.setReqDesignId(accessMatrix.getReqDesignId());
		accessMatrixEntity.setCreateRights(accessMatrix.isCreateRights());
		accessMatrixEntity.setViewRights(accessMatrix.isViewRights());
		accessMatrixEntity.setUpdateRights(accessMatrix.isUpdateRights());
		accessMatrixEntity.setDeleteRights(accessMatrixEntity.isDeleteRights());
		return accessMatrixEntity;
	}
	
}
