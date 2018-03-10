package projlab;

public class Worker extends Movable implements Visitor{
	// A játékosok által irányított munkásokat reprezentálja.
	// Tudnak mozogni és ládákat tolni.
	
	private boolean isPushed;
	// Azt mondja meg, hogy ládával toltuk-e arrébb.
	// Csak addig igaz, míg meg nem érkezett arra a cellára,
	// amivel a ládára toltuk.
	// Megérkezés után hamisra állítódik.
	
	public boolean accept(Movable m){
		// Ha egy Movable el akarja tolni,
		// akkor õ is megpróbál továbbtolódni.
		// Azzal tér vissza, hogy ez sikerült-e;
		
		// TODO
		return false;
	}
	
	public void move(Direction dir, Player src){
		// Mozgatjuk a munkást az adott irányba.
	}
	
	public boolean pushWorker(){
		// False-szal tér vissza, mert munkás nem
		// tud munkást eltolni.
		return false;
	}
	
	public void wallReached(){
		// Ha a játékos eléri a falat:
		// ha az isPushed változó igaz, meghal,
		// ha nem, akkor nem.
	}
	
	@Override
	public boolean acceptVisitor(Visitor v) {
		// Azona  Worker-en hívjuk meg, amelyikkel
		// el akarjuk tolni a paraméterként kapott
		// Visitort.
		// Visszaadja, hogy sikerült-e az eltolás.
		
		// TODO
		return false;
	}
}
