package cn.waggag.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 测试反射和反序列化破解单例模式
 * @author waggag
 * @2018年5月16日 下午6:46:24
 */
@SuppressWarnings("all")
public class Client2 {
	
	public static void main(String[] args) throws Exception {
		SingletonDemo6 s1 = SingletonDemo6.getInstance();
		SingletonDemo6 s2 = SingletonDemo6.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射破解单例模式
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("cn.waggag.singleton.SingletonDemo6");
//		
//		Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		
//		//跳过权限检查，可以访问私有方法
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		FileOutputStream fos = new FileOutputStream("D:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
		SingletonDemo6 s3 =  (SingletonDemo6) ois.readObject();
		System.out.println(s3);
		
	}
	
}
