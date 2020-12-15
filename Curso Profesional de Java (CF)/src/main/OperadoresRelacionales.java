package main;

public class OperadoresRelacionales {

	public static void main(String[] args) {
		// Operadores relacionales
		//6 operadores relacionales, siempre dan
		// como resultado un valor booleano
		
		int variable1 = 200, variable2 = 200;
		boolean resultado;
		
		resultado = variable1 > variable2;
		System.out.println(resultado);
		
		resultado = variable1 < variable2;
		System.out.println(resultado);
		
		resultado = variable1 >= variable2;
		System.out.println(resultado);
		
		resultado = variable1 <= variable2;
		System.out.println(resultado);
		
		resultado = variable1 == variable2;
		System.out.println(resultado);
		
		resultado = variable1 != variable2; //!diferente
		System.out.println(resultado);
	

	}

}
