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
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        // Definir el vector de alturas
        float[] alturas = new float[3];
        
        //DEclaracion de variables
        float sumaAlturas = 0;

        // Leer las alturas de las personas
        for (int i = 0; i < 3; i++) {
            
            System.out.print("Ingrese la altura de la persona " + (i + 0) + " (en metros): ");
            alturas[i] = scanner.nextFloat();
            sumaAlturas += alturas[i];
        }

        // Calcular el promedio de las alturas
        float promedioAlturas = sumaAlturas / 3;

        
        // Contar cuántas personas son más altas o más bajas que el promedio
        int personasMasAltas = 0;
        int personasMasBajas = 0;
        for (int i = 0 ; i < 3; i++) {
            if (alturas[i] > promedioAlturas) {
                personasMasAltas++;
            } 
            else if
                   (alturas[i] < promedioAlturas) {
                personasMasBajas++;
            }
        }

        // Mostrar resultados
        System.out.println("El promedio de las alturas es: " + promedioAlturas + " metros");
        System.out.println("Cantidad de personas más altas que el promedio: " + personasMasAltas);
        System.out.println("Cantidad de personas más bajas que el promedio: " + personasMasBajas);

       
    }
}
        
        
        
        
        
        
        
    
