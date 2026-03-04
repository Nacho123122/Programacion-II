/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog2practica1;

/**
 *
 * @author win
 */
public class EcuacionLineal {
    private double a,b,c,d,e,f;
    EcuacionLineal(double a1,double b1,double c1,double d1,double e1,double f1){
        a=a1;
        b=b1;
        c=c1;
        d=d1;
        f=f1;
        e=e1;
    }
    
    public boolean TieneSolucion(){
        double r=a*d-b*c;
        if (r!=0){
            return true;
        }
        else{
            return false;
        }
    }
    public double getX(){
        double x=(e*d-b*f)/(a*d-b*c);
        return x;
    }
    public double getY(){
        double y=(a*f-e*c)/(a*d-b*c);
        return y;
    }
    
}
