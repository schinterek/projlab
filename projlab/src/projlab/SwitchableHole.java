package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Floor {
	// Az atkapcsolhato lyukakat valositja meg.
	
	public SwitchableHole(int x, int y, double slippery) {
		super(x, y, slippery);
	}

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
		}
		
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength) {
		//System.out.println("SwitchableHole canArrive fv");
		if(switches.isOpen()) {
			return true;
		}
		else {
			if(getContained()==null)
				return true;
			else
			{
				
				strength -= slippery*(double)containedMovable.getWeight();
				if(strength < 0) return false;
				else return getContained().accept(toArrive,dir,strength);
				}
		}
	}
	
	public void print()
	{
		if (containedMovable==null)
		  System.out.print(" T");
		else containedMovable.print();
	}
	
	public void setSwitch(Switch sw)
	{
		this.switches = sw;
	}

}
