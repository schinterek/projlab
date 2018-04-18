package projlab;

// <<singleton>>
public class Timer {
	// Az ido teleset figyelo osztaly.
	private static Timer timer = new Timer();
	Controller controller = Controller.getInstance();
	
	private Timer() {}
	public static Timer getInstance() { return timer;}
	
	public void run(){
		// ELinditja a Timer-nek a szalat, amely
		// idokozonkent meghivja a Controller->step()
		// metodusat.
		controller.step();
		
		
		
	}
}
