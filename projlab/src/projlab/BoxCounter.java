package projlab;

// <<singleton>>
public class BoxCounter {
	// A p�ly�n l�v� Box-ok sz�m�t tartja ny�lv�n.
	
	private int numOfBoxes;
	private Game game;
	
	public void boxDisappeared(){
		numOfBoxes--;
		if(numOfBoxes==0){
			game.gameEnded();
		}
	}

}
