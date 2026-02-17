/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer nuemro: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = sc.nextInt();
        
        int suma = num1+num2;
        
        System.out.println("La suma es: "+suma);
        
                
    }
}
