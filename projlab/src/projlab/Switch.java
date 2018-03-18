package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor {
	// A kapcsol�kat reprezent�lja.
	
	private boolean isOpen = false;
	private SwitchableHole switchablehole;
	
	public Switch() {
		System.out.println("Switch created");
	}
	
	public void accept(Movable m) {
		// Megh�vja a Movable setSwitch met�dus�t.
        this.containedMovable=m;
        m.setContainer(this);
		if (m.setSwitch()) { 
			isOpen=true;
			if (switchablehole!=null) {
			if(switchablehole.getContained()!=null) { 
				switchablehole.getContained().Die();
				switchablehole.containedLeft();}
			}
			}
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
	
	public void setSwitchableHole(SwitchableHole sh)
	{
		switchablehole = sh;
	}

}
