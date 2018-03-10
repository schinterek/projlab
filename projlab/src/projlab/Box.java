package projlab;

public class Box extends Movable implements Visitor{
	// Egy dobozt reprezentál, amit a helyére kell tolni.

	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni a Boxot, akkor eldönti,
		// hogy el tud-e tolódni, ezzel tér vissza. */
		
		// TODO
		return false;
	}
	
	public boolean acceptVisitor(Visitor v){
		// Azon a Box-on hívjuk meg, amelyikkel el akarjuk tolni
		// a paraméterként kapott Visitor-t.
		// Visszaadja, hogy sikerült-e az eltolás.
		
		// TODO
		return false;
	}
	
	public void setSwitch(){
		// Ha a Box kapcsolóra tolódik, ez a függvény kapcsolja
		// be a kapcsolót.
		
		// TODO
	}
	
	public boolean pushWorker(){
		// EZT NEM VÁGOM, doksiba csak annyi van írva, hogy:
		// visszatér true-val.
		
		// TODO
		return true;
	}
	
	public void destinationReached(){
		// Ha a láda eléri a számára kijelölt pozíciót a padlón,
		// eltûnik.
		
		// TODO
	}
}
