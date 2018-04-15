package projlab;
import java.io.*;

public class Item implements Serializable{
	private String type;
	private int x;
	private int y;
	private double data;
	
	public Item(String type, int x, int y, double data)
	{
		this.type = type;
		this.x = x;
		this.y = y;
		this.data = data;
	}
	
	public String getType() { return type; }
	public int getX() { return x; }
	public int getY() { return y; }
	public double getData() { return data; }

	public void list() {
		System.out.print(type + " " + Integer.toString(x)+ " " + Integer.toString(y)+ " " + Double.toString(data));
		
	}
}
