package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor implements Visitor {
	// A kapcsol�kat reprezent�lja.
	
	private boolean isOpen;
	
	public boolean accept(Movable m) {
		// Megh�vja a Movable setSwitch met�dus�t.
		m.setSwitch();
		// TODO
		return true;
	}
	
	public void containedLeft(){
		// Az isOpen attrib�tumot false-ra �ll�tja.
		// ???
		//elment rola a doboz, ezert lekapcsol a switch
		isOpen = false;
	}
	
	public boolean isOpen(){
		return isOpen;
	}

}
