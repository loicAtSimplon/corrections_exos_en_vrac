/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author cantinelli
 */
public class Exercice10 {
    
    public static void launch(){
        
        long[] suite = new long[100];
        
        suite[0] = 0;
        System.out.println(suite[0]);
        suite[1] = 1;
        System.out.println(suite[1]);
        
        for(int i = 2 ; i < suite.length ; i++){
            
            suite[i] = suite[i-2] + suite[i-1];
            
            System.out.println(suite[i]);
        }
    }
    
}
