package projlab;

public abstract class Movable {
	public abstract boolean acceptVisitor(Visitor v);
	// Ehhez nem volt leírás a doksiban.
	
	public abstract boolean accept(Movable m);
	// Ehhez sem.
	
	public void destinationReached() {
	// Megmondja, hogy a láda elérte-e a megfelelõ helyet,
	// ha igen, eltünteti a ládát.
	
	// TODO
	}
	
	public boolean pushWorker(){
		// Ehhez annyi volt írva a doksiban, hogy:
		// True-t ad vissza.
		return true;
	}
	
	public void setSwitch(){
		// Vizsgálja, hogy állítani kell-e a kapcsolót,
		// ami attól függ, hogy munkás (ekkor nem)
		// vagy láda (ekkor igen) lépett rá.
	}
	
	public void Die(){
		// !!!
		// Miért nagy betû? Mert destruktor?
		// A láda és a munkás implementálja,
		// jelezzük, mikor meghal a munkás vagy
		// eltûnik a doboz.
	}
	
	public void wallReached(){
		// Ha egy Movable eléri a falat, ezt a fügvényt hívjuk.
		
		// Alapértelmezetten üres.
	}
}
