package projlab;

public class BoxDestination extends Floor implements Visitor {
	// Az a mez�, ahova a Box-okat kell eljuttatni.
	
	public boolean accept(Movable m) {
		// Ha a megfelel� Box-ot tolj�k r�, akkor
		// azt elt�nteti a p�ly�r�l.
		
		// !!!
		// Visitorban az accpet() boolean-nek van �rva,
		// de a doksiban ez a f�ggv�ny void volt.
		
		// TODO
		return true;
	}
	
	@Override
	public Movable getContained() {
		// TODO Auto-generated method stub
		return null;
	}
}
