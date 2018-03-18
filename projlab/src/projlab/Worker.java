package projlab;

public class Worker extends Movable implements Visitor{
	// A j�t�kosok �ltal ir�ny�tott munk�sokat reprezent�lja.
	// Tudnak mozogni �s l�d�kat tolni.
	
	private boolean isPushed;
	// Azt mondja meg, hogy l�d�val toltuk-e arr�bb.
	// Csak addig igaz, m�g meg nem �rkezett arra a cell�ra,
	// amivel a l�d�ra toltuk.
	// Meg�rkez�s ut�n hamisra �ll�t�dik.
	
	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni,
		// akkor � is megpr�b�l tov�bbtol�dni.
		// Azzal t�r vissza, hogy ez siker�lt-e;

		m.pushWorker();
		// TODO
		return false;
	}
	
	public void move(Direction dir, Player src){
		// Mozgatjuk a munk�st az adott ir�nyba.
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
	}
	
	@Override
	public boolean acceptVisitor(Visitor v) {
		// Azona  Worker-en h�vjuk meg, amelyikkel
		// el akarjuk tolni a param�terk�nt kapott
		// Visitort.
		// Visszaadja, hogy siker�lt-e az eltol�s.

		Die();
		// TODO
		return false;
	}

	public void Die()
	{

	}
}
