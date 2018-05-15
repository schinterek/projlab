package projlab;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();
	private int level=1;
	
	public Game()
	{
		//write("map1.txt");
		controller.setGame(this);
		BoxCounter.getInstance().setGame(this);
		//System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		String file="map"+Integer.toString(level)+".txt";
		//ItemContainer ic = read("map2.txt");
		//ic.listItems();
		map.initMap(read(file));
		map.printMap();
		Map.getInstance().out(level+". szint");
		//start();
		// TODO
	}
	
	public void start(){
		// A jatek inditasahoz szukseges lepeseket vegzi el.
		if(level==1) {
			String s="";
			/*System.out.println("Tesztelés(T) vagy Játék (bármelyik másik billentyű) ?");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();*/
			timer.run(s);
		}
		else
			timer.run("");
		// TODO
	}
	
	public void gameEnded(){
		// A jatek veget kezeli.
		BoxCounter.getInstance().reset();
		
		if(Controller.getInstance().isEnded())
		{
			Map.getInstance().out("Vege a jateknak");
			return;
		}
		
		if(level>=5) {
			Map.getInstance().out("Vege a jateknak");
			JFrame score = new JFrame("Eredmények");
			score.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			score.setSize(200, 350);
			score.setResizable(false);
			JLabel f = new JLabel();
			JPanel panel2= new JPanel();
			panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
			panel2.setPreferredSize(new Dimension(300,400));
			f.setText(controller.showEndScores());
			score.add(panel2);
			panel2.add(f);
			score.setVisible(true);
			controller.ended();
			gameEnded();
		}
		else {
			controller.reset();
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