package projlab;

public class Game {
	
	private Timer timer;
	private Controller controller;

	public Game()
	{
		System.out.println("Game created");
	}

	// A j�t�k menet�t ir�ny�tja.

	
	public void init(int numofcells){
		// Inicializ�l, l�trehozza a sz�ks�ges objektumokat.
		Map.getInstance().initMap(numofcells);
		// TODO
	}
	
	public void start(){
		// A j�t�k ind�t�s�hoz sz�ks�ges l�p�seket v�gzi el.
		timer.run();
		// TODO
	}
	
	public void gameEnded(){
		// A j�t�k v�g�t kezeli.
		
		// TODO
	}
}
