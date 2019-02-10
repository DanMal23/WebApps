package beanpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class WebOption {
	private String maven;
	private String catalina;
	private String glassfish;
	private String spring;
	private String style;
	private String soap;
	private String jboss;
	private String servlets;
	private String json;

	public String getMaven() {
		return maven;
	}

	public void setMaven(String maven) {
		this.maven = maven;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getSoap() {
		return soap;
	}

	public void setSoap(String soap) {
		this.soap = soap;
	}

	public String getJboss() {
		return jboss;
	}

	public void setJboss(String jboss) {
		this.jboss = jboss;
	}

	public String getServlets() {
		return servlets;
	}

	public void setServlets(String servlets) {
		this.servlets = servlets;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public WebOption() {		
	}

	public String getWoption() {
		return maven;
	}

	public void setWoption(String woption) {
		this.maven = woption;
	}

	public String getCatalina() {
		return catalina;
	}

	public void setCatalina(String catalina) {
		this.catalina = catalina;
	}

	public String getGlassfish() {
		return glassfish;
	}

	public void setGlassfish(String glassfish) {
		this.glassfish = glassfish;
	}

	public String getSpring() {
		return spring;
	}

	public void setSpring(String spring) {
		this.spring = spring;
	}
	
	
	
}
