package main;

public class Variables {

	public static void main(String[] args) {
		
		/* 4 categorías de tipos de datos 
		 * Enteros 
		 * - byte
		 * - short
		 * - int
		 * - long
		 * 
		 * Decimales
		 * - float
		 * - double
		 * 
		 * Caracteres 
		 * - char
		 * 
		 * Booleanos
		 * - boolean
		 */
		
		/*Tipos de datos primitivos
		 * byte
		 * short
		 * int
		 * long
		 * char
		 * float
		 * double
		 * boolean
		 */
		
		int version; /*Siembre debemos definir el tipo de dato 
		              * seguido del nombre de la variable
		              */
		version = 9;
		version = 10; /* La ejecución del programa es descendente, 
		               * se guarda el último valor asignado a la variable.
		               */
		
		System.out.println(version);
		
		float versionJava = 10.9f; //los valores float siempre van seguidos de una f
		                      /* unimos las palabras del nombre de la variable
		                       * colocando mayuscula siempre
		                       * a partir de la segunda palabra, la primera
		                       * debe empezar en minuscula.
		                       */
		System.out.println(versionJava);
		
		char letra = 'a'; //siempre colocamos el valor entre comillas simples
		char aNumerico = 97; //el 97 hace referencia a la letra a en minuscula
		
		System.out.println(letra);
		System.out.println(aNumerico);
		
		boolean valor1 = true;
		boolean valor2 = false;
		
		/*Declarar varias variables en una línea,
		 * solo es posible cuando los datos son del mismo tipo
		 */
		
		int variable1 = 1,variable2 = 2,variable3 = 3;
		
		System.out.println(variable1);
		System.out.println(variable2);
		System.out.println(variable3);
		
		//constantes
		//hacemos uso de la palabra reservada: final
		//el valor solo se podrá asignar una sola vez
		
		final float pi;
		pi = 3.1416f;
		
		System.out.println(pi);
	
		
	}

}
