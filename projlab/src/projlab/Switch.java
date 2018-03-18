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
		System.out.println("Switch accept fv");
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
		System.out.println("Switch containedLeft fv");
		// Az isOpen attrib�tumot false-ra �ll�tja.
		//elment rola a doboz, ezert lekapcsol a switch

		isOpen = false;
		containedMovable=null;
	}
	
	public boolean isOpen(){
		System.out.println("Switch isOpen fv");
		return isOpen;
	}
	
	public void SetOpen(Boolean b) {
		System.out.println("Switch SetOpen fv");
		isOpen=b;
	}
	
	public void setSwitchableHole(SwitchableHole sh)
	{
		System.out.println("Switch setSwitchableHole fv");
		switchablehole = sh;
	}

}
