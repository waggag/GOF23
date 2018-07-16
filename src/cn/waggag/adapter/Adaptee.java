package cn.waggag.adapter;

/**
 * 被适配的类
 * (相当于例子中的，PS/2键盘)
 * @author waggag
 * 2018年7月16日 下午6:51:13
 */
public class Adaptee {
	
	public void request(){
		System.out.println("可以完成客户请求的需要的功能！");
	}
}