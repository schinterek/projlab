package projlab;

public class Hole implements Visitor {
	// A luykakat reprezent�lja.

	@Override
	public boolean accept(Movable m) {		
		// Megh�vja a r��rkez� Movable-nek a Die() f�ggv�ny�t.
		// TODO
		m.Die();
		return true;
	}
}
