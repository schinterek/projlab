package projlab;

public class Hole extends Cell{
	// A luykakat reprezentalja.

	@Override
	public void accept(Movable m) {		
		// Meghivja a raerkezo Movable-nek a Die() fuggvenyet.
		// TODO
		System.out.println("Hole: Valaki leesett");
		m.Die();
	}
	
	
}
