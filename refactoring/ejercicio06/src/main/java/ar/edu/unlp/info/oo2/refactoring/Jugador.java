package ar.edu.unlp.info.oo2.refactoring;

public class Jugador {
    private String nombre;
    private String apellido;
    private int puntuacion = 0;
    private static final int puntosParaIncrementar = 100;
    private static final int puntosParaDecrementar = 50;

    public void incrementarPuntuacion() {
        this.puntuacion = this.puntuacion + puntosParaIncrementar;
    }

    public void decrementarPuntuacion() {
        this.puntuacion = this.puntuacion - puntosParaDecrementar;
    }
}