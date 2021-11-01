
package ejercicio.pkg3;

/**
 *
 * @author Virginia
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {

    public static void main(String[] args) 
    {
    CalculoCuadradoPi(); 
    }
    
    public static void CalculoCuadradoPi(){
        
        
        String texto = JOptionPane.showInputDialog("Introduce el radio para calcular");
        double radio = Double.parseDouble(texto);
          
        {
           
             double area=Math.PI*Math.pow(radio, 2);
 
             System.out.println("Obtenemos que el área del círculo es " + area);
        }
        
    }
    
}
