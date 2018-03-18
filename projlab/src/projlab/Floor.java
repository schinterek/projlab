package projlab;

public class Floor extends Cell{
	// Sima padl�t val�s�tja meg.
	
	public Floor()
	{
		System.out.println("Floor created");
	}
	
	protected Movable containedMovable;

	public Movable getContained() {
		return containedMovable;
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src) 
	{
		if(getContained()==null) return true;
		else return getContained().accept(toArrive);
	}
	
	@Override
	public void containedLeft(){
		// Azt kezeli, hogy egy objektum elhagyta az adott cell�t.
		containedMovable = null;
	}
	
	public void accept(Movable m) 
	{
		containedMovable = m;
		m.setContainer(this);
	}
	
	@Override
	
	public boolean move(Movable toMove, Direction dir, Player src) {
	    Map map = Map.getInstance();
	    return map.move(toMove, dir, src);
		
	}
	
	
	public void setContainedMovable(Movable m) {
		m.setContainer(this);
	}
	
   
	
}
