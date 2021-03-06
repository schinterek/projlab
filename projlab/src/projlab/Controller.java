package projlab;

import java.util.ArrayList;
import java.io.IOException;
import java.io.*;
import java.util.*;

// <<singleton>>
public class Controller {
	// A jatekosokat kezeli.
	private static Controller controller = new Controller();
	private Player player1;
	private Player player2;
	private ArrayList<Player> alivePlayers = new ArrayList<Player>();
	private ArrayList<Player> deadPlayers = new ArrayList<Player>();
	private Game game;
	private boolean ended = false;
	int max = 0;
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
	    	//System.out.println(alivePlayers.size());
	    	alivePlayers.remove(alivePlayers.indexOf(player));
	    	deadPlayers.add(player);
	    	if (numOfAlivePlayers()==0) 
			{
				game.gameEnded();
			}
	    }
	    catch(IndexOutOfBoundsException e) {}
	}
	
	public void step(String kar){
		//a karakterek beolvasasaert es a jatekosok lepteteseert felelos fuggveny
		
		Map map = Map.getInstance();
		
		
			if(kar.equals("b")) {
				game.gameEnded();
			}
			
			if(this.isEnded()) return;
			
			if (this.numOfAlivePlayers()==2)
			{
			
				if (alivePlayers.get(0).hasControl(kar))
					{
					alivePlayers.get(0).recieveCommand(kar);
					if (this.isEnded()) return;
					}
						if (this.numOfAlivePlayers()==2) 
						{
							if (alivePlayers.get(1).hasControl(kar))
							{
							alivePlayers.get(1).recieveCommand(kar);
							if (this.isEnded()) return;
							}
						}
						else 
						{
							if (alivePlayers.get(0).hasControl(kar))
							{
							alivePlayers.get(0).recieveCommand(kar);
							if (this.isEnded()) return;
							}
						}
				
			
			}else
			{
				if (alivePlayers.get(0).hasControl(kar))
				{
					alivePlayers.get(0).recieveCommand(kar);
					if (this.isEnded()) return;
				}	
			}
				
		map.printMap();
		map.window.setVisible(true);
			
		
		//scanner.close();
		// TODO
	}
	
public void writeTest(){
	//Tesztek generálása
		
		Scanner scanner = new Scanner(System.in);
		Map map = Map.getInstance();
		try {
				File statText = new File("nem_sikerult_eltolas.txt");
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
			if (s.equals("k") || s.equals("i") || s.equals("j") || s.equals("l") || s.equals("u")|| s.equals("o")) {
				w.write(s+'\n');
				alivePlayers.get(1).recieveCommand(s);
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
	  //A teszteles lebonyolitasara szolgalo fuggveny
	
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
		if (s.equals("k") || s.equals("i") || s.equals("j") || s.equals("l") || s.equals("u")|| s.equals("o")) {
			alivePlayers.get(1).recieveCommand(s);
			map.printMap();
			if( ended ) break;
		}
			
	
	}
	br.close();
	}catch(IOException ex) {}
	
	// TODO
}
	
	public String showEndScores() {
		// Kiirja a vegeredmenyt.
		
		// TODO
		for (Player p: alivePlayers)
		{
			if(p.getPoints()>max) max = p.getPoints();
		}
		
		for (Player p: deadPlayers)
		{
			if(p.getPoints()>max) max = p.getPoints();
		}
		
		String score = "<html>Győztes(ek):<br/>";
		for (Player p: alivePlayers)
		{
			if(p.getPoints()==max) score+= p.getName()+": "+ p.getPoints() + "<br/>" ;
		}
		
		for (Player p: deadPlayers)
		{
			if(p.getPoints()==max) score+= p.getName()+": "+ p.getPoints() + "<br/>" ;
		}
		score+="</html>";
		alivePlayers.clear();
		deadPlayers.clear();
		
		return score;
		
		
	}
	
	public int numOfAlivePlayers(){
		// A meg jatekban levo jatekosok szamat adja vissza.
		
		return alivePlayers.size();
	}
	
	
	public void addPlayer(Player p)
	{
		alivePlayers.add(p);
		if (this.numOfAlivePlayers()==1) player1 = p;
		else player2 = p;
	}
	
	public void setGame(Game g) { game = g; }
	public void ended() { ended = true; } //A jatek veget jelzi
	
	
	
	public boolean isEnded() { return ended;}
	
	public void reset()
	{
		alivePlayers.clear();
		deadPlayers.clear();
		alivePlayers.add(player1);
		alivePlayers.add(player2);
	}
	
	public Player getPlayer(int i)
	{
		return alivePlayers.get(i);
	}
	
	
}
