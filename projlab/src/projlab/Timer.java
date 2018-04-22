package projlab;

import java.util.Scanner;

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
		//controller.writeTest();
		System.out.println("Tesztelés(T) vagy Játék (bármelyik másik billentyű) ?");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		if(s.equals("t") || s.equals("T")) {
			controller.Testing("nem_sikerult_eltolas.txt");
			/*controller.Testing("doboz_es_jatekos_lyukba_esik.txt");
			controller.Testing("ladat_celra_tolunk.txt");
			controller.Testing("workert_falnak_tolnak.txt");
			controller.Testing("switch_felkapcsolasa_switchableholeba_eses.txt");*/
		}
		else
			controller.step();
	}
}
