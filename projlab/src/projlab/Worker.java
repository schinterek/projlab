package projlab;

public class Worker extends Movable {
	// A jatekosok altal iranyitott munkasokat reprezentalja.
	// Tudnak mozogni es ladakat tolni.

	private Player player;
	private boolean isPushed;
	// Azt mondja meg, hogy ladaval toltuk-e arrebb.
	// Csak addig igaz, mig meg nem erkezett arra a cellara,
	// amivel a ladara toltuk.
	// Megerkezes utan hamisra allitodik.
	
	public Worker()
	{
		System.out.println("Worker created");
	}
	
	public boolean accept(Movable m){
		//System.out.println("Worker accept fv");
		// Ha egy Movable el akarja tolni,  dd
		// akkor o is megprobal tovabbtolodni.
		// Azzal ter vissza, hogy ez sikerult-e;

		boolean canpush=m.pushWorker();
		if (canpush==true)
		{
			pusher=m;
			setPushed(true);
			boolean canarrive = container.move(this, Direction.RIGHT, player);
			pusher= null;
		   setPushed(false);
		  if(canarrive==true)
			  System.out.println("Worker lepett");
		  else System.out.println("Worker nem lepett");
		   return  canarrive;
		}

		else
		{
			return false;
		}


		// TODO

	}
	
	public void move(Direction dir, Player src){
		System.out.println("Munkas lépett");
		// Mozgatjuk a munkast az adott iranyba.
		//System.out.println("Worker move fv");
		this.getContainer().move(this, dir, src);
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
			System.out.println("Munkas meghalt mert falnak toltak");
			container.containedLeft();
			Die();
			return true;
			
			
		}
		else {
			System.out.println("Falnak mentel!");

		return false; }



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
	{
		System.out.println("Worker meghalt :( ");
		

	}
	
	
	
}
