package projlab;

public class BoxDestination extends Floor implements Visitor {
	// Az a mezõ, ahova a Box-okat kell eljuttatni.
	
	public boolean accept(Movable m) {
		// Ha a megfelelõ Box-ot tolják rá, akkor
		// azt eltünteti a pályáról.
		
		// !!!
		// Visitorban az accpet() boolean-nek van írva,
		// de a doksiban ez a függvény void volt.
		
		// TODO
		return true;
	}
	
	@Override
	public Movable getContained() {
		// TODO Auto-generated method stub
		return null;
	}
}
