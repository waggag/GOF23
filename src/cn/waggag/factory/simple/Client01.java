package cn.waggag.factory.simple;

/**
 * 测试在没有工厂模式的情况下
 * @author waggag
 * 2018年5月28日 上午9:53:11
 */
public class Client01 {   //调用者
	
	public static void main(String[] args) {
		Car c1 = new Audi();
		Car c2 = new Byd();
		
		c1.run();
		c2.run();
		
	}
}
