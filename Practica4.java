/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        
        
        while(num!=0){
            suma = suma+num;
            
            System.out.println("Ingrese otro numero");
            num = sc.nextInt();
            
        }
        System.out.println("La suma total es "+ suma);
    }
}
