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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //+++Realiza un vector de 6 enteros y muéstralo en orden inverso+++
        Scanner lector=new Scanner (System.in);
        int i;
        int [] numero = new int [6];
        System.out.println("Ingrese 6 numeros enteros");
        for (i=0;i<6;i++){
            numero[i]=lector.nextInt();
        }
        System.out.println("El orden inverso de los numeros es:");
        for (i=5;i>=0;i--){
            System.out.println(numero[i]);
        }
    }
    
}
