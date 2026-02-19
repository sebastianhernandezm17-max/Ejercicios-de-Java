/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persona p = new Persona();   
        
        boolean continuar = true;
        
        while (continuar){
         System.out.println("\nMENU");
            System.out.println("1. Ingresar nombre");
            System.out.println("2. Ingresar edad");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Salir");
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case (1):
                System.out.println("Digite su nombre:");
                p.nombre = sc.next();
                break;
            case 2:
                System.out.println("Digite su edad:");
                p.edad = sc.nextInt();  
                break;
            case 3:
                p.mostrarDatos();
                break;
            case 4:
                continuar = false;
                System.out.println("Chao");
                break;
                
                
        }
    }
}
}
class Persona {
    String nombre;
    int edad;
    
    void mostrarDatos(){
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
    }
}
