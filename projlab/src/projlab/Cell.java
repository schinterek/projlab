package projlab;

public abstract class Cell implements Visitor {
	// Egy mezõt reprezentáló absztrakt osztály.
	
	public boolean accept(Movable m){
		// Üres függvény, ebben az osztályban úgysem
		// csinál semmit.
		return true;
	}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Ha egy Movable objektum (toArrive) akar érkezni a egy bizonyos
		// irányból (dir), egy bizonyos játékos által (src),
		// akkor eldönti, hogy megérkezhet-e a mezõre.
		
		// Alapértelmezetten true-t ad vissza.
		return true;
	}
	
	public boolean move(Movable toMove, Direction dir, Player src){
		// Ha egy Movable egy bizonyos irányba szeretne lépni,
		// ez a függvény dönti el, hogy léphet-e.
		
		// Alapértelmezetten true-t ad vissza.
		return true;
	}
	
	public void containedLeft(){
		// Azt kezeli, hogy egy objektum elhagyta az adott cellát.
	}
	
	public abstract Movable getContained();
	// Absztrakt függvény, visszaadja, hogy milyen
	// objektum van rajta.
}
