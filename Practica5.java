/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cuenta = 10000;
        
        boolean continuar = true;
        
        while (continuar){
        System.out.println("MENU");
        System.out.println("Que desea hacer");
        System.out.println("1.Consignar");
        System.out.println("2.Retirar");
        System.out.println("3.Consultar");
        System.out.println("4.Salir");   
        
        int opcion = sc.nextInt();
        
        switch(opcion){
            case (1):
                System.out.println("Cuanto va a consignar");
                int consignar = sc.nextInt();
                cuenta = cuenta + consignar;
                break;
            case 2:
                System.out.println("Digit cuanto va a retirar");
                int retirar = sc.nextInt();
                cuenta = cuenta - retirar;
                break;
            case 3:
                System.out.println("*** Banco ****");
                System.out.println("Tiene: "+ cuenta);
                break;
            case 4:
                continuar = false;
                System.out.println("Chao");
                break;
        }
        }
        
        
    }
}
