package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor {
	// A kapcsol�kat reprezent�lja.
	
	private boolean isOpen;
	
	public void accept(Movable m) {
		// Megh�vja a Movable setSwitch met�dus�t.

		m.setSwitch();
		// TODO
		
	}
	
	public void containedLeft(){
		// Az isOpen attrib�tumot false-ra �ll�tja.
		//elment rola a doboz, ezert lekapcsol a switch

		isOpen = false;
	}
	
	public boolean isOpen(){
		return isOpen;
	}
	
	public void SetOpen(Boolean b) {
		isOpen=b;
	}

}
