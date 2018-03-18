package projlab;

public class Worker extends Movable {
	// A j�t�kosok �ltal ir�ny�tott munk�sokat reprezent�lja.
	// Tudnak mozogni �s l�d�kat tolni.

	private Player player;
	private boolean isPushed;
	// Azt mondja meg, hogy l�d�val toltuk-e arr�bb.
	// Csak addig igaz, m�g meg nem �rkezett arra a cell�ra,
	// amivel a l�d�ra toltuk.
	// Meg�rkez�s ut�n hamisra �ll�t�dik.
	
	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni,
		// akkor � is megpr�b�l tov�bbtol�dni.
		// Azzal t�r vissza, hogy ez siker�lt-e;

		boolean canpush=m.pushWorker();
		if (canpush==true)
		{
			setPushed(true);
			boolean canarrive = container.move(this, Direction.RIGHT, player);
			
		   setPushed(false);
				
		   return canarrive;
		}

		else
		{
			return false;
		}


		// TODO

	}
	
	public void move(Direction dir, Player src){
		// Mozgatjuk a munk�st az adott ir�nyba.
		
		this.getContainer().move(this, dir, src);
	}
	
	public boolean pushWorker(){
		// False-szal t�r vissza, mert munk�s nem
		// tud munk�st eltolni.
		return false;
	}
	
	public void wallReached(){
		// Ha a j�t�kos el�ri a falat:
		// ha az isPushed v�ltoz� igaz, meghal,
		// ha nem, akkor nem.

		if (isPushed == true)
		{
			Die();
			System.out.println("Munkás meghalt mert falnak tolták");
		}
		else
			System.out.println("Pálya széle!");

	}
	
	@Override
	public void acceptCell(Cell v) {
		// Azona  Worker-en h�vjuk meg, amelyikkel
		// el akarjuk tolni a param�terk�nt kapott
		// Visitort.
		// Visszaadja, hogy siker�lt-e az eltol�s.


		// TODO
		v.accept(this);
	}

	public void setPushed(boolean b)
	{
		if(b==false)
		{
			isPushed=false;
		}
		else isPushed=true;
	}

	public Player getPlayer()
	{
		return player;
	}

	public void Die()
	{
		System.out.println("Worker meghalt :( ");

	}
}
