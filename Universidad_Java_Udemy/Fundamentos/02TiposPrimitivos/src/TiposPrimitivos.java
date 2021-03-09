
import java.util.Scanner;


public class TiposPrimitivos {
    
    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        //Byte
        byte numeroByte = 10;
        System.out.println("valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo byte: " + Byte.MAX_VALUE);
        
        numeroByte = (byte)129;//conversión de tipos (utilizamos el parantesis)
        System.out.println("Valor byte: " + numeroByte); 
        /*
        A PESAR DE REALIZAR LA CONVERSIÓN NO SE IMPRIME EL VALOR DE BYTE DESEADO
        Esto es porque el valor asigando excede el rango del tipo BYTE.
        */
        
        //Short
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("valor mínimo short = " + Short.MIN_VALUE);
        System.out.println("valor máximo short = " + Short.MAX_VALUE);
        
        //Int
        int numeroInt = 11;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("valor mínimo int = " + Integer.MIN_VALUE);
        System.out.println("valor máximo int = " + Integer.MAX_VALUE);
        
        numeroInt = (int)2147483648L;
        /*Para convertir un numero int a long utilizamos la L al final, 
        luego añadimos (int)para forzar el tipo*/
        System.out.println("numeroInt = " + numeroInt);
        
        //Long
        long numeroLong = 9223372036854775807L; //Se utiliza L porque por Default la literal está en int
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("valor mínimo long = " + Long.MIN_VALUE);
        System.out.println("valor máximo long = " + Long.MAX_VALUE);
       /*
            tipos primitivos flotantes: float y double
        */
       float numeroFloat = 10.0F;/*Las literales flotantes por default son tipo double, 
       por lo que hay que hacer una conversión para poder asignarla a una variable float
       */
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("valor mínimo float = " + Float.MIN_VALUE);
        System.out.println("valor máximo float = " + Float.MAX_VALUE);      
        
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("valor mínimo Double = " + Double.MIN_VALUE);
        System.out.println("valor máximo Double = " + Double.MAX_VALUE);
        
        /*
        Inferencia de Tipos con Var y Tipos Primitivos
        */
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDoble = 10.0;
        System.out.println("numeroDoble = " + numeroDoble);
        
        var numeroFlotante = 10.0F; //solo se puede indicar el tipo con una letra en Long(L), Float(D) Y Double(D)
        System.out.println("numeroFlotante = " + numeroFlotante);
        
        /*
        Primitivos tipo char
        */
        char miCaracter = 'a';//solo un caracter, se rige por la lista de caracteres unicode
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021'; //con barru podemos utilizar los valores unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;//con el codigo decimal del caracter unicode
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';//utilizando directamente el simbolo unicode
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //con var
        var varChar1 = '\u0021'; //con barru podemos utilizar los valores unicode
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal1 = 33;//NO podempos asignar un valor decimal de caracter a un tipo var
        System.out.println("varCharDecimal1 = " + varCharDecimal1);
        
        var varCharSimbolo1 = '!';//utilizando directamente el simbolo unicode
        System.out.println("varCharSimbolo1 = " + varCharSimbolo1);
        
        int variableEnteraSimbolo = '!';//Cuando asignamos un char a tipo entero se convierte en codigo decimal
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);//se imprime el valor decimal 97 correspondiente a la letra a
        
        /*
        Primitivos tipo boolean
        */
        
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 30;
        var esAdulto = edad >= 18;
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        /*
        Conversión de tipos primitivos
        */
        //Convertir tipo string a tipo int
        var edad1 = Integer.parseInt("20"); //metodo parseint recibe el valor de una cadena y lo convierte a int
        System.out.println("edad = " + (edad1 + 1));
        
        //convertir tipo string a tipo double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
//        //pedir un valor
        Scanner consola = new Scanner(System.in);//creamos una variable consola y le asignamos un objeto escaner
        System.out.println("Proporciona tu edad:");//Escribimos en pantalla las indicaciones para el usuario
        edad = Integer.parseInt( consola.nextLine() );//asignamos el valor escrito en consola a la variable
        System.out.println("edad = " + edad);
        
        //convertir integer a string
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //convertir string a char
        var caracter = "hola".charAt(0);//usamos el metodo charat para seleccionar un indice de los caracteres la cadena
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);//el metodo nextline recupera strings, con charat escogemos un caracter de ese string
        System.out.println("caracter = " + caracter);
        
        
        
        
        
        
        
        
    }
}
