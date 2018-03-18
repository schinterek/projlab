package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Map {

	

	// A p�ly�t �s a rajta l�v� mez�ket val�s�tja meg.
	
	// !!!
	private ArrayList<Cell> cells;
	// !!!
	// Milyen struktur�ban k�ne t�rolni?
	
	public boolean move(Movable toMove, Direction dir, Player src){
		// Egy bizonyos Movable egy bizonyos ir�nyba akar l�pni.
		// Ez a f�ggv�ny mondja meg, hogy arra a cell�ra
		// r� lehet-e l�pni, �s hogy �llnak-e m�r rajta.
		
		// !!!
		// "�s hogy �llnak-e m�r rajta?"
		
		// TODO
		int actualindex = cells.indexOf(toMove.getContainer());
		 if ( actualindex > 0  ) { return cells.get(actualindex+1).canArrive(toMove, dir, src); }
		 else  {
			 System.out.println("Pálya széle!");
			 return false;
		 }
		
		
		
	}
	
}	

