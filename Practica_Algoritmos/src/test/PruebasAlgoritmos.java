package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class PruebasAlgoritmos {
	
	static int entero;

	@Test
	void isPrimo() {
		boolean esperado;
		boolean obtenido;
		for(int i =0 ; i<101;i++) {
			if(Algoritmos.esPrimo(i)==true) {
				esperado=true;
				obtenido=Algoritmos.esPrimo(i);
				assertEquals(esperado,obtenido);
			} else {
				esperado=false;
				obtenido = Algoritmos.esPrimo(i);
				assertEquals(esperado,obtenido);
			}
		}
	}
	
	@Test
	void fibonacci() {
		//caso esperado 1 para entero =3
		//caso esperado 2 para entero = 5
		// caso esperado 3 para entero=6
		//caso esperado 4 para entero = 8
		int casoesperado1=2,casoesperado2=5,casoesperado3=8,casoesperado4=21;
		int obtenido1,obtenido2,obtenido3,obtenido4;
		obtenido1=Algoritmos.fibonacci(3);
		obtenido2=Algoritmos.fibonacci(5);
		obtenido3=Algoritmos.fibonacci(6);
		obtenido4=Algoritmos.fibonacci(8);
		
		assertEquals(casoesperado1,obtenido1);
		assertEquals(casoesperado2,obtenido2);
		assertEquals(casoesperado3,obtenido3);
		assertEquals(casoesperado4,obtenido4);
	}
	
	@Test
	void factorial() {
		//caso esperado 1 para entero =3
		//caso esperado 2 para entero = 5
		// caso esperado 3 para entero=6
		//caso esperado 4 para entero = 8
		int casoesperado1=6,casoesperado2=120,casoesperado3=720,casoesperado4=40320;
		int obtenido1,obtenido2,obtenido3,obtenido4;
		obtenido1=Algoritmos.factorial(3);
		obtenido2=Algoritmos.factorial(5);
		obtenido3=Algoritmos.factorial(6);
		obtenido4=Algoritmos.factorial(8);
		
		assertEquals(casoesperado1,obtenido1);
		assertEquals(casoesperado2,obtenido2);
		assertEquals(casoesperado3,obtenido3);
		assertEquals(casoesperado4,obtenido4);
	}

}
