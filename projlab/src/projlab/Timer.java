package projlab;

import java.util.Scanner;

// <<singleton>>
public class Timer {
	// Az ido teleset figyelo osztaly.
	private static Timer timer = new Timer();
	Controller controller = Controller.getInstance();
	
	private Timer() {}
	public static Timer getInstance() { return timer;}
	
	public void run(String test){
		//A jatek inditasaban segito fuggveny
		//controller.writeTest();
		if(test.equals("t") || test.equals("T")) {
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
