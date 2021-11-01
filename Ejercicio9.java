
package ejercicio.pkg9;

/**
 *
 * @author Virginia
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        
        String cadena = "La lluvia en Sevilla es una maravilla";
        
        int resultado = NumeroVocales (cadena);
        
        System.out.println("El número de vocales es: " + resultado);
        
    }
    
    public static int NumeroVocales (String texto)
    {
        int total_vocales = 0;
        //EQUIVALENTE String vocales = "aeiou";
        
        for(int i = 0; i < texto.length(); i++)
        {
            char caracter = texto.charAt(i);
            
            //EQUIVALENTE if(vocales.indexOf(caracter) >= 0)
            
            if(caracter == 'a' ||
               caracter == 'e' ||
               caracter == 'i' ||
               caracter == 'o' ||
               caracter == 'u')
            {
                total_vocales++;
            }
        }
        
        return total_vocales;
    }
}
