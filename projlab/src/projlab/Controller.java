package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Controller {
	// A j�t�kosokat kezeli.
	
	private ArrayList<Player> alivePlayers;
	private ArrayList<Player> deadPlayers;
	// !!!
	// Ez a doksiban �gy volt, hogy sim�n csak Player a t�pusuk,
	// megcsin�ltam ArrayListnek. Megfelel?
	
	public Controller()
	{
		System.out.println("Controller created");
	}
	
	public void playerDied(Player player){
		// A meghalt j�t�kost kiveszi a j�t�kosok list�j�b�l.
		// Ha nulla lesz a j�t�kosok sz�ma, sz�l a Game-nek,
		// hogy v�ge a j�t�knak.
	
		// TODO
	}
	
	public void step(){
		// Beolvassa a parancsokat �s l�pteti a j�t�kosokat.
		
		// TODO
	}
	
	public void showEndScores() {
		// Ki�rja a v�geredm�nyt.
		
		// !!!
		// Amit mellesleg nem sz�molunk sehol egyel�re.
		
		// TODO
	}
	
	public int numOfAlivePlayers(){
		// A m�g j�t�kban l�v� j�t�kosok sz�m�t adja vissza.
		
		return alivePlayers.size();
	}
	
	public boolean movableBoxes(){
		// Ha m�r nincs olyan Boxm amit a hely�re lehet rakni,
		// visszat�r false-sal, egy�bk�nt true.
		
		// TODO
		return true;
	}
}
