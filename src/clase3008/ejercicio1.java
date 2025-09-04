/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3008;

import java.util.Scanner;

/**
 *
 * @author Ever
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //++++Pide al usuario que ingrese 5 números y muéstralos en pantalla++++
        Scanner lector=new Scanner (System.in);
        int i;
        int [] numero = new int [5];
        System.out.println("Ingrese 5 numeros");
        for (i=0;i<5;i++){
           numero[i]=lector.nextInt();         
        }
        System.out.println("Los numeros ingresados son:");
        for (i=0;i<5;i++){
        System.out.println(numero[i]);  
        }
    }
    
}
