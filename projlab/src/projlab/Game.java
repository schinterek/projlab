package projlab;

import java.util.Scanner;

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
		//ItemContainer ic = read("map2.txt");
		//ic.listItems();
		map.initMap(read(file));
		map.printMap();
		start();
		// TODO
	}
	
	public void start(){
		// A jatek inditasahoz szukseges lepeseket vegzi el.
		if(level==1) {
			System.out.println("Tesztelés(T) vagy Játék (bármelyik másik billentyű) ?");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			timer.run(s);
		}
		else
			timer.run("");
		// TODO
	}
	
	public void gameEnded(){
		// A jatek veget kezeli.
		if(level==6) {
			System.out.println("Vege a jateknak");
			controller.showEndScores();
			controller.ended();
		}
		else {
			controller.showEndScores();
			level++;
			init();
		}
		// TODO
	}
	
	public void write(String file)
	{
		//Map fajlba irasat vegzi

		ItemContainer con = read(file);
		con.setWorker(1, 1, 6);
		con.writeItems(file);
		con.listItems();

    }
	
	public ItemContainer read(String file)
	{
		//Map fajlbol olvasasat vegzi
		ItemContainer con = new ItemContainer();
		con.readItems(file);
		return con;
	}
}