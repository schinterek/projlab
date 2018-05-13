
package projlab;

import java.util.ArrayList;

import java.util.*;

// <<singleton>>
public class Map {

	
	private static Map map = new Map();
	private int columns;
	private int rows;
	private ArrayList<Switch> switches =new ArrayList<Switch>();
	private ArrayList<SwitchableHole> traps = new ArrayList<SwitchableHole>();
	private ArrayList<Box> boxes= new ArrayList<Box>();
	private ArrayList<BoxDestination> des = new ArrayList<BoxDestination>();

	private Map() {//System.out.println("Map created") ; 
	}
	
	public static Map getInstance() { return map;}
	
	private Cell[][] cells;
	
	private Window window;

	
	public boolean move(Movable toMove, Direction dir, Player src, double strength){
	//	System.out.println("Map move fv");
		// A cellak kozotti kommunikaciot vegzi

		
		// TODO
		int actX = toMove.getX();
		int actY = toMove.getY();
		 if ( actX >= 0 && actY >=0  ) { 
			 switch(dir)
			 {
			 case RIGHT:
				 if (actX+1>=columns)   {// System.out.println("Palya szele!");
				 break; }
				 else 
				 {
					boolean canarrive = cells[actX+1][actY].canArrive(toMove, dir, src, strength);
					if (canarrive) {toMove.acceptCell(cells[actX+1][actY]);  cells[actX][actY].containedLeft(); }
					return canarrive;
					
				 }
			
			 case DOWN:
				 if (actY+1>=rows)   { //System.out.println("Palya szele!");
				 break; }
				 else 
				 {
					 boolean canarrive = cells[actX][actY+1].canArrive(toMove, dir, src, strength);
						if (canarrive) { toMove.acceptCell(cells[actX][actY+1]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
			 case LEFT:
				 if (actX-1<0)   { //System.out.println("Palya szele!");
				 break; }
				 else 
				 {
					 boolean canarrive = cells[actX-1][actY].canArrive(toMove, dir, src, strength);
						if (canarrive) {toMove.acceptCell(cells[actX-1][actY]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
			 case UP:
				 if (actY-1<0)   { //System.out.println("Palya szele!"); 
				 break; }
				 else 
				 {
					 boolean canarrive = cells[actX][actY-1].canArrive(toMove, dir, src, strength);
						if (canarrive) { toMove.acceptCell(cells[actX][actY-1]); cells[actX][actY].containedLeft(); }
						return canarrive;
				 }
				}
		 	}
		 else  {
			 return false;
		 }		
		return false;
	}
	
	public void initMap(ItemContainer con)
	{
		//A map betolteset vegzi
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
			Switch sw = new Switch(item.getX(),item.getY(),item.getData(),item.getIndex());
			cells[sw.getX()][sw.getY()] = sw;
			switches.add(sw);
			break;
			
		case "SwitchableHole":
			SwitchableHole swh = new SwitchableHole(item.getX(),item.getY(),item.getData(),item.getIndex());
			cells[swh.getX()][swh.getY()] = swh;
			traps.add(swh);
			break;
			
		case "Wall":
			Wall wall = new Wall(item.getX(),item.getY());
			cells[wall.getX()][wall.getY()] = wall; 
			break;
			
		case "BoxDestination":
			BoxDestination boxd = new BoxDestination(item.getX(),item.getY(),item.getData(),item.getIndex());
			cells[boxd.getX()][boxd.getY()] = boxd;
			des.add(boxd);
			break;
			
		case "Worker":
			if(Controller.getInstance().numOfAlivePlayers()==0) {
				Worker worker = new Worker(item.getX(),item.getY(),item.getData());
				cells[worker.getX()][worker.getY()].accept(worker);
				Player player = new Player("1. Jatekos");
				Controller.getInstance().addPlayer(player);
				player.setWorker(worker);
			}
			else{
				Worker worker2 = new Worker(item.getX(),item.getY(),item.getData());
				cells[worker2.getX()][worker2.getY()].accept(worker2);
				Player player2 = new Player("2. Jatekos");
				Controller.getInstance().addPlayer(player2);
				player2.setWorker(worker2);
			} 
			
			break;
			
		case "Box":
			Box box = new Box(item.getX(),item.getY(),(int)item.getData(),item.getIndex());
			cells[box.getX()][box.getY()].accept(box);
			BoxCounter.getInstance().increaseBoxes();
			boxes.add(box);
			break;
			
		
		}
	  }
		BindItems();
		//System.out.println("Map created") ;
		if(window!=null) {
			window.setVisible(false);
			window.close();
		}
		window = new Window(con.GetMapSize().getX(), cells);
	}
	
	public void BindItems() {
		//Osszeparositja az osszetartozo elemeket a mapen
		for(Box box: boxes) {
			for(BoxDestination ds: des) {
				if(ds.getIndex()==box.getIndex())
					box.setDestination(ds);
			}
		}
		
		for(Switch sw: switches) {
			for(SwitchableHole t: traps) {
				if(sw.getIndex()==t.getIndex())
					sw.setSwitchableHole(t);
			}
		}
	}
	
	public void out(String s) {
		
		if(window!=null)
			window.out(s);
	}
	
	public void printMap()
	{
		window.refreshMap(cells);
		window.setVisible(true);
		/*System.out.println("");
		for (int j = 0; j < rows; j++)
		{
			System.out.print(" ");
			for (int i = 0; i< columns;i++)
			{
				cells[i][j].print();
			}
			System.out.println("");
			
		}
		System.out.println("");*/
	}
	
} 