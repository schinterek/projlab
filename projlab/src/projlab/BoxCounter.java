package projlab;

// <<singleton>>
public class BoxCounter {
	// A palyan levo Box-ok szamat tartja nyilvan.
	
	private int numOfBoxes=0;
	private Game game;
	private static BoxCounter boxcounter= new BoxCounter();
	
	public void increaseBoxes() {
		//a boxok szamat noveli
		numOfBoxes++;
	}
	
	public void setGame(Game g) {
		game=g;
	}
	
	public void boxDisappeared(){
		// Ha egy Box lyukba esett, vagy a helyere kerult,
		// azaz eltunt, csokkenti a Box-ok szamat 1-gyel.
		
		if(numOfBoxes>1){
			numOfBoxes--;
			System.out.println(Integer.toString(numOfBoxes));
		}
		else {
			numOfBoxes--;
			System.out.println("Nincs már több doboz");
			game.gameEnded();
		}
		
		// TODO
	}
	public void reset() {
		numOfBoxes=0;
		
	}
	
	public static BoxCounter getInstance() { return boxcounter;}

}
