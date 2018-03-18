package projlab;

public class Game {
	
	private Timer timer;
	private Controller controller;

	public Game()
	{
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(int numofcells, int numofworkers, int numofboxes){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(numofcells, numofworkers, numofboxes);
		// TODO
	}
	
	public void start(){
		// A jatek inditasahoz szukseges lepeseket vegzi el.
		System.out.println("Game start fv");
		timer.run();
		// TODO
	}
	
	public void gameEnded(){
		// A jatek veget kezeli.
		System.out.println("Game gameEnded fv");
		// TODO
	}
}
