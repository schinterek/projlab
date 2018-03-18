package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor {
	// A kapcsolokat reprezentalja.
	
	private boolean isOpen = false;
	private SwitchableHole switchablehole;
	
	public Switch() {
		System.out.println("Switch created");
	}
	
	public void accept(Movable m) {
		System.out.println("Switch: Ramleptek");
		// Meghivja a Movable setSwitch metodusat.
        this.containedMovable=m;
        m.setContainer(this);
		if (m.setSwitch()) { 
			isOpen=true;
			System.out.println("Switch felkapcsolt");
			if (switchablehole!=null) {
			if(switchablehole.getContained()!=null) { 
				switchablehole.getContained().Die();
				switchablehole.containedLeft();}
			}
			}
		// TODO
		
	}
	
	public void containedLeft(){
		System.out.println("Switch lekapcsolt");
		// Az isOpen attributumot false-ra allitja.
		//elment rola a doboz, ezert lekapcsol a switch

		isOpen = false;
		containedMovable=null;
	}
	
	public boolean isOpen(){
		//System.out.println("Switch isOpen fv");
		return isOpen;
	}
	
	public void SetOpen(Boolean b) {
		//System.out.println("Switch SetOpen fv");
		isOpen=b;
	}
	
	public void setSwitchableHole(SwitchableHole sh)
	{
		//System.out.println("Switch setSwitchableHole fv");
		switchablehole = sh;
	}

}
