/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica7;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Practica7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangulo d = new Rectangulo();
        
        System.out.println("Ingrese la base");
        d.base = sc.nextInt();
        System.out.println("ingrese la altura");
        d.altura = sc.nextInt();

        boolean continuar = true;
        
        
        while (continuar){
        System.out.println("MENU");
        System.out.println("Que desea hacer");
        System.out.println("1.Perimetro");
        System.out.println("2.Area");
        System.out.println("3.Consultar");
        System.out.println("4.Salir");
        
        int opcion = sc.nextInt();
        
        switch (opcion){
            case 1:
                d.calcularPerimetro();
                break;
            case 2:
                d.calcularArea(); 
                break;
            case 3:
                d.mostrarDatos();
                break;
            case 4:
                continuar = false;
                System.out.println("Chao");
                break;
        }
              
    }
}
}
class Rectangulo{
    int base;
    int altura;
    int perimetro;
    int area;
    
    void calcularPerimetro(){
        perimetro = base + altura + base + altura;
    }

    void calcularArea(){
        area = base * altura;
    }
    void mostrarDatos(){
        System.out.println("El perimetro es: " + perimetro);        
        System.out.println("El area es: " + area);
    }
}

