
package com.mycompany.holamundito;

import java.util.Scanner;

/**
 *
 * @author reate
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca un numero");
            int num=sn.nextInt();
            System.out.println("introduzca otro numero");
            int nume=sn.nextInt();
            
            char caracter=(char)num;
            char caracters=(char)nume;
            
            System.out.println("El numuero:"+num);
            System.out.println("Corresponde :"+caracter);
            System.out.println("El segundo numero:"+nume);
            System.out.println("Corresponde :"+caracters);
    }
    
    
    }
    

