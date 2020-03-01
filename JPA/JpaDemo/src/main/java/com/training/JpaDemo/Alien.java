package com.training.JpaDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aliens")
public class Alien {

	@Id
	@Column(name="alienid")
	private int aid;
	@Column(name="alienname")
	private String aname;
	@Column(name="alienage")
	private int aage;
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public int getAage() {
		return aage;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setAage(int aage) {
		this.aage = aage;
	}
	@Override
	public String toString() {
		return "Alien [Alien Id=" + aid + ", Alien Name=" + aname + ", Alien Age=" + aage + "]";
	}
	
	
}
