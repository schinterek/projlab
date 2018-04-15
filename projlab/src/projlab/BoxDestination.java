package projlab;

public class BoxDestination extends Floor {
	// Az a mezo, ahova a Box-okat kell eljuttatni.
	
	private int index=0;
	
	public BoxDestination(int x, int y, double slippery, int index) {
		super(x, y, slippery);
		this.index=index;
	}

	public int getIndex() {
		return index;
	}
	
	public void accept(Movable m) {
		// Ha a megfelelo Box-ot toljak ra, akkor
		// azt eltunteti a palyarol.
		
		// !!!
		// Visitorban az accpet() boolean-nek van irva,
		// de a doksiban ez a fuggveny void volt.
		
		// TODO
		setContainedMovable(m);
		m.destinationReached();
	}
	
	public void print()
	{
		if (containedMovable==null)
		  System.out.print(" D");
		else containedMovable.print();
	}
	

}
