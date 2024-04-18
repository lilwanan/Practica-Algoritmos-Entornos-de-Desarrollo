package util;

public abstract class Algoritmos {
	protected int entero;
	public Algoritmos(int entero) {
		this.entero=entero;
	}
	
	public int getEntero() {
        return entero;
    }
	
	public void setEntero(int entero) {
        this.entero = entero;
    }
	
	public static void fibonacci(int numero) {
		int primerNumero=0;
		int numActual=1;
		
		while(primerNumero<=numero) {
			int suma= primerNumero+numActual;
			primerNumero=numActual;
			numActual=suma;
		}
	}
	
	
	
}
