package ar.edu.unlp.info.oo2.refactoring;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;

    public void incrementarPuntuacion() {
        this.puntuacion = this.puntuacion + 100;
    }

    public void decrementarPuntuacion() {
        this.puntuacion = this.puntuacion - 50;
    }
}