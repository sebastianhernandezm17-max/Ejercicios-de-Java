/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto8;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Proyecto8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Estudiante z = new Estudiante();
        
        System.out.println("Primera nota");
        z.nota1 = sc.nextDouble();
        System.out.println("Segunda nota");
        z.nota2 = sc.nextDouble();
        System.out.println("tercera nota");
        z.nota3 = sc.nextDouble();
        
        boolean continuar = true;
        
        
        while (continuar){
        System.out.println("MENU");
        System.out.println("Que desea hacer");
        System.out.println("1.Promedio");
        System.out.println("2.Saber si aprobo o reprobo");
        System.out.println("3.Consultar");
        System.out.println("4.Salir");
        
        int opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                z.calcularPromedio();
                break;
            case 2:
                z.calcularAprobo(); 
                break;
            case 3:
                z.mostrarDatos();
                break;
            case 4:
                continuar = false;
                System.out.println("Chao");
                break;
        }
              
    }
    }
}

class Estudiante {
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;
    
    void calcularPromedio(){
        promedio = (nota1+nota2+nota3)/3;
        
    }
    void calcularAprobo(){
        calcularPromedio();
        if (promedio>=3.0){
           System.out.println("Aprobo"); 
        }
        else{
            System.out.println("Reprobo");
        }
    }
    void mostrarDatos(){
        System.out.println("Su promedio es: " + promedio);
    }
}

