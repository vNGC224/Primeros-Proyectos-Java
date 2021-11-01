
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class Ejercicio8 {

   
    public static void main(String[] args) {
      
        int[] array = new int [5];
        
        Scanner numero = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print("Introduzca número: ");
        
            array[i]= numero.nextInt();
        }
          
        System.out.println("Mostrando números en orden inverso");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Numeros " + i + " =" + array[i]);
        }
        
    }
    
}
