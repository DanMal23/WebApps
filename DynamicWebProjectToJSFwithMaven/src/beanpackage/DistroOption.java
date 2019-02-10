package beanpackage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DistroOption {
	
	private String debian1;
	private String mandr;
	private String google;
	private String redhat;
	private String hrank;
	private String pacman;
	private String raspbian;
	private String oldest;
	private String secur;

	public String getDebian1() {
		return debian1;
	}

	public void setDebian1(String debian1) {
		this.debian1 = debian1;
	}

	public String getMandr() {
		return mandr;
	}

	public void setMandr(String mandr) {
		this.mandr = mandr;
	}

	public String getGoogle() {
		return google;
	}

	public void setGoogle(String google) {
		this.google = google;
	}

	public String getRedhat() {
		return redhat;
	}

	public void setRedhat(String redhat) {
		this.redhat = redhat;
	}

	public String getHrank() {
		return hrank;
	}

	public void setHrank(String hrank) {
		this.hrank = hrank;
	}

	public String getPacman() {
		return pacman;
	}

	public void setPacman(String pacman) {
		this.pacman = pacman;
	}

	public String getRaspbian() {
		return raspbian;
	}

	public void setRaspbian(String raspbian) {
		this.raspbian = raspbian;
	}

	public String getOldest() {
		return oldest;
	}

	public void setOldest(String oldest) {
		this.oldest = oldest;
	}

	public String getSecur() {
		return secur;
	}

	public void setSecur(String secur) {
		this.secur = secur;
	}

	public DistroOption() {
	}

}
