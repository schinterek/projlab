package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();

	public Game()
	{
		write("map1.txt");
		controller.setGame(this);
		BoxCounter.getInstance().setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(read("map1.txt"));
		map.printMap();
		start();
		// TODO
	}
	
	public void start(){
		// A jatek inditasahoz szukseges lepeseket vegzi el.
		timer.run();
		// TODO
	}
	
	public void gameEnded(){
		// A jatek veget kezeli.
		System.out.println("Vege a jateknak");
		controller.ended();
		controller.showEndScores();
		// TODO
	}
	
	public void write(String file)
	{
     /*   ItemContainer con = new ItemContainer();
        con.addItem(new Item("MapSize",15,15,0,0));
        for (int j = 0; j < con.GetMapSize().getY();j++ )
        {
            for (int i = 0; i< con.GetMapSize().getX();i++)
            {
                con.addItem(new Item("Floor",i,j,1,0));
            }
        }
        for (int a = 0; a<15; a++ ) {
            con.Set(0, a, "Wall", 0);
        }
        for (int b = 0; b<15; b++ ) {
            con.Set(14, b, "Wall", 0);
        }
        for (int c = 0; c<15; c++ ) {
            con.Set(c, 0, "Wall", 0);
        }
        for (int d = 0; d<15; d++ ) {
            con.Set(d, 14, "Wall", 0);
        }
        con.Set(7, 3, "BoxDestination", 2);
        con.Set(6, 5, "BoxDestination", 1);
        con.Set(3, 6, "BoxDestination", 3);
        con.Set(3, 7, "Wall", 0);
        con.Set(4, 7, "Wall", 0);
        con.Set(5, 7, "Wall", 0);
        con.Set(3, 3, "Hole", 0);
        con.Set(4, 4, "Switch", 1);
        con.Set(5, 2, "SwitchableHole", 1);
        con.Set(6, 1, "Wall", 0);
        con.Set(7, 2, "Wall", 0);
        con.Set(11, 4, "Wall", 0);
        con.Set(4, 5, "Wall", 0);
        con.Set(11, 5, "Wall", 0);
        con.Set(3, 6, "Wall", 0);
        con.Set(2, 7, "Wall", 0);
        con.Set(10, 8, "Wall", 0);
        con.Set(2, 12, "Wall", 0);
        con.Set(5, 12, "Wall", 0);
        con.Set(6, 13, "Wall", 0);
        con.Set(11, 12, "Wall", 0);
        con.Set(11, 13, "Wall", 0);
        con.Set(6, 4, "Hole", 0);
        con.Set(10, 10, "Hole", 0);
        con.Set(2, 9, "Hole", 0);
        con.Set(8, 13, "Hole", 0);
        con.Set(9, 6, "Hole", 0);
        con.Set(13, 6, "Hole", 0);
        con.Set(4, 14, "Hole", 0);
        con.Set(4, 8, "Switch", 1);
        con.Set(8, 4, "Switch", 2);
        con.Set(3, 3, "SwitchableHole", 1);
        con.Set(12, 8, "SwitchableHole", 2);
        con.Set(15, 6, "BoxDestination", 1);
        con.Set(5, 15, "BoxDestination", 2);
        con.Set(13, 13, "BoxDestination", 3);
        con.Set(4, 2, "BoxDestination", 4);
        con.Set(9, 14, "BoxDestination", 5);
        con.Set(11, 2, "BoxDestination", 6);
        con.Set(13, 4, "BoxDestination", 7);
        con.Set(8, 7, "BoxDestination", 8);
<<<<<<< HEAD
       
        con.addItem(new Item("Worker",1,1,10,0));
        con.addItem(new Item("Worker2",8,8,10,0));
=======
        con.addItem(new Item("Worker",1,1,7,0));
        con.addItem(new Item("Worker",9,9,7,0));
        con.addItem(new Item("Box",3,10,4,1));
        con.addItem(new Item("Box",9,4,3,2));
        con.addItem(new Item("Box",2,4,4,3));
        con.addItem(new Item("Box",11,7,6,4));
        con.addItem(new Item("Box",6,6,6,5));
        con.addItem(new Item("Box",13,10,4,6));
        con.addItem(new Item("Box",8,11,5,7));
        con.addItem(new Item("Box",2,14,5,8));
        
>>>>>>> branch 'master' of https://github.com/schinterek/projlab
        con.addItem(new Item("Box",7,2,6,1));
        con.addItem(new Item("Box",3,2,2,2));
        con.addItem(new Item("Box",2,5,4,3));*/
		ItemContainer con = read(file);
		con.setWorker(1, 1, 6);
		con.writeItems(file);
		con.listItems();

    }
	
	public ItemContainer read(String file)
	{
		ItemContainer con = new ItemContainer();
		con.readItems(file);
		return con;
	}
}