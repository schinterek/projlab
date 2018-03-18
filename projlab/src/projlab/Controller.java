package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Controller {
	// A játékosokat kezeli.
	
	private ArrayList<Player> alivePlayers;
	private ArrayList<Player> deadPlayers;
	// !!!
	// Ez a doksiban úgy volt, hogy simán csak Player a típusuk,
	// megcsináltam ArrayListnek. Megfelel?
	
	public Controller()
	{
		System.out.println("Controller created");
	}
	
	public void playerDied(Player player){
		// A meghalt játékost kiveszi a játékosok listájából.
		// Ha nulla lesz a játékosok száma, szól a Game-nek,
		// hogy vége a játéknak.
	
		// TODO
	}
	
	public void step(){
		// Beolvassa a parancsokat és lépteti a játékosokat.
		
		// TODO
	}
	
	public void showEndScores() {
		// Kiírja a végeredményt.
		
		// !!!
		// Amit mellesleg nem számolunk sehol egyelõre.
		
		// TODO
	}
	
	public int numOfAlivePlayers(){
		// A még játékban lévõ játékosok számát adja vissza.
		
		return alivePlayers.size();
	}
	
	public boolean movableBoxes(){
		// Ha már nincs olyan Boxm amit a helyére lehet rakni,
		// visszatér false-sal, egyébként true.
		
		// TODO
		return true;
	}
}
