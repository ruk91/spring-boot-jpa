package com.ruk91.demo.model;

public class Alien {
	
	private int aid;
	private String aname;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return aname;
	}
	public void setName(String aname) {
		this.aname = aname;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}

	
	
}
