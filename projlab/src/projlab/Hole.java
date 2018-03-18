package projlab;

public class Hole extends Cell{
	// A luykakat reprezent�lja.

	@Override
	public void accept(Movable m) {		
		// Megh�vja a r��rkez� Movable-nek a Die() f�ggv�ny�t.
		// TODO
		m.Die();
	}
	
	public Movable getContained() { return null;}
	
}
