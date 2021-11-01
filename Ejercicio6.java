package ejercicio.pkg6;

import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) 
    {
      
    NumerosParesEImpares();
     
    }
    
    public static void NumerosParesEImpares()
    {
    
          
    
    Scanner entrada = new Scanner(System.in);
       
    int numero;
    int pares = 0; 
    int impares = 0;
    
    System.out.println("Introduzca números pares o impares, el programa finaliza al introducir el número 0");
    numero = entrada.nextInt();
    
    while (numero != 0){
          
     
      if (numero%2 == 0)
      
          pares = pares +1;

      else 
          
          impares = impares +1;

    
     System.out.println("Ingresar número: ");
     numero = entrada.nextInt();
    }
    
     System.out.println("Cantidad de números pares " + pares);
  }
}