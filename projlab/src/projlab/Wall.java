package projlab;

public class Wall extends Cell {
	// Doksiba az volt �rva, hogy implement�lja a Visitort.
	// De az oszt�lydiagramon nem.

	@Override
	public Movable getContained() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Megh�vja a Movable->wallReached() f�ggv�ny�t.
		// ???
		toArrive.wallReached();
		return false;
	}

}
