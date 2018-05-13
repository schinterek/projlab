package projlab;

public abstract class Cell {
	
	protected int x;
	protected int y;
	// Egy mezot reprezentalo absztrakt osztaly.
	
	public abstract void accept(Movable m);
	
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength){
		// Ha egy Movable objektum (toArrive) akar erkezni a egy bizonyos
		// iranybol (dir), egy bizonyos jatekos altal (src),
		// akkor eldonti, hogy megerkezhet-e a mezore.
		
		// Alapertelmezetten true-t ad vissza.
		return true;
	}
	
	public boolean move(Movable toMove, Direction dir, Player src, double strength) {return true;}
	
	public void containedLeft(){
		// Azt kezeli, hogy egy objektum elhagyta az adott cellat.
		
	}
	
	public Movable getContained() {
		return null;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	public void setContainedMovable(Movable m) {}
	
	public abstract String print();
	
}
