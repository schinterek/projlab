package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor {
	// A kapcsol�kat reprezent�lja.
	
	private boolean isOpen = false;
	
	public Switch() {
		System.out.println("Switch created");
	}
	
	public void accept(Movable m) {
		// Megh�vja a Movable setSwitch met�dus�t.

		if (m.setSwitch()) isOpen=true;
		// TODO
		
	}
	
	public void containedLeft(){
		// Az isOpen attrib�tumot false-ra �ll�tja.
		//elment rola a doboz, ezert lekapcsol a switch

		isOpen = false;
		containedMovable=null;
	}
	
	public boolean isOpen(){
		return isOpen;
	}
	
	public void SetOpen(Boolean b) {
		isOpen=b;
	}

}
