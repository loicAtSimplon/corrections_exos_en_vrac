/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author julianbertrix
 */
public class Exercice6 {
    public static void launch()
    {
        boolean[] boolTab = new boolean[10];
        
        int i = 0;
        while(i < boolTab.length)
        {
            boolTab[i] = true;
            i++;
        }
        
        i = 0;
        
        while(i < boolTab.length)
        {
            boolTab[i] = false;
            i++;
        }
        
        i = 0;
        
        while(i < boolTab.length)
        {
            boolTab[i] = true;
            System.out.println(boolTab[i]);
            i++;
            boolTab[i] = false;
            System.out.println(boolTab[i]);
            i++;
        }
    }
    
}
