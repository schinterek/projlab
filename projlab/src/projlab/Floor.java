package projlab;

public class Floor extends Cell implements Visitor {
	// Sima padlót valósítja meg.
	
	private Movable containedMovable;

	@Override
	public Movable getContained() {
		return containedMovable;
	}
	
}
