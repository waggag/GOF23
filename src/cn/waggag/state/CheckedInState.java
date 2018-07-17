package cn.waggag.state;

/**
 * 已入住状态
 * @author waggag
 * 2018年7月17日 下午8:45:22
 */
public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住！请勿打扰！");
	}

}
