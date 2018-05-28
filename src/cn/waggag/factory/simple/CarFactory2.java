package cn.waggag.factory.simple;

/**
 * 简单工厂类第二种实现方法
 * @author waggag
 * 2018年5月28日 上午9:53:42
 */
public class CarFactory2 {
	
	public static  Car createAudi(){
		return new Audi();
	}
	public static  Car createByd(){
		return new Byd();
	}
	
}
