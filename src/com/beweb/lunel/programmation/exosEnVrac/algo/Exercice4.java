/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *la valeur de la variable entiere est 2 si flag est égale a false ou -2 si true;
 * 
 * @author thierry
 */
public class Exercice4 {
    public static void launch(){
        
        // je declare une variable
        boolean flag;
        // j'initialise la variable a 0
        
        int a =0;
        
        flag = false;

        
        // si flag est égale a false alors le code sera executé
        if(flag == false)
        {
            
            a++;
        }
        else{
            
            a--;
        }
        
        // flag est egale a l'inverse de flag !!!! 
        flag = !flag;
        
        // si flag est égale a vrai alors le code est executer
        
        if(flag==true)
        {
            
            a++;
        }
        else{
            
            a--;
        }
    }
    
}
