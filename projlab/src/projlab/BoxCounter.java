package projlab;

// <<singleton>>
public class BoxCounter {
	// A palyan levo Box-ok szamat tartja nyilvan.
	
	private int numOfBoxes=0;
	private Game game;
	private static BoxCounter boxcounter= new BoxCounter();
	
	public void increaseBoxes() {
		numOfBoxes++;
	}
	
	public void setGame(Game g) {
		game=g;
	}
	
	public void boxDisappeared(){
		if(numOfBoxes>1){
			numOfBoxes--;
			System.out.println(Integer.toString(numOfBoxes));
		}
		else {
			numOfBoxes--;
			System.out.println("Nincs már több doboz");
			game.gameEnded();
		}
		// Ha egy Box lyukba esett, vagy a helyere kerult,
		// azaz eltunt, csokkenti a Box-ok szamat 1-gyel.
		
		// TODO
	}
	
	public static BoxCounter getInstance() { return boxcounter;}

}
