package main;

public class OperadoresArirmeticos {

	public static void main(String[] args) {
		//Operadores aritmeticos
		
		int variableX = 50, variableY = 10;
		int resultado;
		
		//suma
		resultado = variableX + variableY;
		System.out.println(resultado);
		
		      //++ incrementa en uno
		variableX++; 
		System.out.println(variableX);
		
		      //+= incrementa el valor asignado
		variableX += 100; 
		System.out.println(variableX);
		
		//resta
		resultado = variableX - variableY;
		System.out.println(resultado);
		
		      //-- decrece en uno
		variableX--; 
		System.out.println(variableX);
		
		      //-= decrece el valor asignado
		variableX -= 100; 
		System.out.println(variableX);
				
		//multiplicación
		resultado = variableX * variableY;
		System.out.println(resultado); 
		
		     //*= multiplica por el valor asignado
		variableX *= 3;
		System.out.println(variableX);
		
		//división
		resultado = variableX / variableY;
		System.out.println(resultado);
		
		     // /= divide entre el valor asigando
		variableX /= 3;
		System.out.println(variableX);

		
		//Casting
		//convertir un tipo de dato a otro
		
		/*Anteponer a la variable parentesis() y dentro de
		 * ellos indicar el tipo de dato que se desea
		 */
		float variableZ = 5.5f;
		
		resultado = variableX + (int)variableZ;
		System.out.println(resultado);
		System.out.println(variableZ);
		System.out.println((int)variableZ);
		
	}

}
