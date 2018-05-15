package projlab;

public class Worker extends Movable {
	// A jatekosok altal iranyitott munkasokat reprezentalja.
	// Tudnak mozogni es ladakat tolni.

	private Player player;
	private boolean isPushed;
	private double strength;
	private int index;
	// Azt mondja meg, hogy ladaval toltuk-e arrebb.
	// Csak addig igaz, mig meg nem erkezett arra a cellara,
	// amivel a ladara toltuk.
	// Megerkezes utan hamisra allitodik.
	
	public Worker(int x, int y, double strength, int i)
	{
		//System.out.println("Worker created");
		this.x = x;
		this.y = y;
		this.strength = strength;
		index = i;
	}
	
	public void spillOil() {//Azt a Floor olajossa teszi amin eppen all a worker
		container.getOily();
	}
	
	public void spillHoney() { //Azt a Floor mezesse teszi amin eppen all a worker
		container.getHoneyed();
	}
	
	
	public boolean accept(Movable m, Direction dir, double strength){
		//System.out.println("Worker accept fv");
		// Ha egy Movable el akarja tolni,  
		// akkor o is megprobal tovabbtolodni.
		// Azzal ter vissza, hogy ez sikerult-e;

		boolean canpush=m.pushWorker();
		if (canpush==true)
		{
			pusher=m;
			setPushed(true);
			boolean canarrive = container.move(this, dir, player, strength);
			pusher= null;
		   setPushed(false);
		  //if(canarrive==true)
			  //System.out.println("Worker lepett");
		  //else System.out.println("Worker nem lepett");
		   return  canarrive;
		}

		else
		{
			return false;
		}


		// TODO

	}
	
	public void move(Direction dir, Player src){
		//System.out.println("Munkas lépett");
		// Mozgatjuk a munkast az adott iranyba.
		//System.out.println("Worker move fv");
		this.getContainer().move(this, dir, src, strength);
	}
	
	public boolean pushWorker(){
		//System.out.println("Worker psuhWorker fv");
		// False-szal ter vissza, mert munkas nem
		// tud munkast eltolni.
		return false;
	}
	
	public boolean wallReached(){
	//	System.out.println("Worker wallReached fv");
		// Ha a jatekos eleri a falat:
		// ha az isPushed valtozo igaz, meghal,
		// ha nem, akkor nem.

		if (isPushed == true)
		{
			//System.out.println("Munkas meghalt mert falnak toltak");
			container.containedLeft();
			Die();
			return true;
			
			
		}
		else {
			//System.out.println("Falnak mentel!");

		return false; }



	}
	
	public void addPoint()
	{
		//pontozasert felelos fuggveny
		if(pusher==null) 
			player.addPoint();
		else
			pusher.addPoint();
	}

	public void setPushed(boolean b)
	{
		isPushed=b;
	}

	public Player getPlayer()
	{
		return player;
	}

	public void Die()
	{//A Worker halalaert felel
		//System.out.println("Worker meghalt :( ");
		this.setX(-1);
		this.setY(-1);
		Controller cont = Controller.getInstance();
		cont.playerDied(player);
		
		

	}
	
	public double getStrength()
	{
		return strength;
	}
	public String print()
	{
		if(index == 0) {
			if(container.slippery==0.5)
				return "images\\workero.png";
			else
				if(container.slippery==2)
					return "images\\workerh.png";
				else
					 return "images\\worker.png";
		}
		else {
			if(container.slippery==0.5)
				return "images\\workero2.png";
			else
				if(container.slippery==2)
					return "images\\workerh2.png";
				else
					 return "images\\worker2.png";
		}
	}
	public int getWeight() { return 1; }
	public void setPlayer(Player p)
	{
		player = p;
	}
	
}
