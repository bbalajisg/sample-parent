/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.dao.hibernate;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.st.common.dao.SampleTableDao;
import com.st.common.entity.SampleAccessMatrixEntity;
import com.st.common.entity.SampleTableEntity;

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
@Repository("SampleTableDao")
public class SampleTableDaoImpl implements SampleTableDao{

	@Resource
	private HibernateTemplate hibernateTemplate;
	
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Override
	public String insertSampleTable(SampleTableEntity sampleEntity) {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin insertSampleTable");
		String sampleId=hibernateTemplate.save(sampleEntity).toString();
		if(logger.isDebugEnabled())	logger.debug("WS: End insertSampleTable");
		return sampleId;
	}

	@Override
	public void deleteSampleTable(String id) {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin deleteSampleTable");
		SampleTableEntity sampleEntity=hibernateTemplate.get(SampleTableEntity.class,id);
		hibernateTemplate.delete(sampleEntity);		
		if(logger.isDebugEnabled())	logger.debug("WS: End deleteSampleTable");
	}

	@Override
	public void updateSampleTable(SampleTableEntity sampleEntity) {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin updateSampleTable");
		hibernateTemplate.update(sampleEntity);
		if(logger.isDebugEnabled())	logger.debug("WS: End updateSampleTable");		
	}

	@Override
	public SampleTableEntity findSampleTable(String id) {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin findSampleTable");
		SampleTableEntity sampleEntity=hibernateTemplate.get(SampleTableEntity.class,id);
		if(logger.isDebugEnabled())	logger.debug("WS: End findSampleTable");		
		return sampleEntity;
	}
	@Override
	public List<SampleTableEntity> listSampleTable() {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin listSampleTable");
	    @SuppressWarnings("unchecked")
		List<SampleTableEntity> sampleEntities=hibernateTemplate.find("from SampleTableEntity ");
	    if(logger.isDebugEnabled())	logger.debug("WS: End listSampleTable");		
		return sampleEntities;
	}

	
	@Override
	public List<SampleAccessMatrixEntity> listSampleAccessMatrixEntities() {
		if(logger.isDebugEnabled())	logger.debug("WS: Begin listSampleAccessMatrixEntities");
	    @SuppressWarnings("unchecked")
		List<SampleAccessMatrixEntity> sampleAccessMatrixEntities=hibernateTemplate.find("from SampleAccessMatrixEntity ");
	    if(logger.isDebugEnabled())	logger.debug("WS: End listSampleAccessMatrixEntities");		
		return sampleAccessMatrixEntities;
	}
	
	
	
}

   
