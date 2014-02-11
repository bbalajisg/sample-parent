/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.business.impl;

import java.util.ArrayList;

import java.util.List;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.st.common.business.SampleTableManager;
import com.st.common.dao.SampleTableDao;
import com.st.common.domain.SampleAccessMatrix;
import com.st.common.domain.SampleTable;
import com.st.common.entity.SampleAccessMatrixEntity;
import com.st.common.entity.SampleTableEntity;
import com.st.common.util.SampleTableBeanConvertorUtil;


/**
 * <p>
 * Class Description This is a ... ... class doing ...
 * </p>
 * 
 * @since Oct 8, 2011
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
@Component("sampleTableManager")
public class SampleTableManagerImpl implements SampleTableManager {

	private final Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	private SampleTableDao sampleTableDao;

	@Autowired
	private SampleTableBeanConvertorUtil sampleTableManagerBeanConvertor;

	
	
	@Override
	@Transactional
	public String insertSampleTable(SampleTable sampleTable) {
		
		SampleTableEntity sampleTableEntity = sampleTableManagerBeanConvertor.convertSampleTableToSampleTableEntity(sampleTable);
		String sampleTableId = sampleTableDao.insertSampleTable(sampleTableEntity);
		
		return sampleTableId;
	}

	@Override
	@Transactional
	public void deleteSampleTable(String id) {
		sampleTableDao.deleteSampleTable(id);
		logger.info("Delete CodeTable Id received in CodeTableManagerImpl:"
				+ id);
		

	}

	@Override
	public List<SampleTable> listSampleTable() {
		List<SampleTableEntity> sampleTableEntities=sampleTableDao.listSampleTable();
		List<SampleTable> sampleTables=new ArrayList<SampleTable>();
		for(SampleTableEntity sampleTableEntity:sampleTableEntities)
		{
			SampleTable sampleTable=new SampleTable();
			sampleTable=sampleTableManagerBeanConvertor.convertSampleTableEntityToSampleTable(sampleTableEntity);
			sampleTables.add(sampleTable);
		}
		return sampleTables;
	}

	@Override
	public List<SampleAccessMatrix> listSampleAccessMatrices() {
		List<SampleAccessMatrixEntity> sampleAccessMatrixEntities=sampleTableDao.listSampleAccessMatrixEntities();
		List<SampleAccessMatrix> sampleAccessMatrices=new ArrayList<SampleAccessMatrix>();
		for(SampleAccessMatrixEntity sampleAccessMatrixEntity:sampleAccessMatrixEntities)
		{
			SampleAccessMatrix sampleAccessMatrix=new SampleAccessMatrix();
			sampleAccessMatrix=sampleTableManagerBeanConvertor.convertAccessMatrixEntityToAccessMatrix(sampleAccessMatrixEntity);
			sampleAccessMatrices.add(sampleAccessMatrix);
		}
		return sampleAccessMatrices;
	}

}
