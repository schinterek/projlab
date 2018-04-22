package projlab;

import java.util.ArrayList;
import java.io.IOException;
import java.io.*;
import java.util.*;

// <<singleton>>
public class Controller {
	// A jatekosokat kezeli.
	private static Controller controller = new Controller();
	private ArrayList<Player> alivePlayers = new ArrayList<Player>();
	private ArrayList<Player> deadPlayers = new ArrayList<Player>();
	private Game game;
	private boolean ended = false;
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
	    try
	    {
	    	alivePlayers.remove(alivePlayers.indexOf(player));
	    	deadPlayers.add(player);
	    	if (numOfAlivePlayers()==0) 
			{
				game.gameEnded();
			}
	    }
	    catch(IndexOutOfBoundsException e) {}
		// TODO
	    //kivetel
	}
	
	public void step(){
		
		Scanner scanner = new Scanner(System.in);
		Map map = Map.getInstance();
		
		
		while(scanner.hasNext())
		{
			String s = scanner.nextLine();
			if (s.equals("s") || s.equals("w") || s.equals("a") || s.equals("d") || s.equals("q")|| s.equals("e")) {
				alivePlayers.get(0).recieveCommand(s);
				map.printMap();
				if( ended ) break;
			}
				
		
		}
		
		scanner.close();
		// TODO
	}
	
public void writeTest(){
		
		Scanner scanner = new Scanner(System.in);
		Map map = Map.getInstance();
		try {
			File statText = new File("switch_felkapcsolasa_switchableholeba_eses.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw);
		
		while(scanner.hasNext())
		{
			String s = scanner.nextLine();
			if (s.equalsIgnoreCase("end test")) {
				System.out.println("Teszt vege");
				w.write(s);
				break;
			}
			if (s.equals("s") || s.equals("w") || s.equals("a") || s.equals("d") || s.equals("q")|| s.equals("e")) {
				w.write(s+'\n');
				alivePlayers.get(0).recieveCommand(s);
				map.printMap();
				if( ended ) break;
				
			}
				
		
		}
		w.close();
		}catch(Exception ex) {}
		scanner.close();
		
		// TODO
	}

  public void Testing(String test){
	
	Map map = Map.getInstance();
	try {
	FileInputStream fstream = new FileInputStream(test);
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	String s;
	
	while((s = br.readLine()) != null)
	{
		if (s.equals("s") || s.equals("w") || s.equals("a") || s.equals("d") || s.equals("q")|| s.equals("e")) {
			alivePlayers.get(0).recieveCommand(s);
			map.printMap();
			if( ended ) break;
		}
			
	
	}
	br.close();
	}catch(IOException ex) {}
	
	// TODO
}
	
	public void showEndScores() {
		// Kiirja a vegeredmenyt.
		
		// !!!
		// Amit mellesleg nem szamolunk sehol egyelore.
		
		// TODO
		int max = 0;
		for (Player p: alivePlayers)
		{
			p.printPoints();
			if(p.getPoints()>max) max = p.getPoints();
		}
		
		for (Player p: deadPlayers)
		{
			p.printPoints();
			if(p.getPoints()>max) max = p.getPoints();
		}
		
		for (Player p: alivePlayers)
		{
			if(p.getPoints()==max) System.out.println("A gyoztes: " + p.getName());
		}
		
		for (Player p: deadPlayers)
		{
			if(p.getPoints()==max) System.out.println("A gyoztes: " + p.getName());
		}
		
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
	
	public void setGame(Game g) { game = g; }
	public void ended() { ended = true; }
	
}
