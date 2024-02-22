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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lec = new Scanner(System.in);
        final int totalnum = 3;
        int numeros [] = new int [totalnum];
        
        for ( int i = 0; i < totalnum; i++) {
            System.out.println("Ingrese los numros");
            numeros [i] = lec.nextInt();
            
        }
        
        System.out.println("\n Impresion de numeros");
        System.out.println(" # " + " Numeros ");
        for (int i = 0; i < totalnum; i++){
            System.out.println(i + 1 +" "+ numeros[i]+" ");
            
        }
        
      int numeroMayor = numeros[0];
      int numeroMenor = numeros[0];
      
      for (int i = 0; i < totalnum; i++) {
          
          if (numeros [i] > numeroMayor) {
              numeroMayor = numeros [i];
              
          }
          
          if (numeros[i] < numeroMenor) {
              numeroMenor = numeros [i];
              
              
          }
          
      }
        
        
        
        System.out.println("Los numeros mayores son"+numeroMayor);
        System.out.println("los numeros menores son"+numeroMenor);
        
        
        
    }
    
}
