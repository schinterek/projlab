package projlab;

public class Wall extends Cell {
	// Doksiba az volt írva, hogy implementálja a Visitort.
	// De az osztálydiagramon nem.

	@Override
	public Movable getContained() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Meghívja a Movable->wallReached() függvényét.
		// ???
		toArrive.wallReached();
		return false;
	}

}
