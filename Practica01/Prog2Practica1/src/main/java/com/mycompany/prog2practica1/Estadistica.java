/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2practica1;

/**
 *
 * @author win
 */
public class Estadistica {

    private double[] datos;

    public Estadistica(double[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        double suma = 0;
        for (double d : datos)
            suma += d;
        return suma / datos.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (double d : datos)
            suma += Math.pow(d - prom, 2);

        return Math.sqrt(suma / (datos.length - 1));
    }
}

