package projlab;

public class Main {
	public static void main(String [ ] args) 
	{
		System.out.println("Elsõ teszteset: magába foglalja a láda tol ládát, láda üres területre tolódik, láda switchet kapcsol");
		System.out.println();
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
		System.out.println();
		System.out.println("Második teszteset: magába foglalja a munkás tol ládát, láda munkásra tolódik, aki mögött fal van, láda eléri a destinationjét");
		System.out.println();
		Floor c6 = new Floor();
		Floor c7 = new Floor();
		BoxDestination c8 = new BoxDestination();
		Wall c9 = new Wall();
		
		Map map2 = Map.getInstance();

		Box b3=  new Box();
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		
		c7.containedMovable = b3;
		b3.container = c7;
		c6.containedMovable = w1;
		w1.container = c6;
		c8.containedMovable = w2;
		w2.container = c8;
			
		map2.Add(c6);
		map2.Add(c7);
		map2.Add(c8);
		map2.Add(c9);	
		
		w1.move(Direction.RIGHT, null);
		

	}
	
}
