/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Ingrese segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1>num2){
            System.out.println(num1 + "es mayor que"+num2);
        }
        else if (num2>num1) {
            System.out.println(num2 + "es mayor que"+num1);
        }
        else{
            System.out.println("Los numeros son iguales");
            
        }
        
        
        
    }
}
