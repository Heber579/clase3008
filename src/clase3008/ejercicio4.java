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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //+++Pide 10 números al usuario y cuenta cuántos son pares e impares+++
        Scanner lector=new Scanner (System.in);
        int i;
        int [] numero= new int [10];
        int contapar=0,contaimp=0;
        System.out.println("Ingrese 10 numeros");
        for (i=0;i<10;i++){
            numero[i]=lector.nextInt(); 
        if ((numero[i]%2)==0){
            contapar++;
        }else{
            contaimp++;
        }            
        }
        System.out.println("La cantidad de numeros pares es "+contapar);
        System.out.println("La cantidad de numeros impares es "+contaimp);
    }
    
}
