package com.song.firstmybatis;

import java.util.List;

public class DEPT {
	private String id;
	private String DEPTNO;
	private String  DNAME;
	private List<Emp> emps;
	public String getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(String dEPTNO) {
		DEPTNO = dEPTNO;
	}
	public String getDNAME() {
		return DNAME;
	}
	public void setDNAME(String dNAME) {
		DNAME = dNAME;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "DEPT [DEPTNO=" + DEPTNO + ", DNAME=" + DNAME + ", emps=" + emps + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
 
	 
}
