package ar.edu.unlp.info.oo2.refactoring;

public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos = 0;
    public double calcularSueldo() {
        return this.sueldoBasico + (this.cantidadHijos * 2000) - this.calcularDescuento();
    }
}
