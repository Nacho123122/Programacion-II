/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector3d;

/**
 *
 * @author win
 */
public class Vector3D {
    private double x, y, z;
    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D sumar(Vector3D v) {
        return new Vector3D(
            this.x + v.x,
            this.y + v.y,
            this.z + v.z
        );
    }
    public Vector3D multiplicar(double r) {
        return new Vector3D(
            r * this.x,
            r * this.y,
            r * this.z
        );
    }
    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public Vector3D normal() {
        double mag = this.magnitud();
        return new Vector3D(
            this.x / mag,
            this.y / mag,
            this.z / mag
        );
    }
    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector3D productoVectorial(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }
    public void mostrar() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, 5, 6);
        System.out.print("a + b = ");
        a.sumar(b).mostrar();
        System.out.print("2a = ");
        a.multiplicar(2).mostrar();
        System.out.println("|a| = " + a.magnitud());
        System.out.print("Vector normal de a = ");
        a.normal().mostrar();
        System.out.println("a * b = " + a.productoEscalar(b));
        System.out.print("a x b = ");
        a.productoVectorial(b).mostrar();
    }
}

