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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int NumRango =0;
        int numeros =0;
        
        int sumaNumeros = 0;
        
        System.out.println("Ingrese cuantos numeros quiere sumar");
        NumRango = lec.nextInt();
        
        for(int i = 0; i < NumRango; i++) {
        
        System.out.println("Ingrese numero " + (i + 1)+ " : ");
        numeros = lec.nextInt();
        
        sumaNumeros += numeros;
        
        
        }
        
        System.out.println("La suma de los numeros es: " + sumaNumeros);
        
    }
    
    
    
}
