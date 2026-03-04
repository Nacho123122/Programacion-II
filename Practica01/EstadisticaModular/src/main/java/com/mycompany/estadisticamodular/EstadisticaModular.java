/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadisticamodular;

/**
 *
 * @author win
 */
import java.util.Scanner;

public class EstadisticaModular {

    public static double promedio(double[] datos) {
        double suma = 0;
        for (double d : datos)
            suma += d;
        return suma / datos.length;
    }

    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;

        for (double d : datos)
            suma += Math.pow(d - prom, 2);

        return Math.sqrt(suma / (datos.length - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] datos = new double[10];

        for (int i = 0; i < 10; i++)
            datos[i] = sc.nextDouble();

        System.out.println("Promedio: " + promedio(datos));
        System.out.println("Desviacion: " + desviacion(datos));
    }
}
