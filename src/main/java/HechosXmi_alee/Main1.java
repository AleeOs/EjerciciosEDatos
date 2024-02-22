/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HechosXmi_alee;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese palabra");
        String palabra = scan.nextLine();
        
        int sumaletras = 0;
        System.out.println("letra por letra");
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            System.out.println(letra);
             sumaletras += 1;
            
        }
        
         System.out.println("La suma de caracteres es: " + sumaletras);
        
    }
    
}
