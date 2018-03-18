package projlab;

public class Game {
	
	private Timer timer;
	private Controller controller;

	public Game()
	{
		System.out.println("Game created");
	}

	// A j�t�k menet�t ir�ny�tja.

	
	public void init(int numofcells, int numofworkers, int numofboxes){
		// Inicializ�l, l�trehozza a sz�ks�ges objektumokat.
		Map map = Map.getInstance();
		map.initMap(numofcells, numofworkers, numofboxes);
		// TODO
	}
	
	public void start(){
		// A j�t�k ind�t�s�hoz sz�ks�ges l�p�seket v�gzi el.
		System.out.println("Game start fv");
		timer.run();
		// TODO
	}
	
	public void gameEnded(){
		// A j�t�k v�g�t kezeli.
		System.out.println("Game gameEnded fv");
		// TODO
	}
}
