package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor implements Visitor {
	// A kapcsolókat reprezentálja.
	
	private boolean isOpen;
	
	public boolean accept(Movable m) {
		// Meghívja a Movable setSwitch metódusát.
		m.setSwitch();
		// TODO
		return true;
	}
	
	public void containedLeft(){
		// Az isOpen attribútumot false-ra állítja.
		// ???
		isOpen = false;
	}
	
	public boolean isOpen(){
		return isOpen;
	}

}
