package projlab;

public class BoxDestination extends Floor {
	// Az a mezo, ahova a Box-okat kell eljuttatni.
	
	
	public void accept(Movable m) {
		// Ha a megfelelo Box-ot toljak ra, akkor
		// azt eltunteti a palyarol.
		
		// !!!
		// Visitorban az accpet() boolean-nek van irva,
		// de a doksiban ez a fuggveny void volt.
		
		// TODO
		m.setContainer(this);
		this.setContainedMovable(m);
		m.destinationReached();
	}
	
	@Override
	public Movable getContained() {
		// TODO Auto-generated method stub
		return null;
	}
}
