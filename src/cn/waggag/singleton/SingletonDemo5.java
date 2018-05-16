package cn.waggag.singleton;
/**
 * 使用枚举模式实现单例模式
 * 1.避免反射和反序列化的漏洞
 * 2.没有延时加载
 * @author waggag
 * @2018年5月16日 下午6:25:14
 */
public enum SingletonDemo5 {
	
	//枚举元素本身就是单例对象
	INSTANCE;
	
	//添加自己的操作
	public void singletonOperation() {

	}
	
}
