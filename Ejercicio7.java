
package ejercicio.pkg7;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner cuadrado = new Scanner(System.in);
        
        System.out.print("Introduzca tamaño del cuadrado: ");
        int n = cuadrado.nextInt();
        
        if(n >=0 && n <=100) {
            //parte superior del cuadrado
            for(int i = 0; i < n; i++){
                System.out.print("*");
            }
            System.out.println();
            
            //alto del cuadrado (usamos n - 2)
            
            for(int i = 0; i < n-2; i++){
                System.out.print("*");
            for(int m = 0; m < n-2; m++){
                System.out.print(" ");    
                }
            System.out.println("*");
            }
            
            //parte inferior del cuadrado
            for(int i = 0; i < n; i++){
                System.out.print("*");
        }
    }
    
}
    
}
