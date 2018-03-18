package projlab;

public class Main {
	public static void main(String [ ] args) 
	{
		Game g1 = new Game();
		
		Floor c1 = new Floor();
		Floor c2 = new Floor();
		Floor c3 = new Floor();
		Switch s1 = new Switch();
		Floor c4 = new Floor();
		Floor c5 = new Floor();
		Map map = Map.getInstance();

		Box b1=  new Box();
		Box b2=  new Box();
		
		c2.containedMovable = b1;
		c3.containedMovable = b2;
		b1.container = c2;
		b2.container = c3;
		map.Add(c1);
		map.Add(c2);
		map.Add(c3);
		map.Add(s1);
		map.Add(c4);
		map.Add(c5);
		
		
		c2.move(b1, null, null);
		

	}
	
}
