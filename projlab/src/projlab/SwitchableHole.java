package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Hole implements Visitor {
	// Az átkapcsolható lyukakat valósítja meg.
	
	private ArrayList<Switch> switches;
	// Csak random beírtam ebbe a struktúrába.
	
	@Override
	public boolean accept(Movable m) {
		// TODO Auto-generated method stub
		return super.accept(m);
		// Itt ennek akkor nem boolean-nek, hanem
		// void-nak kéne lennie?
	}
}
