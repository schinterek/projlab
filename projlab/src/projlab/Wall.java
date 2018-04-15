package projlab;

public class Wall extends Cell {

	public Wall(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void accept(Movable m) {}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength){
		// Meghivja a Movable->wallReached() fuggvenyet.
		// ???
		return toArrive.wallReached();
		
	}
	
	public void print()
	{
		System.out.print(" X");
	}

}
