/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto;

/**
 *
 * @author win
 */
public class Punto {
    public double x,y;
    Punto(){
        x=0;
        y=0;
    }
    Punto(double a,double b){
        x=a;
        y=b;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public String toString(){
        return x+","+y;
    }
    
    
    public double distancia(Punto otroPunto) {
        double dx = x - otroPunto.x;
        double dy = y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // e) Distancia a coordenadas específicas
    public double distancia(double x, double y) {
        double dx = x - x;
        double dy = y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        // TODO code application logic 
        Punto A=new Punto(1,2);

        Punto p1 = new Punto();
        Punto p2 = new Punto(10, 30.5);

        double distancia = p1.distancia(p2);

        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Distancia entre los puntos: " + distancia);
    }

    
}
