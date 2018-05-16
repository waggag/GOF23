package cn.waggag.singleton;

public class Client {
	
	public static void main(String[] args) {
		SingletonDemo4 s1 = SingletonDemo4.getInstance();
		SingletonDemo4 s2 = SingletonDemo4.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		//枚举方式的测试
		System.out.println(SingletonDemo5.INSTANCE);
		System.out.println(SingletonDemo5.INSTANCE);
	}
}
