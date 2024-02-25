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
public class Logica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lec = new Scanner(System.in);
       
        int RangoAturas = 0;
    
        double sumaAlturas = 0;
        
        
        System.out.println("Ingrese el rango de alturas");
        RangoAturas = lec.nextInt();
        
         double [] Alturas = new double[RangoAturas];
         
         
         int Altos =0;
        int Bajos =0;
        
        for(int i = 0; i < RangoAturas; i++) {
            System.out.println("Ingrese altura" + (i + 1) + " : ");
            Alturas [i] = lec.nextDouble();
             sumaAlturas += Alturas [i];
             
        }
        double promedio = sumaAlturas / RangoAturas;
        
         for (int i = 0; i < RangoAturas; i++) {
             if (Alturas [i] > promedio) {
                 Altos++;
             }
            
             else if (Alturas [i] < promedio) {
                 Bajos++;
             }
             }
         
         
         System.out.println("El promedio de alturas es " + promedio);
             System.out.println("Los mas altos son " + Altos);
             System.out.println("Los mas bajos son: " + Bajos);
    }
    
}
