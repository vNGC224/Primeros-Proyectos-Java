
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Virginia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
       
        String calif = sc.next(); //ahora leemos texto
        
        while (!calif.equals("salir")) //se ejecuta mientras es verdadero, cuando sea salir para
        {
            RangoDeCalificacion (calif);
            calif = sc.next();
        }
            System.out.println("Finalizado");
        } 
    
    public static void RangoDeCalificacion(String calificacion)
    {
        
        switch(calificacion)
        {
            case "Insuficiente":
                System.out.println("0 - 49");
                break;
            case "Suficiente":
                System.out.println("50 - 59");
                break;   
            case "Bien":
                System.out.println("60 - 69");
                break;
            case "Notable":
                System.out.println("70 - 89");
                break;    
            case "Sobresaliente":
                System.out.println("90 - 100");
                break;   
            default:
                System.out.println("No se reconoce esa calificación");
                break;
                    
        }
        
    }
 
    
}
