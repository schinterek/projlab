package projlab;

public class Floor extends Cell{
	// Sima padlot valositja meg.
	protected double slippery;
	
	public Floor(int x, int y, double slippery)
	{
		this.x = x;
		this.y = y;
		this.slippery = slippery;
		System.out.println("Floor created");
	}
	
	protected Movable containedMovable;

	public Movable getContained() {
		//System.out.println("Floor getContained fv");
		return containedMovable;
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength) 
	{
		//System.out.println("Floor canArrive fv");
		if(getContained()==null) return true;
		else {
			
			strength -= slippery*(double)containedMovable.getWeight();
			if(strength < 0) {  System.out.println("Nem tudsz eltolni!");   return false;   }
			else return getContained().accept(toArrive,dir,strength);
			}
	}
	
	@Override
	public void containedLeft(){
		System.out.println("Floor: Elleptek rolam");
		// Azt kezeli, hogy egy objektum elhagyta az adott cellat.
		containedMovable = null;
	}
	
	public void accept(Movable m) 
	{
		System.out.println("Floor: Ramleptek");
		setContainedMovable(m);
	}
	
	@Override
	
	public boolean move(Movable toMove, Direction dir, Player src, double strength) {
		//System.out.println("Floor move fv");
	    Map map = Map.getInstance();
	    return map.move(toMove, dir, src, strength);
		
	}
	
	@Override
	public void setContainedMovable(Movable m) {
	//	System.out.println("Floor setContainedMovable fv");
		m.setContainer(this);
		containedMovable=m;
		m.setX(x);
		m.setY(y);
	}
	
	public double getSlippery()
	{
		return slippery;
	}
	
	public void print()
	{
		if (containedMovable==null)
		  System.out.print(" F");
		else containedMovable.print();
	}
   
	
}
