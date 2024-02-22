
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexis
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[6];
        
        // Leer los números ingresados por el usuario
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Encontrar el número mayor y el número menor
        int numeroMayor = numeros[0];
        int numeroMenor = numeros[0];
        
        for (int i = 1; i < 6; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }
        
        // Mostrar el número mayor y el número menor
        System.out.println("El número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);
        
        
        
        
        
      
    }
    
}
