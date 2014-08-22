


package com.arraylist;

import com.logic.Operation;

/**
 *
 * @author Sebastian-pc
 */
public class Array {

    
    public static void main(String[] args) {
        
        //declaracion de los 2 vectores con su respectivos indices
        int A[]=new int [10];
        int B[]=new int [10];
        
        //instanciamiento del metodo in(para ingresar datos) ubicado en la clase operation
        Operation.in(A, B);
        //instanciamiento del metodo out(imprimir vector A) ubicado en la clase operation
        Operation.out(A);
        //instanciamiento del metodo out(imprimir vector B) ubicado en la clase operation
        Operation.out(B);
        
    }
    
}
