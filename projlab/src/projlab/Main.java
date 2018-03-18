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
		System.out.println("Masodik teszteset: magaba foglalja a munkas tol ladat, lada munkasra tolodik, aki mogott fal van, lada eleri a destinationjet, játék vége");
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
		g1.gameEnded();
		
		map.removeAll();
		
		System.out.println();
		System.out.println("Harmadik teszteset: munkés lép switchre, majd munkás mozog falnak");
		System.out.println();
		
		Floor c10 = new Floor();
		Switch c11 = new Switch();
		Wall c12= new Wall();
		
		Worker w3= new Worker();
		
		w3.container = c10;
		c10.containedMovable = w3;
		
		map.Add(c10);
		map.Add(c11);
		map.Add(c12);
		
		w3.move(Direction.RIGHT, null);
		w3.move(Direction.RIGHT, null);
		
		map.removeAll();
		
		System.out.println();
		System.out.println("Negyedik teszteset: munkás tol ládát falnak");
		System.out.println();
		
		
		Floor c13 = new Floor();
		Floor c14 = new Floor();
		Floor c15 = new Floor();
		Wall c16= new Wall();
		
		Worker w4= new Worker();
		Box b4 = new Box();
		
		w4.container = c13;
		c13.containedMovable = w4;
		b4.container = c14;
		c14.containedMovable = b4;
		
		map.Add(c13);
		map.Add(c14);
		map.Add(c15);
		map.Add(c16);
		
		w4.move(Direction.RIGHT, null);
		w4.move(Direction.RIGHT, null);
		
		map.removeAll();
		
		System.out.println();
		System.out.println("Ötödik teszteset: munkés tol ládát lyukra, majd ő is belelép");
		System.out.println();
	}
	
}
