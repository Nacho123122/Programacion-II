/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algebravectorial;

/**
 *
 * @author win
 */
public class AlgebraVectorial {

    private double x;
    private double y;

    
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
    }

    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y);
    }

   
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y);
    }

    
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y);
    }


    public boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }

    public boolean esParalelo(AlgebraVectorial v) {
        return (this.x * v.y - this.y * v.x) == 0;
    }
    
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double escalar = this.productoPunto(b) / Math.pow(b.magnitud(), 2);
        return new AlgebraVectorial(escalar * b.x, escalar * b.y);
    }

    
    public double componenteEn(AlgebraVectorial b) {
        return this.productoPunto(b) / b.magnitud();
    }

    
    public void mostrar() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public static void main(String[] args) {

        AlgebraVectorial a = new AlgebraVectorial(3, 4);
        AlgebraVectorial b = new AlgebraVectorial(4, -3);

        
        System.out.println("Perpendiculares? " + a.esPerpendicular(b));

        
        System.out.println("Paralelos? " + a.esParalelo(b));

        
        System.out.print("Proyeccion de a sobre b: ");
        a.proyeccionSobre(b).mostrar();

        
        System.out.println("Componente de a en b: " + a.componenteEn(b));
    }
}
