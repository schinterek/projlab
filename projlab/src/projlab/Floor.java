package projlab;

public class Floor extends Cell{
	// Sima padlot valositja meg.
	protected double slippery;
	
	public Floor(int x, int y, double slippery)
	{
		this.x = x;
		this.y = y;
		this.slippery = slippery;
		//System.out.println("Floor created");
	}
	
	protected Movable containedMovable;

	public Movable getContained() {
		//System.out.println("Floor getContained fv");
		return containedMovable;
	}
	
	@Override
	public boolean canArrive(Movable toArrive, Direction dir, Player src, double strength) 
	{
		//Azt kezeli a fuggveny, hogy erkezhet-e ra egy adott elem
		if(getContained()==null) return true;
		else {
			
			strength -= slippery*(double)containedMovable.getWeight();
			if(strength < 0) {  System.out.println("Nem tudsz eltolni!");   return false;   }
			else return getContained().accept(toArrive,dir,strength);
			}
	}
	
	@Override
	public void containedLeft(){
		// Azt kezeli, hogy egy objektum elhagyta az adott cellat.
		containedMovable = null;
	}
	
	public void accept(Movable m) 
	{
		//Azt az esetet kezeli amikor valaki ralep erre a padlora
		setContainedMovable(m);
	}
	
	@Override
	
	public boolean move(Movable toMove, Direction dir, Player src, double strength) {
		//Jelzes a map fele hogy a rajta levo movable mozogni akar
	    Map map = Map.getInstance();
	    return map.move(toMove, dir, src, strength);
		
	}
	
	@Override
	public void setContainedMovable(Movable m) {
	//	System.out.println("Floor setContainedMovable fv");
		m.setContainer(this);
		containedMovable=m;
		m.setX(x);
		m.setY(y);
	}
	
	public double getSlippery()
	{
		return slippery;
	}
	
	public void getOily() {
		//beallitja a slipperyt olajosra
		if(slippery==2)
			slippery=1;
		else
			slippery=0.5;
		System.out.println("A Slippery = "+Double.toString(slippery) );
	}
	
	public void getHoneyed() {
		//beallitja a slipperyt mezesre
		if(slippery==0.5)
			slippery=1;
		else
			slippery=2;
		System.out.println("A Slippery = "+Double.toString(slippery) );
	}
	
	public String print()
	{
		if (containedMovable==null)
		  return "images\\floor.png";
		else return containedMovable.print();
	}
   
	
}
