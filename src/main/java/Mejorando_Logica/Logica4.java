/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mejorando_Logica;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Logica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner lec = new Scanner(System.in);
         
         int RangoNumeros = 0;
         
         int sumaPares = 0;
         int sumaImpares =0;
         
       int contadorPares = 0;
       int contadorImpares = 0;
         
         System.out.println("Digite el rango de numeros");
         RangoNumeros = lec.nextInt();
         
         int Numeros [] = new int [RangoNumeros];
         
         for (int i = 0; i < RangoNumeros; i++) {
             System.out.println("Digite numero" + (i + 1)+ " : ");
             Numeros [i] = lec.nextInt();
             
             if (Numeros [i] % 2 == 0) {
                 sumaPares += Numeros [i];
                  contadorPares++;
             }
             
             else if (Numeros [i] % 2 != 0) {
                 sumaImpares += Numeros [i];
                 contadorImpares++;
                 
             }
         }
        
       int promedioPares = sumaPares / contadorPares;
       int promedioImpares = sumaImpares / contadorImpares;
       
        System.out.println("El promedio de numeros pares es " + promedioPares);
        System.out.println("El promedio de numeros impares es " + promedioImpares);
        
        System.out.println("La suma de pares es " + sumaPares);
        System.out.println("La suma de impares es " + sumaImpares);
        
        
        
    }
    
}
