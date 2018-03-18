package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Hole {
	// Az �tkapcsolhat� lyukakat val�s�tja meg.
	
	private Switch switches;
	private Movable contained;
	
	@Override
	public void accept(Movable m) {
		if( switches.isOpen()) {
			m.Die();
		}
		
	}
	
	public Movable getContained(){
		return contained;
	}
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src) {
		if(switches.isOpen()) {
			return true;
		}
		else {
			if(contained==null)
				return true;
			else
				return contained.accept(toArrive);
		}
	}
	public void containedLeft() {
		contained=null;
	}
}
