package projlab;

public class Game {
	
	private Timer timer = Timer.getInstance();
	private Controller controller = Controller.getInstance();

	public Game()
	{
		write();
		controller.setGame(this);
		System.out.println("Game created");
	}

	// A jatek menetet iranyitja.

	
	public void init(){
		// Inicializal, letrehozza a szukseges objektumokat.
		Map map = Map.getInstance();
		map.initMap(read());
		map.printMap();
		BoxCounter.getInstance().setGame(this);
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
	
	public void write()
	{
        ItemContainer con = new ItemContainer();
        con.addItem(new Item("MapSize",17,17,0,0));

        for (int j = 0; j < con.GetMapSize().getY();j++ )
        {
            for (int i = 0; i< con.GetMapSize().getX();i++)
            {
                con.addItem(new Item("Floor",i,j,1,0));
            }
        }

        for (int a = 0; a<17; a++ ) {
            con.Set(0, a, "Wall", 0);
        }

        for (int b = 0; b<17; b++ ) {
            con.Set(16, b, "Wall", 0);
        }
        for (int c = 0; c<17; c++ ) {
            con.Set(c, 0, "Wall", 0);
        }

        for (int d = 0; d<17; d++ ) {
            con.Set(d, 16, "Wall", 0);
        }

        con.Set(3, 3, "Wall", 0);
        con.Set(3, 4, "Wall", 0);
        con.Set(3, 5, "Wall", 0);

        con.Set(7, 5, "Wall", 0);
        con.Set(8, 5, "Wall", 0);
        con.Set(9, 5, "Wall", 0);

        con.Set(13, 3, "Wall", 0);
        con.Set(13, 4, "Wall", 0);
        con.Set(13, 5, "Wall", 0);

        con.Set(7, 10, "Wall", 0);
        con.Set(8, 10, "Wall", 0);
        con.Set(9, 10, "Wall", 0);

        con.Set(3, 11, "Wall", 0);
        con.Set(3, 12, "Wall", 0);
        con.Set(3, 13, "Wall", 0);

        con.Set(13, 11, "Wall", 0);
        con.Set(13, 12, "Wall", 0);
        con.Set(13, 13, "Wall", 0);

        con.Set(5, 7, "Hole", 0);
        con.Set(10, 7, "Hole", 0);
        con.Set(14, 9, "Hole", 0);
        con.Set(2, 10, "Hole", 0);
        con.Set(8, 13, "Hole", 0);

        con.Set(8, 4, "Switch", 1);
        con.Set(2, 7, "Switch", 2);
        con.Set(10, 9, "Switch", 3);
        con.Set(7, 12, "Switch", 4);
        con.Set(10, 14, "Switch", 5);

        con.Set(9, 11, "SwitchableHole", 1);
        con.Set(14, 7, "SwitchableHole", 2);
        con.Set(5, 14, "SwitchableHole", 3);
        con.Set(11, 5, "SwitchableHole", 4);
        con.Set(5, 9, "SwitchableHole", 5);

        con.Set(4, 15, "BoxDestination", 1);
        con.Set(6, 15, "BoxDestination", 2);
        con.Set(8, 15, "BoxDestination", 3);
        con.Set(10, 15, "BoxDestination", 4);
        con.Set(12, 15, "BoxDestination", 5);
        con.Set(10, 2, "BoxDestination", 6);
        con.Set(5, 2, "BoxDestination", 7);



        con.addItem(new Item("Worker",1,1,10,0));
        con.addItem(new Item("Worker",15,1,10,0));

        con.addItem(new Item("Box",6,3,4,1));
        con.addItem(new Item("Box",11,3,3,2));
        con.addItem(new Item("Box",2,8,4,3));
        con.addItem(new Item("Box",7,8,6,4));
        con.addItem(new Item("Box",12,8,6,5));
        con.addItem(new Item("Box",5,12,4,6));
        con.addItem(new Item("Box",11,12,5,7));



        con.writeItems();

    }
	
	public ItemContainer read()
	{
		ItemContainer con = new ItemContainer();
		con.readItems();
		return con;
	}
}
