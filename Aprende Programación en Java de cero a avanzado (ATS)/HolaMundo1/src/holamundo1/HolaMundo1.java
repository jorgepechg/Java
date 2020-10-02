/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class HolaMundo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        System.out.println("Te amo abuelita");//Te quiero tanto
        System.out.println("Quiero que estes bien"); 
        /*
        Gracias por tanto
        */
        
        //Datos Primitivos
        
        short entero1 = 2;
        
        byte entero2 = 3;
        
        int entero3= 7;
        
        float decimal = 3.45f;
        
        double decimal2 = 3.675;
        
        char caracter = 't';
        
        boolean decision = true;
        
        //Datos no Primitivos
        
        Integer numero0 = null; //los datos no primitivos me permiten almacenar el valor null
        
        //En los datos no primitivos puedes utilizar metodos 
        
        String palabra = "holi beibi"; //en cadenas utilizamos comillas dobles
        
        //Constantes
        
        final int numeroc = 10; //agregamos final 
        
                
        System.out.println("Numero entero: "+numeroc);
        
        Scanner entrada = new Scanner(System.in);
        float cosi;
        
        System.out.println("Digite un numero: ");
        cosi = entrada.nextFloat();
        
        System.out.println("El numero es: "+cosi);
        
        Scanner entrada1 = new Scanner(System.in);
        String coli;
        
        System.out.println("Digite una palabra: ");
        coli = entrada.next();//next guarda una cadena hasta que encuentre un espacio
        
        System.out.println("Su palabra es: "+coli);
        
        Scanner entrada2 = new Scanner(System.in);
        char coliu;
        
        System.out.println("Ingrese su letra: ");
        coliu = entrada2.next().charAt(0);
        
        System.out.println("Su letra es: "+coliu);
        
        Scanner entrada3 = new Scanner(System.in);
        String colo;
        
        System.out.println("Digite su frase");
        colo = entrada3.nextLine();
        
        System.out.println("Su frase es:"+colo);
        
        String lumia;
        int lumia0;
        char lumia1;
        double lumia2;
        float lumia3;
        
        lumia = JOptionPane.showInputDialog("Digite su slogan: ");
        lumia0 = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero 1: "));
        lumia1 = JOptionPane.showInputDialog("Digite su letra: ").charAt(0);
        lumia2 = Double.parseDouble(JOptionPane.showInputDialog("Digite su numero 2: "));
        lumia3 = Float.parseFloat(JOptionPane.showInputDialog("Digite su numero 3: "));
        
        JOptionPane.showMessageDialog(null, "Su Slogan es: "+lumia);
        JOptionPane.showMessageDialog(null, "Su numero 1 es: "+lumia0);
        JOptionPane.showMessageDialog(null, "Su letra es: "+lumia1);
        JOptionPane.showMessageDialog(null, "Su numero 2 es: "+lumia2);
        JOptionPane.showMessageDialog(null, "Su numero 3 es: "+lumia3);
        
 
    }
    
}
