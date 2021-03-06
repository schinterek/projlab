package projlab;
///
public class Box extends Movable{
	// Egy dobozt reprezental, amit a helyere kell tolni.

	protected BoxDestination boxdestination;
	private int weight;
	private int index=0;
	
	
	public void setDestination(BoxDestination d) {
		boxdestination=d;
	}
	
	public int getIndex() {
		return index;
	}
	
	public Box(int x, int y, int weight, int index)
	{
		//System.out.println("Box created");
		this.x = x;
		this.y = y;
		this.weight = weight;
		this.index=index;
		
	}
	
	public boolean accept(Movable m, Direction dir, double strength){
		// Ha egy Movable el akarja tolni a Boxot, akkor eldonti,
		// hogy el tud-e tolodni, ezzel ter vissza. */
		
		pusher=m;
		boolean moved = container.move(this, dir, null, strength);
		pusher = null;
		/*if (moved==true)
			System.out.println("Box lepett");
		else System.out.println("Box nem lepett");*/
		return moved;
	}
	
	
	public boolean setSwitch(){
		// Ha a Box kapcsolora tolodik, ez a fuggveny igazzal 
		//ter vissza mivel a box felkapcsolja a switchet
		
		// TODO
		return true;
	}
	
	public void destinationReached(){
		
		// Ha a lada eleri a szamara kijelolt pozociot a padlon,
		// eltunik.
		if(container==boxdestination) {
			//System.out.println("Box: Celba ertem");
			addPoint();
	        container.containedLeft();
			Die();
		}
		// TODO
	}

	public void Die()
	{
		//A lada eltunteseert felelos fuggveny
		BoxCounter.getInstance().boxDisappeared();
		//System.out.println("Box eltunt");
		
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public String print()
	{
		return "images\\box.png";
	}
}
