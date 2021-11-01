
package ejercicio.pkg10;

import java.util.Scanner;


public class Ejercicio10 {

 
    public static void main(String[] args) {
        
        int lado = ObtenerValoresCuadrado();
        
        // 0 y 1 por las posiciones 
        
        int resultado = AreaCuadrado(lado);
        
        ImprimeResultado(resultado);
                
    }
    
    static int ObtenerValoresCuadrado()
    {
        int[] lados= new int[2];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("lado:");
        int lado = scanner.nextInt();
        return lado;
 
    }
    
    
       
    static int AreaCuadrado(int lado)
    {
        return lado*lado;
        
    }
    
    static double AreaCirculo (int radio)
    {
        return Math.PI*Math.pow(radio,2);
    }
    
    static double AreaEstadio (int R)
    {
        return AreaCuadrado(R) + AreaCirculo(2*R);
    }
    static void ImprimeResultado(double resultado)
    {
        System.out.println("El area es: " + resultado);
    }
    
}
        
