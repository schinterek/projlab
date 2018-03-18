package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Floor {
	// Az �tkapcsolhat� lyukakat val�s�tja meg.
	
	private Switch switches;
	
	@Override
	public void accept(Movable m) {
		
		if( switches.isOpen()) {
			System.out.println("SwitchHole: Valaki leesett xd lol");
			m.Die();
		}
		else {
			System.out.println("SwitchHole: Rámléptek");
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
