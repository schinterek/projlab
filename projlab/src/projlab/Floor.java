package projlab;

public class Floor extends Cell implements Visitor {
	// Sima padl�t val�s�tja meg.
	
	private Movable containedMovable;

	@Override
	public Movable getContained() {
		return containedMovable;
	}
	
}
