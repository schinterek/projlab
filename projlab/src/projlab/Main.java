package projlab;

public class Main {
	public static void main(String [ ] args) 
	{
		System.out.println("Elso teszteset: magaba foglalja a lada tol ladat, lada ures teruletre tolodik, lada switchet kapcsol");
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
		map.removeAll();
		System.out.println();
		System.out.println("Masodik teszteset: magaba foglalja a munkas tol ladat, lada munkasra tolodik, aki mogott fal van, lada eleri a destinationjet");
		System.out.println();
		Floor c6 = new Floor();
		Floor c7 = new Floor();
		BoxDestination c8 = new BoxDestination();
		Wall c9 = new Wall();

		Box b3=  new Box();
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		
		c7.containedMovable = b3;
		b3.container = c7;
		c6.containedMovable = w1;
		w1.container = c6;
		c8.containedMovable = w2;
		w2.container = c8;
			
		map.Add(c6);
		map.Add(c7);
		map.Add(c8);
		map.Add(c9);	
		
		w1.move(Direction.RIGHT, null);
		

	}
	
}
