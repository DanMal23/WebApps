package beanpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped 
public class JavaOption {

	private String encapsulation;
	private String hashmap;
	private String pack;
	private String interf;
	private String finalize;
	private String overriding;
	private String wrapper;
	private String primitive;
	private String disassambler;
	private String map;
	private String treeset;
	private String stringbuffer;
	
	public String getEncapsulation() {
		return encapsulation;
	}


	public void setEncapsulation(String encapsulation) {
		this.encapsulation = encapsulation;
	}


	public String getHashmap() {
		return hashmap;
	}


	public void setHashmap(String hashmap) {
		this.hashmap = hashmap;
	}


	public String getPack() {
		return pack;
	}


	public void setPack(String pack) {
		this.pack = pack;
	}


	public String getInterf() {
		return interf;
	}


	public void setInterf(String interf) {
		this.interf = interf;
	}


	public String getFinalize() {
		return finalize;
	}


	public void setFinalize(String finalize) {
		this.finalize = finalize;
	}


	public String getOverriding() {
		return overriding;
	}


	public void setOverriding(String overriding) {
		this.overriding = overriding;
	}


	public String getWrapper() {
		return wrapper;
	}


	public void setWrapper(String wrapper) {
		this.wrapper = wrapper;
	}


	public String getPrimitive() {
		return primitive;
	}


	public void setPrimitive(String primitive) {
		this.primitive = primitive;
	}


	public String getDisassambler() {
		return disassambler;
	}


	public void setDisassambler(String disassambler) {
		this.disassambler = disassambler;
	}


	public JavaOption() {
		
	}


	public String getMap() {
		return map;
	}


	public void setMap(String map) {
		this.map = map;
	}


	public String getTreeset() {
		return treeset;
	}


	public void setTreeset(String treeset) {
		this.treeset = treeset;
	}


	public String getStringbuffer() {
		return stringbuffer;
	}


	public void setStringbuffer(String stringbuffer) {
		this.stringbuffer = stringbuffer;
	}

}
