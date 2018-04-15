package projlab;
import java.util.*;
import java.io.*;

public class ItemContainer {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void readItems()
	{
		try {
		FileInputStream fis = new FileInputStream("items.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		items = (ArrayList<Item>) ois.readObject();
		fis.close();
		ois.close();
		
		}catch (IOException ex) {}
		catch(ClassNotFoundException ex) {}
	}
	
	public Item getItem(int i)
	{
		return items.get(i);
	}
	
	public void addItem(Item i)
	{
		items.add(i);
	}
	
	public void writeItems()
	{
		try 
		{
			FileOutputStream fos = new FileOutputStream("items.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(items);
			fos.close();
			oos.close();
			
		}catch(IOException ioe) {}
	}
	
	public void listItems()
	{
		for (Item item: items)
		{
			item.list();
			System.out.println("");
		}
	}
	
	public int Count()
	{
		return items.size();
	}
	
	public Item GetMapSize()
	{
		for (Item item: items)
		{
			if(item.getType().equals("MapSize")) return item;
		}
		return null;
	}

}