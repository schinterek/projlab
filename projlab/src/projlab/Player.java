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

		
		switch(c)
		{
		case "W": 
			worker.move(Direction.UP, this);
			break;
		case "A": 
			worker.move(Direction.LEFT, this);
			break;
		case "S": 
			worker.move(Direction.DOWN, this);
			break;
		case "D": 
			worker.move(Direction.RIGHT, this);
			break;
		case "Q":
			worker.spillOil();
			break;
		case "E":
			worker.spillHoney();
			break;
		case "Up": 
			worker.move(Direction.UP, this);
			break;
		case "Left": 
			worker.move(Direction.LEFT, this);
			break;
		case "Down": 
			worker.move(Direction.DOWN, this);
			break;
		case "Right": 
			worker.move(Direction.RIGHT, this);
			break;
		case "Shift":
			worker.spillOil();
			break;
		case "Ctrl":
			worker.spillHoney();
			break;
		}

		
	}
	
	public void addPoint(){
		//pontot ad az adott jatekosnak
		points++;
		Map.getInstance().out(Integer.toString(points)+" pontja van a(z) "+this.name+" nevu jatekosnak");
	}
	
	public void setWorker(Worker w)
	{
		//a Workert parositja egy playerhez
		worker = w;
		w.setPlayer(this);
	}

	
	public void setPoints(int p) {points = p;}
	public int getPoints() { return points; }
	public void printPoints()
	{
		Map.getInstance().out(name + ": " + Integer.toString(points));
	}
	public String getName() { return name; }

	

}
