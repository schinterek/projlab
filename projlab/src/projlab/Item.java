package projlab;
import java.io.*;

public class Item implements Serializable{
	private String type;
	private int x;
	private int y;
	private double data;
	private int index;
	
	public Item(String type, int x, int y, double data, int index)
	{
		this.type = type;
		this.x = x;
		this.y = y;
		this.data = data;
		this.index= index;
	}
	
	public String getType() { return type; }
	public int getX() { return x; }
	public int getY() { return y; }
	public double getData() { return data; }
	public int  getIndex() {return index;}
	public void setType(String type) { this.type = type;  }

	public void setIndex(int index) {
		this.index = index;
		
	}
	public void setData(double data) {this.data = data;}

	public void list() {
		System.out.print(type + " " + Integer.toString(x)+ " " + Integer.toString(y)+ " " + Double.toString(data));
		
	}
}
