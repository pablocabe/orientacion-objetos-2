package ar.edu.unlp.info.oo2.refactoring;

public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos = 0;
    public double calcularSueldoTotal() {
        return this.sueldoBasico + (this.cantidadHijos * 2000) - this.calcularDescuento();
    }
}
