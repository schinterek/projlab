package projlab;

public class Wall extends Cell {

	public void accept(Movable m) {}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src){
		// Meghivja a Movable->wallReached() fuggvenyet.
		// ???
		return toArrive.wallReached();
		
	}

}
