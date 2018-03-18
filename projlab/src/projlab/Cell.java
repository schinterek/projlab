package projlab;

public abstract class Cell {
	// Egy mez�t reprezent�l� absztrakt oszt�ly.
	
	public abstract void accept(Movable m);
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Ha egy Movable objektum (toArrive) akar �rkezni a egy bizonyos
		// ir�nyb�l (dir), egy bizonyos j�t�kos �ltal (src),
		// akkor eld�nti, hogy meg�rkezhet-e a mez�re.
		
		// Alap�rtelmezetten true-t ad vissza.
		return true;
	}
	
	public boolean move(Movable toMove, Direction dir, Player src){
		// Ha egy Movable egy bizonyos ir�nyba szeretne l�pni,
		// ez a f�ggv�ny d�nti el, hogy l�phet-e.
		
		// Alap�rtelmezetten true-t ad vissza.
		return true;
	}
	
	public void containedLeft(){
		// Azt kezeli, hogy egy objektum elhagyta az adott cell�t.
		
	}
	
	
}
