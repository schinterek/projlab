package projlab;

public class Hole extends Cell{
	// A luykakat reprezentalja.

	public Hole() {
		System.out.println("Hole created");
	}
	
	@Override
	public void accept(Movable m) {		
		// Meghivja a raerkezo Movable-nek a Die() fuggvenyet.
		// TODO
		System.out.println("Hole: Valaki leesett");
		m.Die();
	}
	
	
}
