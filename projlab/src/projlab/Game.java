package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();

	public Game()
	{
		write("map1.txt");
		controller.setGame(this);
		BoxCounter.getInstance().setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(read("map3.txt"));
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
	
	public void write(String file)
	{
		ItemContainer con = read(file);
		con.setWorker(3, 2, 6);
		con.writeItems(file);
		con.listItems();

    }
	
	public ItemContainer read(String file)
	{
		ItemContainer con = new ItemContainer();
		con.readItems(file);
		return con;
	}
}
