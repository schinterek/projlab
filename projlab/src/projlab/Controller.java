package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Controller {
	// A jatekosokat kezeli.
	
	private ArrayList<Player> alivePlayers;
	private ArrayList<Player> deadPlayers;
	// !!!
	// Ez a doksiban ugy volt, hogy siman csak Player a tipusuk,
	// megcsinaltam ArrayListnek. Megfelel?
	
	public Controller()
	{
		System.out.println("Controller created");
	}
	
	public void playerDied(Player player){
		// A meghalt jatekost kiveszi a jatekosok listajabol.
		// Ha nulla lesz a jatekosok szama, szol a Game-nek,
		// hogy vege a jateknak.
	
		// TODO
	}
	
	public void step(){
		// Beolvassa a parancsokat es lepteti a jatekosokat.
		
		// TODO
	}
	
	public void showEndScores() {
		// Kiirja a vegeredmenyt.
		
		// !!!
		// Amit mellesleg nem szamolunk sehol egyelore.
		
		// TODO
	}
	
	public int numOfAlivePlayers(){
		// A meg jatekban levo jatekosok szamat adja vissza.
		
		return alivePlayers.size();
	}
	
	public boolean movableBoxes(){
		// Ha mar nincs olyan Boxm amit a helyere lehet rakni,
		// visszater false-sal, egyebkent true.
		
		// TODO
		return true;
	}
}
