package ar.edu.unlp.info.oo2.refactoring;

public class EmpleadoPasante extends Empleado {

    public double calcularSueldo() {
        return this.sueldoBasico - this.calcularDescuento();
    }
}
