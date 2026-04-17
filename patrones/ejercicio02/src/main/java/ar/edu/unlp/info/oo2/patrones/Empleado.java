package ar.edu.unlp.info.oo2.patrones;

public abstract class Empleado {

    public Empleado() {}

    public double getSueldo() {
        return this.getSueldoBasico() + this.getAdicional() - this.getDescuento();
    }

    protected double getDescuento() {
        return 0;
    }

    protected abstract double getSueldoBasico();

    protected abstract double getAdicional();

    


}