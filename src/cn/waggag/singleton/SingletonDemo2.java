package cn.waggag.singleton;
/**
 * 测试懒汉式的单例模式
 * @author waggag
 * @2018年5月16日 下午6:12:03
 */
public class SingletonDemo2 {
	
	//不初始化，延时加载
	private static SingletonDemo2 instance;
	
	//私有化构造器
	private SingletonDemo2() {
	}
	
	//用的时候才加载，资源利用率高了，但是需要同步，并发效率较低
	public static synchronized SingletonDemo2 getInstance() {
		if(instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
