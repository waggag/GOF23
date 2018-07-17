package cn.waggag.state;

/**
 * 已预订状态
 * @author waggag
 * 2018年7月17日 下午8:45:13
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}
