package ejercicio.pkg5;

/**
 *
 * @author Virginia
 */
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
      
    TablasMultiplicar();
     
    }
    public static void TablasMultiplicar()
    {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduce un numero de 0 a 10");
        
        int num = sc.nextInt();
        
        System.out.println("Esta es la tabla del" + num);
        
        for(int i = 0; i <= 10; i++) 
        { 
            System.out.println(num + " * " + i + " = " + num*i); 
        }
       
    }
    
}
