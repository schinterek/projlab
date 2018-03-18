package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Floor {
	// Az �tkapcsolhat� lyukakat val�s�tja meg.
	
	private Switch switches;
	
	@Override
	public void accept(Movable m) {
		if( switches.isOpen()) {
			m.Die();
		}
		else {
			this.setContainedMovable(m);
		}
		
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src) {
		if(switches.isOpen()) {
			return true;
		}
		else {
			if(getContained()==null)
				return true;
			else
				return getContained().accept(toArrive);
		}
	}

}
