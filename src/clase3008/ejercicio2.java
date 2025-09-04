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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //++++Lee un vector de 8 enteros y permite buscar++++
        //++++un número ingresado por el usuario++++
        Scanner lector=new Scanner (System.in);
        int i;
        int [] numero= new int [8];
        int numero1,contador=0,acumulador=0;
        String pregunta;
        System.out.println("Ingrese 8 numeros enteros de su eleccion");
        for (i=0;i<8;i++){
            numero[i]=lector.nextInt();
        }
        do{
            System.out.println("Cual es la posicion del numero que desea ver");
            numero1=lector.nextInt();
            acumulador=acumulador+numero[numero1-1];
            contador++;
            System.out.println("El numero en la posicion "+numero1+ " es "+numero [numero1-1]);
            System.out.println("Desea seguir buscando numeros?");
            pregunta=lector.next().toUpperCase();
        }while (pregunta.equals("SI"));   
    } 
}
