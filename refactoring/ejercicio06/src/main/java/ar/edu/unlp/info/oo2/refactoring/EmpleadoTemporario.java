package ar.edu.unlp.info.oo2.refactoring;

public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    public double calcularSueldoTotal() {
        return this.sueldoBasico + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000) - this.calcularDescuento();
    }
}
