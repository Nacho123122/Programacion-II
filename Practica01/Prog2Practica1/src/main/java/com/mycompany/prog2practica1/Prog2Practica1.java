/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog2practica1;

/**
 *
 * @author win
 */
import java.util.Random;
import java.util.Scanner;
public class Prog2Practica1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inciso 1");
        int tamaño = 100;
        int[] numeros = new int[tamaño];
        Random random = new Random();
        System.out.println("Numeros Aleatorios");
        for (int i = 0; i < tamaño; i++) {
            int n=random.nextInt(10000);
            numeros[i] = n;
            System.out.println(numeros[i]);
        }
        

        Cronometro cronometro = new Cronometro();
        cronometro.inicia();

        System.out.println("Ordenando Numeros");
        orden(numeros);

        cronometro.detener();

        System.out.println("Tiempo de ejecución: " 
                + cronometro.lapsoDeTiempo() + " ms");
        
        System.out.println("");
        System.out.println("Inciso 2");
        System.out.println("ingrese datos para la ecuacion lineal:");
        System.out.println("");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        EcuacionLineal e1=new EcuacionLineal(a,b,c,d,e,f);
        System.out.println(e1.getX());
        System.out.println(e1.getY());
        if(e1.TieneSolucion()){
            System.out.println("Si Tiene Solucion:: X:"+e1.getX()+" Y:"+e1.getY());
        }
        else{
            System.out.println("No Tiene Solucion");
        }
        
        System.out.println("ingrese datos para la ecuacion lineal:");
        System.out.println("");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double z2 = sc.nextDouble();
        double f2 = sc.nextDouble();
        EcuacionLineal e3=new EcuacionLineal(a2,b2,c2,d2,z2,f2);
        if(e3.TieneSolucion()){
            System.out.println("Si Tiene Solucion:: X:"+e3.getX()+" Y:"+e3.getY());
        }
        else{
            System.out.println("No Tiene Solucion");
        }
        
        System.out.println("");
        System.out.println("Inciso 3");
        System.out.print("Ingrese a, b, c: ");
        System.out.println("");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        EcuacionCuadratica eq =new EcuacionCuadratica(x,y,z);
        eq.mostrar();
        
        System.out.println("");
        System.out.println("Inciso 4");
        System.out.println("Ingrese 10 datos");
        System.out.println("");

        double[] datos = new double[10];

        for (int i = 0; i < 10; i++){
            datos[i] = sc.nextDouble();
        }
        Estadistica e5 = new Estadistica(datos);

        System.out.println("Promedio: " + e5.promedio());
        System.out.println("Desviacion: " + e5.desviacion());
        
    }
              
        public static void orden(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int minimo = i;

            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }
            }

            // Intercambio
            int temp = arreglo[minimo];
            arreglo[minimo] = arreglo[i];
            arreglo[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arreglo[i]);
        }
     }
}
