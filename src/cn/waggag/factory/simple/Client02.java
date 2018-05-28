package cn.waggag.factory.simple;

/**
 * 简单工厂情况下
 * @author waggag
 * 2018年5月28日 上午9:53:29
 */
public class Client02 {   //调用者
	
	public static void main(String[] args) {
		
		Car c1 =CarFactory.createCar("奥迪");
		Car c2 = CarFactory.createCar("比亚迪");
		
		c1.run();
		c2.run();
		
	}
}
