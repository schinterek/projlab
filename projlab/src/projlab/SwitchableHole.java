package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Floor {
	// Az atkapcsolhato lyukakat valositja meg.
	
	private Switch switches;
	
	@Override
	public void accept(Movable m) {
		
		if( switches.isOpen()) {
			System.out.println("SwitchHole: Valaki leesett");
			m.Die();
		}
		else {
			System.out.println("SwitchHole: Ramleptek");
			this.setContainedMovable(m);
			m.setContainer(this);
		}
		
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src) {
		//System.out.println("SwitchableHole canArrive fv");
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
