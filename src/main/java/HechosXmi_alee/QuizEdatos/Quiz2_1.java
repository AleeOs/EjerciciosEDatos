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
public class Quiz2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
//Declaracion de Variables que toma dato por el teclado
        
        int numeros [] = new int [6];


        // Declarar variables
       
        
        int sumaPares = 0;
        int sumaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        // Leer 20 números enteros
        for (int i = 0; i < 6 ; i++) {
            System.out.print("Ingrese el número " + (i + 1) + " : ");
            numeros[i] = scanner.nextInt();
            
            if (numeros [i] % 2 == 0 ) {
                sumaPares += numeros[i];
                contadorPares++;
            } 
            else if (numeros [i] % 2 != 0)
            {
                sumaImpares += numeros[i];
                contadorImpares++;
            }
        }

        // Calcular promedio de números pares e impares
        int promedioPares =  sumaPares / contadorPares;
        int promedioImpares =  sumaImpares / contadorImpares ;

        // Mostrar resultados
        System.out.println("Promedio de números pares: " + promedioPares);
        System.out.println("Promedio de números impares: " + promedioImpares);
        System.out.println("Suma de elementos en posiciones pares: " + sumaPares);
        System.out.println("Suma de elementos en posiciones impares: " + sumaImpares);
        
        
        
    }
    
}
