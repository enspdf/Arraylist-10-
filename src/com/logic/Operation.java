/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.logic;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian-pc
 */
public class Operation {
    
    
    //metodo in para la entrada de datos en los respectivos vectores
    //dependiendo de los valores ingresados
    public static void in(int[] A, int[] B) {
        
        //declaracion e inicializacion de las variables que recorreran y serviran
        //para imprimir e ingresar datos al vector
        int i=0,j=0,num;
        
        //condiciones para el correcto ingreso de datos
        //dependiendo del valor ingresado
        // valor>20 => Vector A
        //valor<20 => Vector B
        while((i<10)||(j<10)){
            num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar numero"));
            // valor>20 => Vector A
            if (num>20 && i<10) {
                A[i]=num;
                i++;
                if (i==10) {
                    JOptionPane.showMessageDialog(null, "Array A lleno");

                    
                }
             
            //valor<20 => Vector B    
            }else if (num<20 && j<10) {
                B[j]=num;
                j++;
                if (j==10) {
                    JOptionPane.showMessageDialog(null, "Array B lleno ");

                }
                
            }
        }

        
    }
    
    //impresion del vector
    //recorriendo cada una de sus posiciones
    public static void out(int[] A) {
        int i=0;
        String str="";
        
        for ( i= 0;i<10;i++) {
            str=str+A[i]+" "+" ";
        }
        JOptionPane.showMessageDialog(null, str);
    }
    
    
}
