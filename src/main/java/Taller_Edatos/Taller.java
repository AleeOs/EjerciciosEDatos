/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller_Edatos;

/**
 *
 * @author Alexis
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 // Declarar un arreglo para almacenar las edades de los amigos
        int[] edadesAmigos = new int[6];
        
        // Suponiendo que ya tienes las edades de tus amigos, puedes asignarlas al arreglo
        edadesAmigos[0] = 25; // Edad del primer amigo
        edadesAmigos[1] = 30; // Edad del segundo amigo
        edadesAmigos[2] = 28; // Edad del tercer amigo
        edadesAmigos[3] = 27; // Edad del cuarto amigo
        edadesAmigos[4] = 29; // Edad del quinto amigo
        edadesAmigos[5] = 26; // Edad del sexto amigo
        
        // Imprimir las edades almacenadas
        System.out.println("Edades de mis amigos más cercanos:");
        for (int i = 0; i < edadesAmigos.length; i++) {
            System.out.println("Amigo " + (i+1) + ": " + edadesAmigos[i] + " años");
        }







    }
    
}
