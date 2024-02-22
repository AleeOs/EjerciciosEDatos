
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alexis
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
        // Precios de los productos
        int precioPlancha = 500000;
        int precioLicuadora = 700000;
        int precioLavadora = 1200000;
        int precioTelevisor = 1500000;
        
        // Solicitar la cantidad de cada producto
        System.out.print("Ingrese la cantidad de planchas: ");
        int cantidadPlancha = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de licuadoras: ");
        int cantidadLicuadora = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de lavadoras: ");
        int cantidadLavadora = scanner.nextInt();
        
        System.out.print("Ingrese la cantidad de televisores: ");
        int cantidadTelevisor = scanner.nextInt();
        
        // Calcular el precio total sin descuento
        int totalSinDescuento = cantidadPlancha * precioPlancha +
                                cantidadLicuadora * precioLicuadora +
                                cantidadLavadora * precioLavadora +
                                cantidadTelevisor * precioTelevisor;
        
        // Calcular el descuento si el total supera los 3 millones
        double descuento = 0;
        if (totalSinDescuento > 3000000) {
            descuento = 0.2 * totalSinDescuento;
        }
        
        // Calcular el total con descuento
        int totalConDescuento = (int) (totalSinDescuento - descuento);
        
        // Mostrar los resultados
        System.out.println("Precio por cada producto:");
        System.out.println("Plancha: $" + precioPlancha);
        System.out.println("Licuadora: $" + precioLicuadora);
        System.out.println("Lavadora: $" + precioLavadora);
        System.out.println("Televisor: $" + precioTelevisor);
        
        System.out.println("\nTotal sin descuento: $" + totalSinDescuento);
        System.out.println("Total con descuento: $" + totalConDescuento);
        System.out.println("Descuento aplicado: $" + descuento);
        
        
       
    }
    
}
