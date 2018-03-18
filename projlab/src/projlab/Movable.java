package projlab;

public abstract class Movable {
	
	protected Floor container;
	
	public void acceptCell(Cell v) {
		v.accept(this);
	}
	
	public abstract boolean accept(Movable m);
	// Ehhez sem.
	
	public void destinationReached() {
	// Megmondja, hogy a l�da el�rte-e a megfelel� helyet,
	// ha igen, elt�nteti a l�d�t.
	//worker eseten nem csinal semmit a fuggveny
	}
	
	public boolean pushWorker(){
		return true;
	}
	
	public boolean setSwitch(){
		// Vizsg�lja, hogy �ll�tani kell-e a kapcsol�t,
		// ami att�l f�gg, hogy munk�s (ekkor nem)
		// vagy l�da (ekkor igen) l�pett r�.
		return false;
	}
	
	public void Die(){
		// !!!
		// Mi�rt nagy bet�? Mert destruktor?
		// A l�da �s a munk�s implement�lja,
		// jelezz�k, mikor meghal a munk�s vagy
		// elt�nik a doboz.
	}
	
	public void wallReached(){
		// Ha egy Movable el�ri a falat, ezt a f�gv�nyt h�vjuk.
		
		// Alap�rtelmezetten �res.
	}
	
	public void setContainer(Floor f) 
	{
		container = f;
	}
	public Floor getContainer() 
	{  
	    return container; 
	}
	
}
