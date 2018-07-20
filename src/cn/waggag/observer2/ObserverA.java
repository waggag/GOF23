package cn.waggag.observer2;

import java.util.Observable;
import java.util.Observer;
/**
 * @author waggag
 * 2018年7月20日 下午3:43:26
 */
public class ObserverA implements Observer {

	private int myState;
	
	
	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
	}


	public int getMyState() {
		return myState;
	}


	public void setMyState(int myState) {
		this.myState = myState;
	}

	
	
}
