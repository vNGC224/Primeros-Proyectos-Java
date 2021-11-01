
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class Ejercicio1 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
       
        int calificacion = sc.nextInt();
        
        while (calificacion != -1)
        {
            if (calificacion  < 50)
            {
                System.out.println("Insuficiente");
            }
            else if (calificacion >= 50 && calificacion < 60)
            {
                System.out.println("Suficiente");
            }
            else if (calificacion >= 60 && calificacion < 70)
            {
                System.out.println("Bien");
            }
            else if (calificacion >= 70 && calificacion < 90)
            {
                System.out.println("Notable");
            }
            else if (calificacion >= 90 && calificacion <= 100)
            {
                System.out.println("Sobresaliente");
            }
            else 
            {
                System.out.println("Introduzca un valor entre 0 y 100");
            }
          
            calificacion = sc.nextInt();
        }
    }
    
}
