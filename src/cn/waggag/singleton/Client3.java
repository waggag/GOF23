package cn.waggag.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * 测试5种创建单例模式的效率
 * @author waggag
 * @2018年5月16日 下午6:46:24
 */
@SuppressWarnings("all")
public class Client3 {
	
	public static void main(String[] args) throws Exception {
		
			
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch  countDownLatch = new CountDownLatch(threadNum);
		
		for(int i=0; i < threadNum; i++){
			new Thread(new Runnable() {
				@Override
				public void run() {
					
					for(int i=0; i<1000000; i++){
//							Object o = SingletonDemo4.getInstance();
						Object o = SingletonDemo2.getInstance();
					}
					
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();	//main线程阻塞，直到计数器变为0，才会继续往下执行！
		
		long end = System.currentTimeMillis();
		System.out.println("总耗时："+(end - start));
	}
}
