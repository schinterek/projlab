package projlab;

import java.util.zip.ZipEntry;

public class Switch extends Floor {
	// A kapcsolokat reprezentalja.
	
	private int index=0;
	
	private boolean isOpen = false;
	private SwitchableHole switchablehole;
	
	public Switch(int x, int y, double slippery, int index) {
		super(x,y,slippery);
		//System.out.println("Switch created");
		this.index=index;
	}
	
	public int getIndex() {
		return index;
	}
	
	public void accept(Movable m) {
		System.out.println("Switch: Ramleptek");
		// Meghivja a Movable setSwitch metodusat.
        setContainedMovable(m);
		if (m.setSwitch()) { 
			isOpen=true;
			//System.out.println("Switch felkapcsolt");
			if (switchablehole!=null) {
			if(switchablehole.getContained()!=null && switchablehole.getContained()!= this.getContained()) { 
				switchablehole.getContained().Die();
				switchablehole.containedLeft();
				}
			}
			}
		// TODO
		
	}
	
	public void containedLeft(){
		// Az isOpen attributumot false-ra allitja.
		//elment rola a doboz, ezert lekapcsol a switch
		if (isOpen)
		//System.out.println("Switch lekapcsolt");
		//System.out.println("Switch: Elleptek rolam");
		

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
		//Osszeparositja a switcheket es a holekat
		//System.out.println("Switch setSwitchableHole fv");
		switchablehole = sh;
		sh.setSwitch(this);
	}
	
	public String print()
	{
		if (containedMovable==null)
		  return "images\\switch.png";
		else return containedMovable.print();
	}

}
