/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2practica1;

/**
 *
 * @author win
 */
public class Cronometro {
    private long inicia,finaliza;
    Cronometro(){
         inicia = System.currentTimeMillis();
    }

    public long getInicia() {
        return inicia;
    }

    public long getFinaliza() {
        return finaliza;
    }

    
    public void inicia() {
        this.inicia = System.currentTimeMillis();
    }

    // Detiene el cronómetro
    public void detener() {
        this.finaliza = System.currentTimeMillis();
    }

    // Retorna el tiempo transcurrido en milisegundos
    public long lapsoDeTiempo() {
        return finaliza - inicia;
    } 
}
