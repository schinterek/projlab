package projlab;
///
public class Box extends Movable implements Visitor{
	// Egy dobozt reprezent�l, amit a hely�re kell tolni.

	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni a Boxot, akkor eld�nti,
		// hogy el tud-e tol�dni, ezzel t�r vissza. */
		
		// TODO
		return false;
	}
	
	public boolean acceptVisitor(Visitor v){
		// Azon a Box-on h�vjuk meg, amelyikkel el akarjuk tolni
		// a param�terk�nt kapott Visitor-t.
		// Visszaadja, hogy siker�lt-e az eltol�s.
		
		// TODO
		return false;
	}
	
	public void setSwitch(){
		// Ha a Box kapcsol�ra tol�dik, ez a f�ggv�ny kapcsolja
		// be a kapcsol�t.
		
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
		
		// TODO
	}

	public void Die()
	{
		
	}
}
