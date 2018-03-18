package projlab;

public class BoxDestination extends Floor {
	// Az a mez�, ahova a Box-okat kell eljuttatni.
	
	
	public void accept(Movable m) {
		// Ha a megfelel� Box-ot tolj�k r�, akkor
		// azt elt�nteti a p�ly�r�l.
		
		// !!!
		// Visitorban az accpet() boolean-nek van �rva,
		// de a doksiban ez a f�ggv�ny void volt.
		
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
