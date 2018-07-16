package cn.waggag.adapter;

/**
 * 适配器 (类适配器方式)
 * (相当于usb和ps/2的转接器)
 * @author waggag
 * 2018年7月16日 下午6:52:44
 */
public class Adapter extends Adaptee implements Target {
	
	@Override
	public void handleReq() {
		super.request();
	}
	
}
