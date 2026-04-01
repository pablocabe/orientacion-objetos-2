package ar.edu.unlp.info.oo2.refactoring;

public class EmpleadoPasante extends Empleado {
    public double calcularSueldoTotal() {
        return this.sueldoBasico - this.calcularDescuento();
    }
}
