package projlab;

public class Player {
	// A jatekosokat valositja meg.
	
	private int points=0;
	private Worker worker;
	private Worker worker2;
	private Player player;
	private Player player2;
	private String name;
	
	public Player(String n) {
		name = n;
	}
	
	public void recieveCommand(String c){
		// Kezeli a jatekosok altal lenyomott billentyuket.
		// Ha az adott jatekoshoz tartozik az inputkent kapott karakter,
		// reagal ra, masok nem.
		
		// !!!
		// Ezt is el kene tarolni, hogy melyik jatekoshoz
		// milyen billentyukombinaciok tartoznak.
		
		// TODO
		
		switch(c)
		{
		case "w": 
			worker.move(Direction.UP, player);
			break;
		case "a": 
			worker.move(Direction.LEFT, player);
			break;
		case "s": 
			worker.move(Direction.DOWN, player);
			break;
		case "d": 
			worker.move(Direction.RIGHT, player);
			break;
		case "q":
			worker.spillOil();
			break;
		case "e":
			worker.spillHoney();
			break;
		case "i": 
			worker2.move(Direction.UP, player2);
			break;
		case "j": 
			worker2.move(Direction.LEFT, player2);
			break;
		case "k": 
			worker2.move(Direction.DOWN, player2);
			break;
		case "l": 
			worker2.move(Direction.RIGHT, player2);
			break;
		case "u":
			worker2.spillOil();
			break;
		case "o":
			worker2.spillHoney();
			break;
		}

		
	}
	
	public void addPoint(){
		points++;
		System.out.println(Integer.toString(points)+" pontja van a jatekosnak");
	}
	
	public void setWorker(Worker w)
	{
		worker = w;
		w.setPlayer(player);
	}
	
	public void setWorker2(Worker w2) {
		worker2 = w2;
		w2.setPlayer(player2);
		
	}
	
	public void setPoints(int p) {points = p;}
	public int getPoints() { return points; }
	public void printPoints()
	{
		System.out.println(name + ": " + Integer.toString(points));
	}
	public String getName() { return name; }

	

}
