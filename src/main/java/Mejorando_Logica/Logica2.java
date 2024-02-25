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
public class Logica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        
        
        System.out.println("Ingrese una palabra");
        String Palabra = lec.nextLine();
        
        System.out.println("Letra por letra");
       for (int i = 0; i < Palabra.length(); i++){
           char Letra = Palabra.charAt(i);
           System.out.println(Letra);
           
           
       }
        
        
        
        
        
        
       
    }
    
}
