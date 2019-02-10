package beanpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class JavaSpringOption {

	private String ioc1;
	private String customevent;
	private String stateless;
	private String transaction;
	private String beanfactory;
	private String ioc2;
	private String beans;
	private String notmodule;
	private String beaninjection;
	private String awtypes;
	private String controller;
	private String ditypes;
	
	public JavaSpringOption() {
		
	}

	public String getIoc1() {
		return ioc1;
	}

	public void setIoc1(String ioc1) {
		this.ioc1 = ioc1;
	}

	public String getCustomevent() {
		return customevent;
	}

	public void setCustomevent(String customevent) {
		this.customevent = customevent;
	}

	public String getStateless() {
		return stateless;
	}

	public void setStateless(String stateless) {
		this.stateless = stateless;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getBeanfactory() {
		return beanfactory;
	}

	public void setBeanfactory(String beanfactory) {
		this.beanfactory = beanfactory;
	}

	public String getIoc2() {
		return ioc2;
	}

	public void setIoc2(String ioc2) {
		this.ioc2 = ioc2;
	}

	public String getBeans() {
		return beans;
	}

	public void setBeans(String beans) {
		this.beans = beans;
	}

	public String getNotmodule() {
		return notmodule;
	}

	public void setNotmodule(String notmodule) {
		this.notmodule = notmodule;
	}

	public String getBeaninjection() {
		return beaninjection;
	}

	public void setBeaninjection(String beaninjection) {
		this.beaninjection = beaninjection;
	}

	public String getAwtypes() {
		return awtypes;
	}

	public void setAwtypes(String awtypes) {
		this.awtypes = awtypes;
	}

	public String getController() {
		return controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getDitypes() {
		return ditypes;
	}

	public void setDitypes(String ditypes) {
		this.ditypes = ditypes;
	}

}
