/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author cedriclavery
 */
public class Exercice9 {
    public static void launch(){
        
        int a = 243;
        while(a >= 0){
            if(a%10 == 0){
                int x = a + 1;
                System.out.println(x + a);
            }
            if(a%2 == 0){
                int b = a - 2;
                System.out.println(b + a);
            }
            if(a%5 ==0 && a%3 ==0){
                System.out.println("true");
                
            }
            a--;
        }
    }
}
