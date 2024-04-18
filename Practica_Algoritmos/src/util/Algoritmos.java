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
	
	public static int fibonacci(int numero) {
		if(numero==0) {
			return 0;
			
		} else if(numero==1) {
			return 1;
		} else {
			return fibonacci(numero-1) + fibonacci(numero-2);
		}
		
		
	}
	
	public static int factorial(int numero) {
		if (numero==0||numero==1) {
			return 1;
		} else {
			int factorial = 1;
			for(int i = 2 ; i <= numero ; i++) {
				factorial=factorial*i;
			}
			return factorial;
		}
	}
	
	public static boolean esPrimo(int numero) {
		for (int i = 2; i<numero;i++) {
			if(numero%i==0) {
				return false;
			} 
		}
		return true;
	}
	
}
