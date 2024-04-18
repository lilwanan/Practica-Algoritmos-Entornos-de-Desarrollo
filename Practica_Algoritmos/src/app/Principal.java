package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array =new int[5];
		int [] resultadoFibonacci = new int [5];
		int [] resultadoFactorial = new int [5];
		boolean [] resultadoPrimos = new boolean [5];
		
		for (int i = 0;i<array.length;i++) {
			array[i]= (int)(Math.random()*10);
		}
		
		for (int i = 0;i<array.length;i++) {
			resultadoFibonacci[i]=Algoritmos.fibonacci(array[i]);
			resultadoFactorial[i]=Algoritmos.factorial(array[i]);
			resultadoPrimos[i]=Algoritmos.esPrimo(array[i]);
		}

	}

}
