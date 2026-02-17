/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es su edad");
        int edad = sc.nextInt();
        
        boolean continuar = true;
        
        while(continuar){
          System.out.println("Menu");
        System.out.println("1.Saludar");
        System.out.println("2.Consultar edad");
        System.out.println("3.Salir");
        
        int opcion = sc.nextInt();
        
        switch (opcion){
            
            case 1:
                System.out.println("Hola chaval");
                break;
            case 2:
                System.out.println("Su edad es " + edad);
                break;
            case 3:
                continuar = false;
                System.out.println("chao");
                break;  
        }
        }
        
    }
}
