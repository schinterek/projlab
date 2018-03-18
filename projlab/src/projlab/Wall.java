package projlab;

public class Wall extends Cell {
	// Doksiba az volt �rva, hogy implement�lja a Visitort.
	// De az oszt�lydiagramon nem.

	public void accept(Movable m) {}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Megh�vja a Movable->wallReached() f�ggv�ny�t.
		// ???
		return toArrive.wallReached();
		
	}

}
