package projlab;

import java.util.ArrayList;

public class SwitchableHole extends Floor {
	// Az atkapcsolhato lyukakat valositja meg.
	
	private int index=0;
	
	public SwitchableHole(int x, int y, double slippery, int index) {
		super(x, y, slippery);
		this.index=index;
	}
	
	public int getIndex() {
		return index;
	}

	private Switch switches;
	
	@Override
	public void accept(Movable m) {
		//Azt az esetet kezeli amikor erkezik valaki az adott hole-ra
		if( switches.isOpen()) {
			//System.out.println("SwitchHole: Valaki leesett");
			m.Die();
		}
		else {
			//System.out.println("SwitchHole: Ramleptek");
			this.setContainedMovable(m);
		}
		
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength) {
		//Azt allapitja meg hogy erkezhet-e ra valaki
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
	
	public String print()
	{
		if (switches.isOpen()==true)
		  return "images\\hole.png";
		else if(containedMovable==null)
			return "images\\floor.png";
		else
			return containedMovable.print();
	}
	
	public void setSwitch(Switch sw)
	{
		this.switches = sw;
	}

}
