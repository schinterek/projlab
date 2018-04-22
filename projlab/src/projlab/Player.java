package projlab;

public class Player {
	// A jatekosokat valositja meg.
	
	private int points=0;
	private Worker worker;
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
			worker.move(Direction.UP, this);
			break;
		case "a": 
			worker.move(Direction.LEFT, this);
			break;
		case "s": 
			worker.move(Direction.DOWN, this);
			break;
		case "d": 
			worker.move(Direction.RIGHT, this);
			break;
		case "q":
			worker.spillOil();
			break;
		case "e":
			worker.spillHoney();
			break;
		case "i": 
			worker.move(Direction.UP, this);
			break;
		case "j": 
			worker.move(Direction.LEFT, this);
			break;
		case "k": 
			worker.move(Direction.DOWN, this);
			break;
		case "l": 
			worker.move(Direction.RIGHT, this);
			break;
		case "u":
			worker.spillOil();
			break;
		case "o":
			worker.spillHoney();
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
		w.setPlayer(this);
	}
	
	
	
	public void setPoints(int p) {points = p;}
	public int getPoints() { return points; }
	public void printPoints()
	{
		System.out.println(name + ": " + Integer.toString(points));
	}
	public String getName() { return name; }

	

}
