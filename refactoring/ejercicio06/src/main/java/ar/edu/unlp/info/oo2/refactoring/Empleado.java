package ar.edu.unlp.info.oo2.refactoring;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    protected double sueldoBasico = 0;

    protected abstract double calcularSueldoTotal();

    public double calcularDescuento() {
        return this.sueldoBasico * 0.13;
    }
}
