package cn.waggag.singleton;
/**
 * 测试饿汉式单例模式
 * @author waggag
 * @2018年5月16日 下午6:04:28
 */
public class SingletonDemo1 {
	
	//类初始化时立即加载,加载类时，线程安全
	private static SingletonDemo1 instance = new SingletonDemo1();
	
	private SingletonDemo1() {	
	}
	
	//方法没有同步，调用效率高
	public static SingletonDemo1 getInstance() {
		return instance;
	}
	
}
