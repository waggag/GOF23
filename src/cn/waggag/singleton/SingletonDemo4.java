package cn.waggag.singleton;
/**
 * 测试静态内部类的单例模式
 * 1.线程安全，高效调用
 * 2.实现了懒加载
 * @author waggag
 * @2018年5月16日 下午6:12:03
 */
public class SingletonDemo4 {

	private SingletonDemo4() {
	}
	
	//使用静态内部类实现实例的返回
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	public static SingletonDemo4 getInstance() {
		return SingletonClassInstance.instance;
	}
	  
}
