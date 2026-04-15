/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;

/**
 *
 * @author win
 */
public class Juego {
    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        // Reinicia las vidas (puedes ajustar si quieres guardar valor inicial)
        System.out.println("Nueva partida iniciada.");
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Nuevo record: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Te quedan " + numeroDeVidas + " vidas.");

        return numeroDeVidas > 0;
    }
}