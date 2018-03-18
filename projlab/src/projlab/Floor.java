package projlab;

public class Floor extends Cell{
	// Sima padl�t val�s�tja meg.
	
	private Movable containedMovable;

	@Override
	public Movable getContained() {
		return containedMovable;
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src) 
	{
		if(getContained()==null) return true;
		else return getContained().accept(toArrive);
	}
	
}
