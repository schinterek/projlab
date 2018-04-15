package projlab;

import java.util.ArrayList;
import java.io.IOException;
import java.io.*;

// <<singleton>>
public class Controller {
	// A jatekosokat kezeli.
	private static Controller controller = new Controller();
	private ArrayList<Player> alivePlayers = new ArrayList<Player>();
	private ArrayList<Player> deadPlayers = new ArrayList<Player>();
	// !!!
	// Ez a doksiban ugy volt, hogy siman csak Player a tipusuk,
	// megcsinaltam ArrayListnek. Megfelel?
	
	private Controller()
	{
	}
	public static Controller getInstance() { return controller;}
	
	public void playerDied(Player player){
		// A meghalt jatekost kiveszi a jatekosok listajabol.
		// Ha nulla lesz a jatekosok szama, szol a Game-nek,
		// hogy vege a jateknak.
	
		// TODO
	}
	
	public void step(){
		
		
		
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
	
	public void addPlayer(Player p)
	{
		alivePlayers.add(p);
	}
	
}
