package projlab;

import java.util.ArrayList;

public class Player {
	// A jatekosokat valositja meg.
	
	private int points=0;
	private Worker worker;
	private String name;
	private ArrayList<String> controls = new ArrayList<String>();
	
	public Player(String n) {
		name = n;
	}
	
	public void recieveCommand(String c){
		// Kezeli a jatekosok altal lenyomott billentyuket.
		// Ha az adott jatekoshoz tartozik az inputkent kapott karakter,
		// reagal ra, masok nem.

		int i = controls.indexOf(c);
		switch(i)
		{
		case 0: 
			worker.move(Direction.UP, this);
			break;
		case 1: 
			worker.move(Direction.LEFT, this);
			break;
		case 2: 
			worker.move(Direction.DOWN, this);
			break;
		case 3: 
			worker.move(Direction.RIGHT, this);
			break;
		case 4:
			worker.spillOil();
			break;
		case 5:
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

	public void setControl(String s)
	{
		controls.add(s);
	}
	
	public boolean hasControl(String s)
	{
		return controls.contains(s);
	}

}
