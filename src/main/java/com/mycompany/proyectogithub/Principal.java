/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectogithub;

import com.mycompany.proyectogithub.admin.Delegado;
import com.mycompany.proyectogithub.operaciones.Resta;
import com.mycompany.proyectogithub.operaciones.Suma;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Principal {
    
    public static void main(String[] args){
        Delegado del = new Delegado();
        
        System.out.println("Hola mundo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese segundo numero");
        double num2 = scanner.nextDouble();
        
        System.out.println("Menu de operaciones:\n"
                + "1. Suma\n"
                + "2. Resta\n");
        int menu = scanner.nextInt();
        switch(menu){
            case 1:
                del.executeTask(new Suma(), num1, num2);
                break;
            case 2:
                del.executeTask(new Resta(), num1, num2);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        
    }
    
}
