package cn.waggag.prototype;

import java.io.Serializable;
import java.util.Date;

//1997,英国的克隆羊，多利！
public class Sheep implements Cloneable,Serializable {   
	
	private String sname;
	private Date birthday;
	
	//直接调用object对象的clone()方法！
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();  
		return obj;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	public Sheep() {
	}
	
}
