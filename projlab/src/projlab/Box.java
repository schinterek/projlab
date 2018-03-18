package projlab;
///
public class Box extends Movable{
	// Egy dobozt reprezental, amit a helyere kell tolni.

	protected BoxDestination boxdestination;
	
	
	public Box()
	{
		System.out.println("Box created");
	}
	public boolean accept(Movable m){
		//System.out.println("Box accept fv");
		// Ha egy Movable el akarja tolni a Boxot, akkor eldonti,
		// hogy el tud-e tolodni, ezzel ter vissza. */
		// TODO
		pusher=m;
		boolean moved = container.move(this, Direction.RIGHT, null);
		pusher = null;
		if (moved==true)
			System.out.println("Box lepett");
		else System.out.println("Box nem lepett");
		return moved;
		
	}
	
	
	public boolean setSwitch(){
	//	System.out.println("Box setSwitch fv");
		// Ha a Box kapcsolora tolodik, ez a fuggveny kapcsolja
		// be a kapcsolot.
		
		// TODO
		return true;
	}
	
	public void destinationReached(){
		System.out.println("Box: Celba ertem");
		// Ha a lada eleri a szamara kijelolt pozociot a padlon,
		// eltunik.
		addPoint();
		//BoxCounter.boxDisappeared();
        container.containedLeft();
		Die();
		// TODO
	}

	public void Die()
	{
		System.out.println("Box eltunt");
		
	}
}
