package app;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array =new int[5];
		
		for (int i = 0;i<array.length;i++) {
			array[i]= (int)(Math.random()*10);
		}
		
		for (int i = 0;i<array.length;i++) {
			Algoritmos.fibonacci(i);
			Algoritmos.factorial(i);
			Algoritmos.esPrimo(i);
		}

	}

}
