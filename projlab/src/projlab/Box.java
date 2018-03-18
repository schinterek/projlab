package projlab;
///
public class Box extends Movable{
	// Egy dobozt reprezent�l, amit a hely�re kell tolni.

	protected BoxDestination boxdestination;
	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni a Boxot, akkor eld�nti,
		// hogy el tud-e tol�dni, ezzel t�r vissza. */
		// TODO
		container.move(this, direction.RIGHT, player);
		return false;
	}
	
	public boolean acceptCell(Cell v){
		// Azon a Box-on h�vjuk meg, amelyikkel el akarjuk tolni
		// a param�terk�nt kapott Visitor-t.
		// Visszaadja, hogy siker�lt-e az eltol�s.
		
		// TODO
		return false;
	}
	
	public void setSwitch(){
		// Ha a Box kapcsol�ra tol�dik, ez a f�ggv�ny kapcsolja
		// be a kapcsol�t.

		return true;
		// TODO
	}
	
	public boolean pushWorker(){
		// EZT NEM V�GOM, doksiba csak annyi van �rva, hogy:
		// visszat�r true-val.
		
		// TODO
		return true;
	}
	
	public void destinationReached(){
		// Ha a l�da el�ri a sz�m�ra kijel�lt poz�ci�t a padl�n,
		// elt�nik.
		addPoint();
		BoxCounter.boxDisappeared();
		Die();
		// TODO
	}

	public void Die()
	{
		
	}
}
