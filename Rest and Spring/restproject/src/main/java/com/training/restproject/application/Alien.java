package com.training.restproject.application;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alien {

	private int alienid;
	private String alienname;
	private int alienage;

	public int getAlienid() {
		return alienid;
	}
	public String getAlienname() {
		return alienname;
	}
	public int getAlienage() {
		return alienage;
	}
	public void setAlienid(int alienid) {
		this.alienid = alienid;
	}
	public void setAlienname(String alienname) {
		this.alienname = alienname;
	}
	public void setAlienage(int alienage) {
		this.alienage = alienage;
	}
	@Override
	public String toString() {
		return "Alien [alienid=" + alienid + ", alienname=" + alienname + ", alienage=" + alienage + "]";
	}
	
}
