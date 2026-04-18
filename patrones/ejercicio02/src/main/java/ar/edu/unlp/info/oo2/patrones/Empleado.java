package ar.edu.unlp.info.oo2.patrones;

public abstract class Empleado {

    private static final double VALOR_PORCENTAJE_BASICO = 0.13;
    private static final double VALOR_PORCENTAJE_ADICIONAL = 0.05;

    public Empleado() {}

    public double getSueldo() {
        return this.getSueldoBasico() + this.getAdicional() - this.getDescuentoTotal();
    }

    private double getDescuentoTotal() {
        return this.getDescuentoBasico() + this.getDescuentoAdicional();
    }

    private double getDescuentoBasico() {
        return getSueldoBasico() * VALOR_PORCENTAJE_BASICO;
    }

    private double getDescuentoAdicional() {
        return getAdicional() * VALOR_PORCENTAJE_ADICIONAL;
    }

    protected abstract double getSueldoBasico();

    protected abstract double getAdicional();

    


}