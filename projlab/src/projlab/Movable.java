package projlab;

public abstract class Movable {
	
	protected Floor container;
	protected Movable pusher;
	
	public void acceptCell(Cell v) {
		v.accept(this);
	}
	
	public abstract boolean accept(Movable m);
	// Ehhez sem.
	
	public void destinationReached() {
	// Megmondja, hogy a lada elerte-e a megfelelo helyet,
	// ha igen, eltunteti a ladat.
	//worker eseten nem csinal semmit a fuggveny
	}
	
	public boolean pushWorker(){
		return true;
	}
	
	public boolean setSwitch(){
		// Vizsgalja, hogy allitani kell-e a kapcsolot,
		// ami attol fugg, hogy munkas (ekkor nem)
		// vagy lada (ekkor igen) lepett ra.
		return false;
	}
	
	public abstract void Die();
		// !!!
		// A lada es a munkas implementalja,
		// jelezzuk, mikor meghal a munkas vagy
		// eltunik a doboz.
	
	
	public boolean wallReached(){
		return false;
	}
	
	public void setContainer(Floor f) 
	{
		container = f;
	}
	public Floor getContainer() 
	{  
	    return container; 
	}
	
	public void addPoint()
	{
		if(pusher==null) return;
		pusher.addPoint();
	}
	
}
