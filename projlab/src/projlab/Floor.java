package projlab;

public class Floor extends Cell{
	// Sima padlot valositja meg.
	
	public Floor()
	{
		System.out.println("Floor created");
	}
	
	protected Movable containedMovable;

	public Movable getContained() {
		//System.out.println("Floor getContained fv");
		return containedMovable;
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src) 
	{
		//System.out.println("Floor canArrive fv");
		if(getContained()==null) return true;
		else return getContained().accept(toArrive);
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
		containedMovable = m;
		m.setContainer(this);
	}
	
	@Override
	
	public boolean move(Movable toMove, Direction dir, Player src) {
		//System.out.println("Floor move fv");
	    Map map = Map.getInstance();
	    return map.move(toMove, dir, src);
		
	}
	
	
	public void setContainedMovable(Movable m) {
	//	System.out.println("Floor setContainedMovable fv");
		m.setContainer(this);
	}
	
   
	
}
