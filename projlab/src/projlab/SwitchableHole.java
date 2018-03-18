package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Hole implements Visitor {
	// Az �tkapcsolhat� lyukakat val�s�tja meg.
	
	private ArrayList<Switch> switches;
	// Csak random be�rtam ebbe a strukt�r�ba.
	
	@Override
	public boolean accept(Movable m) {
		// TODO Auto-generated method stub
		return super.accept(m);
		// Itt ennek akkor nem boolean-nek, hanem
		// void-nak k�ne lennie?

	}
}
