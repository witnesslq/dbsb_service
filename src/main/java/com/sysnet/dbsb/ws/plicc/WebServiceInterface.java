package com.sysnet.dbsb.ws.plicc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "WebServiceInterface", targetNamespace = "http://webservice.create.com/")
public interface WebServiceInterface {

	/**
	 * 
	 * @param root
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "excute", targetNamespace = "http://webservice.create.com/", className = "com.sysnet.dbsb.client.Excute")
	@ResponseWrapper(localName = "excuteResponse", targetNamespace = "http://webservice.create.com/", className = "com.sysnet.dbsb.client.ExcuteResponse")
	public String excute(@WebParam(name = "root", targetNamespace = "")
	String root);

}
