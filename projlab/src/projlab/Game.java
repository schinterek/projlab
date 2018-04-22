package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();
	private int level=1;
	
	public Game()
	{
		//write("map1.txt");
		controller.setGame(this);
		BoxCounter.getInstance().setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		String file="map"+Integer.toString(level)+".txt";
		System.out.println(level+". szint következik:");
		ItemContainer ic = read("map1.txt");
		ic.listItems();
		map.initMap(read("map1.txt"));
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
		if(level==10) {
			System.out.println("Vege a jateknak");
			controller.ended();
			controller.showEndScores();
		}
		else {
			level++;
			init();
		}
		// TODO
	}
	
	public void write(String file)
	{

		ItemContainer con = read(file);
		con.setWorker(1, 1, 6);
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