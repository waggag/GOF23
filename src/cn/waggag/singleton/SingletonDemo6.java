package cn.waggag.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式的单例模式（如何防止反射和反序列化）
 * @author waggag
 * @2018年5月16日 下午6:12:03
 */
@SuppressWarnings("serial")
public class SingletonDemo6 implements Serializable{
	
	//不初始化，延时加载
	private static SingletonDemo6 instance;
	
	//私有化构造器
	private SingletonDemo6() {
		//防止反射破解单例
		if(instance != null) {
			throw new RuntimeException();
		}
	}
	
	//用的时候才加载，资源利用率高了，但是需要同步，并发效率较低
	public static synchronized SingletonDemo6 getInstance() {
		if(instance == null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//反序列化的时候直接返回一个实例，不再新构建一个对象
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
