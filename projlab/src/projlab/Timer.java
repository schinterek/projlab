package projlab;

// <<singleton>>
public class Timer {
	// Az idõ telését figyelõ osztály.
	
	
	public Timer()
	{
		System.out.println("Timer created");
	}
	
	public void run(){
		System.out.println("Timer run fv");
		// ELindítja a Timer-nek a szálát, amely
		// idõközönként meghívja a Controller->step()
		// metódusát.
		System.out.println("The game is running");
	}
}
