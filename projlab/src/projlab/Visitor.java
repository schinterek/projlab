package projlab;

public interface Visitor {
	// A Map-en lévõ objektumokat fogja egybe.
	
	public boolean accept(Movable m);
	// !!!
	// A doksiban ide típusnak boolean volt írva,
	// de sok helyen máshol void.
	
	// Minden objektumon kezeli, hogy mi történik, ha
	// egy Movable érkezik rá.

}
