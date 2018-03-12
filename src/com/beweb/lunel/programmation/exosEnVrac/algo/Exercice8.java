/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.programmation.exosEnVrac.algo;

/**
 *
 * @author amchi
 */
public class Exercice8 {
    public static void launch()
    {
        int compteur = 243;
        for (compteur = 243; compteur >0 ; compteur --)
        {
            if( compteur%2 == 0)
            {
                System.out.println(compteur + " est paire.");
            }
            if( compteur%5==0)
            {
                System.out.println(compteur + " est un multiple de 5.");
            }
            if( compteur%10==0)
            {
                System.out.println(compteur + " est un multiple de 10.");
            }
        }
    }
}
