package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();

	public Game()
	{
		write();
		controller.setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(read());
		map.printMap();
		Player player = new Player();
		controller.addPlayer(player);
		BoxCounter.getInstance().setGame(this);
		Worker w = (Worker)map.getWorker();
		player.setWorker(w);
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
		// TODO
	}
	
	public void write()
	{
		ItemContainer con = new ItemContainer();
		con.addItem(new Item("MapSize",4,4,0,0));
		con.addItem(new Item("Floor",0,0,1,0));
		con.addItem(new Item("Floor",2,1,1,0));
		con.addItem(new Item("Hole",3,0,1,0));
		con.addItem(new Item("Floor",0,1,1,0));
		con.addItem(new Item("Floor",1,0,1,0));
		con.addItem(new Item("Floor",1,1,1,0));
		con.addItem(new Item("Floor",2,2,1,0));
		con.addItem(new Item("Floor",3,1,1,0));
		con.addItem(new Item("Floor",3,2,1,0));
		con.addItem(new Item("BoxDestination",3,3,1,1));
		con.addItem(new Item("Floor",0,3,1,0));
		con.addItem(new Item("Floor",1,3,1,0));
		con.addItem(new Item("BoxDestination",2,3,1,2));
		con.addItem(new Item("Switch",2,0,1,1));
		con.addItem(new Item("SwitchableHole",0,2,1,1));
		con.addItem(new Item("Floor",1,2,1,0));
		con.addItem(new Item("Worker",0,0,10,0));
		con.addItem(new Item("Box",1,1,6,1));
		con.addItem(new Item("Box",2,1,2,2));
		con.writeItems();  
		
	}
	
	public ItemContainer read()
	{
		ItemContainer con = new ItemContainer();
		con.readItems();
		return con;
	}
}
