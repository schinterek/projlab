package projlab;

// <<singleton>>
public class BoxCounter {
	// A palyan levo Box-ok szamat tartja nyilvan.
	
	private int numOfBoxes;
	private Game game;
	private static BoxCounter boxcounter= new BoxCounter();
	
	public void boxDisappeared(){
		System.out.println("BoxCounter boxDisappeared fv");
		if(numOfBoxes>1)
			numOfBoxes--;
		else {
			numOfBoxes--;
			System.out.println("Nincs már több doboz -->játék vége");
			game.gameEnded();
		}
		// Ha egy Box lyukba esett, vagy a helyere kerult,
		// azaz eltunt, csokkenti a Box-ok szamat 1-gyel.
		
		// TODO
	}
	
	public static BoxCounter getInstance() { return boxcounter;}

}
