package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Map {

	
	private static Map map = new Map();

	private Map() {System.out.println("Map created") ; }
	
	public static Map getInstance() {System.out.println("Map getInstance fv") ; return map;}
	// A p�ly�t �s a rajta l�v� mez�ket val�s�tja meg.
	
	// !!!
	private ArrayList<Cell> cells = new ArrayList<Cell>();
	// !!!
	// Milyen struktur�ban k�ne t�rolni?	
	// Milyen struktur�ban k�ne t�rolni?
	
	public void Add(Cell c) {
		
		cells.add(c);
	}
	
	public void removeAll() 
	{
		cells.removeAll(cells);
	}

	
	public boolean move(Movable toMove, Direction dir, Player src){
	//	System.out.println("Map move fv");
		// Egy bizonyos Movable egy bizonyos iranyba akar lepni.
		// Ez a fuggveny mondja meg, hogy arra a cellara
		// ra lehet-e lepni, es hogy allnak-e mar rajta.
		
		// !!!

		
		// TODO
		int actualindex = cells.indexOf(toMove.getContainer());
		 if ( actualindex >= 0  ) { 
			 
			 boolean canarrive = cells.get(actualindex+1).canArrive(toMove, dir, src); 
			 if (canarrive) {
				 if(cells.get(actualindex).getContained()!=null) toMove.acceptCell(cells.get(actualindex+1));
				 
				 cells.get(actualindex).containedLeft();
			//	 System.out.println("Map move fv");
				 return true;
			 } 
	//		 else System.out.println("Map move fv"); 
			 return false;
		 
		 }
		 else  {
			// System.out.println("Map move fv");
			 System.out.println("Palya szele!");
			 return false;
		 }		
		
	}
	
	public void initMap(int numofcells, int numofworkers, int numofboxes)
	{
		System.out.println("Map initMap fv");
		for(int i=0; i<numofcells; i++) 
		{
			Floor f= new Floor();
			cells.add(f);
		}
		
		for(int i=0; i<numofboxes; i++) 
		{
			Box b= new Box();
		}
		
		for(int i=0; i<numofworkers; i++) 
		{
			Worker w= new Worker();
		}
					
		numofcells = 0;

		numofboxes = 0;
		numofworkers = 0;


		numofboxes = 0;
		numofworkers = 0;
		numofworkers = 0;

		System.out.println("Map created") ;
	}
	
}	

