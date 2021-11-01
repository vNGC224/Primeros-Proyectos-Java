
package ejercicio.pkg4;

/**
 *
 * @author Virginia
 */
public class Ejercicio4 {

    public static void main(String[] args) {
      
    NumerosDivisibles();   
    }
    
    public static void NumerosDivisibles()
    {
        for(int a = 1; a <= 100; a++)
        {
            if (a % 2 == 0 && a % 3 == 0)
            System.out.println(a + " es divisible");
        }
        
        System.out.println("Finalizado");
    }
}
