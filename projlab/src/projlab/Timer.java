package projlab;

// <<singleton>>
public class Timer {
	// Az id� tel�s�t figyel� oszt�ly.
	
	
	public Timer()
	{
		System.out.println("Timer created");
	}
	
	public void run(){
		// ELind�tja a Timer-nek a sz�l�t, amely
		// id�k�z�nk�nt megh�vja a Controller->step()
		// met�dus�t.
		System.out.println("The game is running");
	}
}
