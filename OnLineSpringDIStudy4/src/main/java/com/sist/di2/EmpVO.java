package com.sist.di2;
import java.util.*;
import lombok.Getter;
import lombok.Setter;
public class EmpVO {
// @Setter 
// @Getter => source 눌러서 getter-setter 안해도됨 (lombok)
	private int empno;
	private String ename;
	private String job;
	private Date regdate;
	private int sal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
}
