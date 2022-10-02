/*
 * @author Daw120

2. Escribir una aplicación que pide el año actual y el de 
   nacimiento del usuario. Debe calcular su edad, suponiendo 
   que en el año en curso el usuario ya ha cumplido años.

 */
package com.solomongo.ejercicio2_daw120;
import java.util.Scanner;
public class Ejercicio2_DAW120 { 
    public static void main(String[] args) { 
     
    Scanner teclado = new Scanner(System.in); 
    int anoActual; 
    int anoNacimiento; 
    int edad;

    System.out.print("\nAno actual: "); 
    anoActual=teclado.nextInt(); 
    System.out.print("- Estamos en: "+anoActual); 

    System.out.print("\n\nAno de Nacimiento: "); 
    anoNacimiento=teclado.nextInt(); 
    System.out.print("- Naci en: "+anoNacimiento); 
  
    edad =anoActual - anoNacimiento;
    System.out.println("\n\n   * TIENES: "+edad+" anos.\n"); 
   } 
 } 
