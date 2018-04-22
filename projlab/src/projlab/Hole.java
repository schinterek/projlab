package projlab;

public class Hole extends Cell{
	// A lyukakat reprezentalja.

	public Hole(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Hole created");
	}
	
	@Override
	public void accept(Movable m) {		
		// Meghivja a raerkezo Movable-nek a Die() fuggvenyet.
		// TODO
		System.out.println("Hole: Valaki leesett");
		m.Die();
	}
	
	public void print()
	{
		System.out.print(" H");
	}
	
}
