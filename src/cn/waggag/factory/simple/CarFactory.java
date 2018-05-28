package cn.waggag.factory.simple;

/**
 * 简单工厂类第一种实现方法
 * @author waggag
 * 2018年5月28日 上午9:53:52
 */
public class CarFactory {
	
	public static  Car createCar(String type)
	{
		if("奥迪".equals(type)){
			return new Audi();
		}else if("比亚迪".equals(type)){
			return new Byd();
		}else{
			return null;
		}
	}
	
}
