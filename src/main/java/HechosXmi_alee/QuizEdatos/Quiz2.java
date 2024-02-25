/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HechosXmi_alee.QuizEdatos;

import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lec = new Scanner(System.in);
        
        int numeros [] = new int [6];
        
        
        int sumaNumerosPares =0;
        int sumanumerosImpares=0;
        
        int  contadosPares=0;
        int contadorImpares=0;
        
        for (int i = 0; i < 6; i++){
            
        System.out.println("Digite el numero"+(i + 1)+":");
        numeros [i] = lec.nextInt();
        
        if (numeros [i] % 2 == 0) {
            sumaNumerosPares += numeros [i];
            contadosPares++;
              
        }
        
        else if ( numeros [i] % 2 != 0) {
             sumanumerosImpares += numeros[i];
             contadorImpares++;
            
        }
        
        }
        
        int promedioPares = sumaNumerosPares / contadosPares;
        int promedioImpares = sumanumerosImpares / contadorImpares;
        
        
        
        System.out.println("El promdedio de numeros pares es: " +promedioPares);
        System.out.println("El promedio de numeros Impares es: " +promedioImpares);
        
        System.out.println("La suma de numeros pares es: " +sumaNumerosPares);
        System.out.println("La suma de numeros impares es: " +sumanumerosImpares);
        
        
        
        
        
        
        
    }
    
}
