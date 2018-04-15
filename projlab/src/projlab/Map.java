package projlab;

import java.util.ArrayList;

// <<singleton>>
public class Map {

	
	private static Map map = new Map();
	private int columns;
	private int rows;
	private Worker w;
	private Switch sw;
	private SwitchableHole swh;

	private Map() {System.out.println("Map created") ; }
	
	public static Map getInstance() { return map;}
	// A p�ly�t �s a rajta l�v� mez�ket val�s�tja meg.
	
	
	private Cell[][] cells;

	
	public boolean move(Movable toMove, Direction dir, Player src, double strength){
	//	System.out.println("Map move fv");
		// Egy bizonyos Movable egy bizonyos iranyba akar lepni.
		// Ez a fuggveny mondja meg, hogy arra a cellara
		// ra lehet-e lepni, es hogy allnak-e mar rajta.
		
		// !!!

		
		// TODO
		int actX = toMove.getX();
		int actY = toMove.getY();
		 if ( actX >= 0 && actY >=0  ) { 
			 switch(dir)
			 {
			 case RIGHT:
				 if (actX+1>=columns)   { System.out.println("Palya szele!"); break; }
				 else 
				 {
					boolean canarrive = cells[actX+1][actY].canArrive(toMove, dir, src, strength);
					if (canarrive) {toMove.acceptCell(cells[actX+1][actY]);  cells[actX][actY].containedLeft(); }
					return canarrive;
					
				 }
			
			 case DOWN:
				 if (actY+1>=rows)   { System.out.println("Palya szele!"); break; }
				 else 
				 {
					 boolean canarrive = cells[actX][actY+1].canArrive(toMove, dir, src, strength);
						if (canarrive) { toMove.acceptCell(cells[actX][actY+1]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
			 case LEFT:
				 if (actX-1<0)   { System.out.println("Palya szele!"); break; }
				 else 
				 {
					 boolean canarrive = cells[actX-1][actY].canArrive(toMove, dir, src, strength);
						if (canarrive) {toMove.acceptCell(cells[actX-1][actY]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
			 case UP:
				 if (actY-1<0)   { System.out.println("Palya szele!"); break; }
				 else 
				 {
					 boolean canarrive = cells[actX][actY-1].canArrive(toMove, dir, src, strength);
						if (canarrive) { toMove.acceptCell(cells[actX][actY-1]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
				}
		 	}
		 else  {
			 System.out.println("Meghaltal mar bocsesz");
			 return false;
		 }		
		return false;
	}
	
	public void initMap(ItemContainer con)
	{
		Item sizeitem = con.GetMapSize();
		columns = sizeitem.getX();
		rows = sizeitem.getY();
		cells = new Cell[columns][rows];
		for(int i = 0; i < con.Count(); i++)
		{
		Item item = con.getItem(i);
		switch(item.getType())
		{
		case "Floor": 
			Floor floor = new Floor(item.getX(),item.getY(),item.getData());
			cells[floor.getX()][floor.getY()] = floor;
			break;
			
		case "Hole":
			Hole hole = new Hole(item.getX(),item.getY());
			cells[hole.getX()][hole.getY()] = hole;
			break;
			
		case "Switch":
			Switch sw = new Switch(item.getX(),item.getY(),item.getData());
			cells[sw.getX()][sw.getY()] = sw;
			this.sw = sw;
			break;
			
		case "SwitchableHole":
			SwitchableHole swh = new SwitchableHole(item.getX(),item.getY(),item.getData());
			cells[swh.getX()][swh.getY()] = swh;
			this.swh = swh;
			break;
			
		case "Wall":
			Wall wall = new Wall(item.getX(),item.getY());
			cells[wall.getX()][wall.getY()] = wall; 
			break;
			
		case "BoxDestination":
			BoxDestination boxd = new BoxDestination(item.getX(),item.getY(),item.getData());
			cells[boxd.getX()][boxd.getY()] = boxd;
			break;
			
		case "Worker":
			Worker worker = new Worker(item.getX(),item.getY(),item.getData());
			cells[worker.getX()][worker.getY()].accept(worker);
			w = worker;
			
			break;
			
		case "Box":
			Box box = new Box(item.getX(),item.getY(),(int)item.getData());
			cells[box.getX()][box.getY()].accept(box);
			BoxCounter.getInstance().increaseBoxes();
			break;
			
		
		}
	  }
		sw.setSwitchableHole(swh);
		System.out.println("Map created") ;
	}
	
	public void printMap()
	{
		System.out.println("");
		for (int j = 0; j < rows; j++)
		{
			System.out.print(" ");
			for (int i = 0; i< columns;i++)
			{
				cells[i][j].print();
			}
			System.out.println("");
			
		}
		System.out.println("");
	}
	
	public Movable getWorker()
	{
		return w;
	}
	
	
	
}	

