/* Copyright © 2010, ST Electronics Info-comm Systems PTE. LTD All rights reserved.
 *
 * This software is confidential and proprietary property of 
 * ST Electronics (Info-comm Systems) PTE. LTD.
 * The user shall not disclose the contents of this software and shall
 * only use it in accordance with the terms and conditions stated in
 * the contract or license agreement with ST Electronics Info-comm Systems PTE. LTD.
 */
package com.st.common.service.ws;


import java.util.List;


import javax.jws.WebMethod;

import javax.jws.WebService;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.st.common.domain.SampleAccessMatrix;
import com.st.common.domain.SampleTable;
import com.st.common.facade.SampleTableFacade;
import com.st.common.service.SampleTableServices;



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
@WebService(serviceName = "sampleServices", targetNamespace = "http://sample.st.com.sg/common")
public class SampleTableServicesWs  extends SpringBeanAutowiringSupport implements SampleTableServices {
	
	@Autowired
	private SampleTableFacade sampleTableFacade;

	
	
	private final Log logger = LogFactory.getLog(this.getClass());
	
	@Override
	@WebMethod
	public String insertSampleTable(SampleTable sampleTable) {
		
		if(logger.isDebugEnabled())	logger.debug("WS:Begin  insertSampleTable : sampleTable = "+sampleTable.getName());
		try{
		String id= sampleTableFacade.insertSampleTable(sampleTable);
		if(logger.isDebugEnabled())	logger.debug("WS: End insertSampleTable : id return = "+id);
		if(logger.isDebugEnabled())	logger.debug("WS: End insertSampleTable : SampleTable = "+sampleTable.getName());	
		return id;
		} 		
		catch(Exception exp) {
			
		}
		return null;
	}

	@Override
	@WebMethod
	public void deleteSampleTable(String id) {
		
		if(logger.isDebugEnabled())	logger.debug("WS: Begin deleteSampleTable : Id = "+id);
		if(id == null || id.trim().isEmpty()){
			if(logger.isDebugEnabled()){
				logger.debug("WS: Inside deleteSampleTable : ID is NULL");
			}
		}
		else{
			try{
				sampleTableFacade.deleteSampleTable(id);
				if(logger.isDebugEnabled())	logger.debug("WS: End deleteSampleTable");
			}
			catch(Exception excp) {
				
			}
		}
	}

	

	@Override
	@WebMethod
	public List<SampleTable> listSampleTable() {
		
		if(logger.isDebugEnabled()){
			logger.debug("WS: Inside listSampleTable ");
		}
		try{
			List<SampleTable> sampleTables=sampleTableFacade.listSampleTable();
			return sampleTables;
		}  
		catch(Exception excp) {
			
		}
		return null;
	}

	@Override
	public List<SampleAccessMatrix> listSampleAccessMatrices() {
		if(logger.isDebugEnabled()){
			logger.debug("WS: Inside listSampleTable ");
		}
		try{
			List<SampleAccessMatrix> accessMatrices=sampleTableFacade.listSampleAccessMatrices();
			return accessMatrices;
		}  
		catch(Exception excp) {
			
		}
		return null;
	}

	
	
	
	
}
