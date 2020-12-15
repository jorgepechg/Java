package main;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// Operadores lógicos
		//and(y), or(o), y not(no)
		
		boolean resultado;
		
		// and (&&) Será verdadero solo si todas las comparaciones son verdaderas
		resultado = 5 >= 5 && true && 10 > 9;
		System.out.println(resultado);
		
		// or (||) Por lo menos unas de las operaciones debe ser verdadera
		//para que el resultado final sea verdadero.
		resultado = false || false || false || true;
		System.out.println(resultado);
		
		//se pueden utilizar varios operadores a la vez.
		resultado = (5 >= (2 * 3) || true) && (true && 10 > 5);
		System.out.println(resultado);
		
		//negación (!)
		System.out.println(!true);
		
		
		//Operador ternario
		//IFTTT
		//?
		//expresion1 ? expresion2 : expresion3
		//la exprresion1 debe retornar valores booleanos
		//Sí expresión1 = true, entonces expresion2
		//Sí expresion1 = false, entonces expresion3
		//expresion 2 y 3 deben ser del mismo tipo de la variable
		
		String mensaje = 10 > 9 ? "Es mayor" : "Es menor";
		
		int enteros = true ? 1 : 0;
		
		System.out.println(mensaje);
		System.out.println(enteros);

	}

}
