package projlab;
///
public class Box extends Movable{
	// Egy dobozt reprezent�l, amit a hely�re kell tolni.

	protected BoxDestination boxdestination;
	
	
	public Box()
	{
		System.out.println("Box created");
	}
	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni a Boxot, akkor eld�nti,
		// hogy el tud-e tol�dni, ezzel t�r vissza. */
		// TODO
		pusher=m;
		boolean moved = container.move(this, Direction.RIGHT, null);
		pusher = null;
		return moved;
		
	}
	
	
	public boolean setSwitch(){
		// Ha a Box kapcsol�ra tol�dik, ez a f�ggv�ny kapcsolja
		// be a kapcsol�t.
		
		// TODO
		return true;
	}
	
	public void destinationReached(){
		// Ha a l�da el�ri a sz�m�ra kijel�lt poz�ci�t a padl�n,
		// elt�nik.
		addPoint();
		//BoxCounter.boxDisappeared();
        container.containedLeft();
		Die();
		// TODO
	}

	public void Die()
	{
		System.out.println("Box eltűnt");
		
	}
}
