package cn.waggag.flyweight;

/**
 * 享元类
 * @author waggag
 * 2018年7月16日 下午8:44:39
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}

class ConcreteChess implements ChessFlyWeight {

	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}
	
	//用于对外部状态的处理
	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置："+c.getX()+"----"+c.getY());
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}
	
}
