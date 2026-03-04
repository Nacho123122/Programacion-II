/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2practica1;

/**
 *
 * @author win
 */
public class EcuacionCuadratica {
    private double a, b, c;
    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getD() {
        return b * b - 4 * a * c;
    }

    public double getRaiz1() {
        if (getD() >= 0)
            return (-b + Math.sqrt(getD())) / (2 * a);
        else
            return 0;
    }

    public double getRaiz2() {
        if (getD() >= 0)
            return (-b - Math.sqrt(getD())) / (2 * a);
        else
            return 0;
    }
    public void mostrar(){
        if(getD()>0){
            System.out.println("El discriminante es Positivo");
            System.out.println("");
            System.out.println(getRaiz1());
            System.out.println(getRaiz2());
        }
        else{
            if(getD()==0){
            System.out.println(getRaiz1());
            
            }
            else{
                System.out.println("La ecuacion no tiene raices reales");
            }
        }
    }
}
 