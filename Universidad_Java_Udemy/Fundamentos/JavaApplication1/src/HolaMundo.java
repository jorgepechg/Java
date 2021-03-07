
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {

        //int<--(Tipo de dato) miVariableEntera<--(Nombre Variable) =<--(Asignación) 10<--(Literal o valor de la variable)
        int miVariableEntera = 10; //Notación de nombre de variable en camello o de altas y bajas
        System.out.println(miVariableEntera);

        //Modificamos el valor de la variable
        miVariableEntera = 5; //una vez creada no es necesario colocar el tipo de dato antes del nombre de variable
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Perlita te amo";
        System.out.println(miVariableCadena);

        //var - Inferencia de tipos en Java a partir del valor asignado a nuestra literal(No funciona en JDK inferiores al 10)
        var miVariableEntera2 = 12;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Maldito Pedro";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //Concatenación de cadenas

        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _MiVariable = 3;
        var $MiVariable = 2;

        //Concatenación
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 7;
        
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + usuario);//si primero encuentra números primero los suma y luego concatena
        System.out.println(usuario + i + j);//si primero encuentra una cadena todo lo demás se vuelve cadena (contexto cadena)
        System.out.println(usuario + (i + j));// contexto parentesis, primero se realiza la suma dentro parentesis
        
        //Caracteres especiales
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);//caracter de salto de linea
        System.out.println("Tabulador: \t" + nombre);//caracter de tabulación
        System.out.println("Retroceso: \b" + nombre);//caracter de retroceso de pocisiones
        System.out.println("Comilla simple: \'" + nombre + "\'");//caracter de comilla simple
        System.out.println("Comilla doble: \"" + nombre + "\"");//caracter de comilla doble
        
        //Clase Scanner
        System.out.println("Escribe tu nombre:"); //Se escriben las instruciones para el usuario
        Scanner consola = new Scanner(System.in); //creación de variable consola, se crea un nuevo objeto Scanner
        usuario = consola.nextLine();//se llama a variable consola junto al método nextLine para asignar un valor a variable usuario
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el título:");
        titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        String tituloL = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(tituloL + " fue escrito por " + autor);
    }
}
