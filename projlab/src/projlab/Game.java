package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();

	public Game()
	{
		write();
		controller.setGame(this);
		BoxCounter.getInstance().setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(read());
		map.printMap();
		start();
		// TODO
	}
	
	public void start(){
		// A jatek inditasahoz szukseges lepeseket vegzi el.
		timer.run();
		// TODO
	}
	
	public void gameEnded(){
		// A jatek veget kezeli.
		System.out.println("Vege a jateknak");
		controller.ended();
		controller.showEndScores();
		// TODO
	}
	
	public void write()
	{
		ItemContainer con = new ItemContainer();
		con.addItem(new Item("MapSize",10,10,0,0));
		
		for (int j = 0; j < con.GetMapSize().getY();j++ )
		{
			for (int i = 0; i< con.GetMapSize().getX();i++)
			{
				con.addItem(new Item("Floor",i,j,1,0));
			}
		}
		con.Set(7, 3, "BoxDestination", 2);
		con.Set(6, 5, "BoxDestination", 1);
		con.Set(3, 6, "BoxDestination", 3);
		con.Set(3, 7, "Wall", 0);
		con.Set(4, 7, "Wall", 0);
		con.Set(5, 7, "Wall", 0);
		con.Set(3, 3, "Hole", 0);
		con.Set(8, 1, "Switch", 1);
		con.Set(5, 2, "SwitchableHole", 1);
		
		con.addItem(new Item("Worker",0,0,10,0));
		con.addItem(new Item("Box",8,2,6,1));
		con.addItem(new Item("Box",3,1,2,2));
		con.addItem(new Item("Box",1,5,4,3));
		con.writeItems();  
		
	}
	
	public ItemContainer read()
	{
		ItemContainer con = new ItemContainer();
		con.readItems();
		return con;
	}
}
