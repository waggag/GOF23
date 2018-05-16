package cn.waggag.singleton;
/**
 * 测试双重检测锁模式的单例模式
 * @author waggag
 * @2018年5月16日 下午6:12:03
 */
public class SingletonDemo3 {
	
	private static SingletonDemo3 instance = null; 

	  public static SingletonDemo3 getInstance() { 
	    if (instance == null) { 
	      SingletonDemo3 sc; 
	      synchronized (SingletonDemo3.class) { 
	        sc = instance; 
	        if (sc == null) { 
	          synchronized (SingletonDemo3.class) { 
	            if(sc == null) { 
	              sc = new SingletonDemo3(); 
	            } 
	          } 
	          instance = sc; 
	        } 
	      } 
	    } 
	    return instance; 
	  } 
	  
	  //私有化构造器
	  private SingletonDemo3() { 

	  } 
	
}
