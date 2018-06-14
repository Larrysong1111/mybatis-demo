package com.song.firstmybatis;

public class Emp {
	private String id;
	private String EMPNO;
	private String  ENAME;
	public String getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(String eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	@Override
	public String toString() {
		return "Emp [EMPNO=" + EMPNO + ", ENAME=" + ENAME + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
