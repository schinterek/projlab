package projlab;

// <<singleton>>
public class Timer {
	// Az ido teleset figyelo osztaly.
	
	
	public Timer()
	{
		System.out.println("Timer created");
	}
	
	public void run(){
		System.out.println("Timer run fv");
		// ELinditja a Timer-nek a szalat, amely
		// idokozonkent meghivja a Controller->step()
		// metodusat.
		System.out.println("The game is running");
	}
}
