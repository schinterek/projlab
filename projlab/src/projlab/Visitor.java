package projlab;

public interface Visitor {
	// A Map-en l�v� objektumokat fogja egybe.
	
	public boolean accept(Movable m);
	// !!!
	// A doksiban ide t�pusnak boolean volt �rva,
	// de sok helyen m�shol void.
	
	// Minden objektumon kezeli, hogy mi t�rt�nik, ha
	// egy Movable �rkezik r�.

}
