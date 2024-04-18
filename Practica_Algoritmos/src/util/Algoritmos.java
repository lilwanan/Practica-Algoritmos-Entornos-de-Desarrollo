package util;

public abstract class Algoritmos {
	protected int entero;
	
	/**
	 * creo el constructor getter y setter para los algoritmos
	 * @param entero
	 */
	public Algoritmos(int entero) {
		this.entero=entero;
	}
	
	public int getEntero() {
        return entero;
    }
	
	public void setEntero(int entero) {
        this.entero = entero;
    }
	/**
	 * En este metodo calculamos la serie de fibonacci mediante la cual introducimos un numero
	 * y nos calcula recursivamente el numero de fibonacci llamando a las dos recursiones 
	 * anteriores a este numero
	 * @param numero
	 * @return la iteracion anterior de la recursion mas la anterior a esta misma tambien
	 */
	public static int fibonacci(int numero) {
		if(numero==0) {
			return 0;
			
		} else if(numero==1) {
			return 1;
		} else {
			return fibonacci(numero-1) + fibonacci(numero-2);
		}
		
		
	}
	
	/**
	 * Dado un numero realiza una multiplicacion de los n numeros anteriores al introducido 
	 * incluyendo este
	 * @param numero
	 * @return devuelve el numero de la multiplicacion de los numeros mencionados anteriormente
	 */
	
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
	
	/**
	 * Esta funcion comprueba los numero que son primos y los que no
	 * @param numero
	 * @return devuelve false si no es primo y true si loes
	 */
	
	public static boolean esPrimo(int numero) {
		for (int i = 2; i<numero;i++) {
			if(numero%i==0) {
				return false;
			} 
		}
		return true;
	}
	
}
