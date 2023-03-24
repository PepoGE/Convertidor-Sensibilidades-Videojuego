/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.convertidorsensibilidades;

import Juegos.Valorant;
import Juegos.Juegos;

/**
 *
 * @author riolu
 */
public class testConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juegos valorant = new Valorant ("Valorant");
        
        
        
        valorant.ConvertirSensCSGO(1);
        System.out.println("Su sensibilidad de: "  + valorant.getjuegoBase()+ " a " + valorant.getJuegoConvertido() + " es: "  + valorant.getSensSalida());
         valorant.ConvertirSensCSGO(10);
        System.out.println("Su sensibilidad de: "  + valorant.getjuegoBase()+ " a " + valorant.getJuegoConvertido() + " es: "  + valorant.getSensSalida());
        valorant.ConvertirSensFortnite(2.30);
                System.out.println("Su sensibilidad de: "  + valorant.getjuegoBase()+ " a " + valorant.getJuegoConvertido() + " es: "  + valorant.getSensSalida());

    }
    
}
