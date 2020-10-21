package main;

public class MetodosPrintyPrintln {

	public static void main(String[] args) {
		/*
		 * Para que nosotros podamos mostrar un mensaje 
		 * en consola debemos hacer uso de los m�todos 
		 * print, println o printf.
		 */
		
		//Con el m�todo println el mensaje se imprimir� en consola con un salto de l�nea.
		
		//Por otro lado, el m�todo print imprimir� el mensaje en la misma l�nea.
		
		
		//Secuencias de escapes
		/*
		 * Java nos provee de una secuencia de escapes que nos permiten 
		 * dar formato a las cadenas de texto con las que nos 
		 * encontramos trabajando.
		 */
		
		/*\n salto de l�nea
		 *\t tabulador
		 *\\ diagonal inversa
		 *\" comillas dobles
		 *\' comillas simples
		 */
		
		System.out.print("Hola,\nagregamos un salto");
		System.out.print("\tagregamos un tab");
		System.out.println("");

		System.out.println("Mensaje con \\ diagonal inversa");
		System.out.println("Mensaje con \" comillas dobles");
		System.out.println("Mensaje con \' comillas simples");

	}

}
