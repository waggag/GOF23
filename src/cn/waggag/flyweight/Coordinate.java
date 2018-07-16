package cn.waggag.flyweight;

/**
 * 外部状态UnSharedConcreteFlyWeight
 * @author waggag
 * 2018年7月16日 下午8:43:21
 */
public class Coordinate {
	private int x,y;

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
