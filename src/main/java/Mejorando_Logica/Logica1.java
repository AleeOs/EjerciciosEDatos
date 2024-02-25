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
public class Logica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner lec = new Scanner(System.in);
         
         
         int rangoNumeros =0;
         int numeros=0;
        
         int sumaPares =0;
        int sumaImpares=0;
        
        
        System.out.println("Digite el rango de numeros");
        rangoNumeros = lec.nextInt();
        
        
        for (int i = 0; i < rangoNumeros; i++) {
            System.out.println("Ingrese numero " + (i + 1) + " : ");
            numeros = lec.nextInt();
            
            if (numeros % 2 == 0 ) {
                sumaPares += numeros;
                
            }
            else if (numeros % 2 != 0) {
                sumaImpares += numeros;
                
            }
            
        }
        
        System.out.println("la suma de numeros pares es:" +sumaPares);
                System.out.println("la suma de numeros impares es:" +sumaImpares);

        
        
        
        
        
        
    }
    
}
