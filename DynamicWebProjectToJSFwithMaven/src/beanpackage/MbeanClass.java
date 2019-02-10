package beanpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="bean")
@SessionScoped 
public class MbeanClass {
	
	public MbeanClass() {
		// System.out.println("The bean has bean created");
	}

	public String getMessage() {
		return "Welcome to My Page.";
	}

	public void setMessage(String message) {
	}

	public String getAbout() {
		return "About the Page.";
	}

	public void setAbout(String about) {
	}

}

