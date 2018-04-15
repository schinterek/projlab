package projlab;

public class Player {
	// A jatekosokat valositja meg.
	
	private int points;
	private Worker worker;
	
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
		}

		
	}
	
	public void addPoint(){
		points++;
	}
	
	public void setWorker(Worker w)
	{
		worker = w;
		w.setPlayer(this);
	}

}
