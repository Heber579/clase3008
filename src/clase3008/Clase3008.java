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
public class Clase3008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //       Crear un vector
        Scanner lector=new Scanner (System.in);
        int i;
        int [] sueldo = new int [10];
        int numero,acumulador=0,contador=0;
        String pregunta;
        double promedio;
        //Ingrese diez calificaciones
        System.out.println("Ingrese calificaciones");
        for (i=0;i<10;i++){
            sueldo[i]=lector.nextInt();
        }
        System.out.println("El quinto valor es "+sueldo[4]);
        System.out.println("El ultimo valor es "+sueldo[9]);
        System.out.println("El octavo valor es "+sueldo[7]);
        
        for (i=9;i>=0;i--){
            System.out.println(sueldo[i]);  
        }
        do{
        System.out.println("Que nota desea ver?");
        numero=lector.nextInt();
        acumulador=acumulador+sueldo[numero-1];
        contador++;
        System.out.println("La nota en la posicion "+numero+" es "+sueldo [numero-1]);
          System.out.println("Desea seguir viendo notas?");
          pregunta=lector.next().toUpperCase();
        }while (pregunta.equals("SI"));
        System.out.println("La suma es "+acumulador);
        System.out.println("Se mostraron "+contador+" notas");
        promedio=acumulador/contador;
        System.out.println("El promedio es "+promedio);
    }
    
}
