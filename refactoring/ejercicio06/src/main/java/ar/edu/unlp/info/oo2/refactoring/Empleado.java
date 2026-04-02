package ar.edu.unlp.info.oo2.refactoring;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    protected double sueldoBasico = 0;
    private static final double porcentajeDescuento = 0.13;

    protected abstract double calcularSueldo();

    public double calcularDescuento() {
        return this.sueldoBasico * porcentajeDescuento;
    }
}
