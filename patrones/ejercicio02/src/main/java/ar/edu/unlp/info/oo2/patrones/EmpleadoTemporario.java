package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoTemporario extends Empleado {
    
    private int cantHorasTrabajadas;
    private int cantHijos;
    private boolean isCasado;
    private static final double SUELDO_BASICO_BASE = 20000;
    private static final double VALOR_HORA = 300;
    private static final double VALOR_CASADO = 5000;
    private static final double VALOR_HIJO = 2000;

    @Override
    protected double getSueldoBasico() {
        return SUELDO_BASICO_BASE + this.cantHorasTrabajadas * VALOR_HORA;
    }

    @Override
    protected double getAdicional() {
        return (this.cantHijos * VALOR_HIJO) + (this.isCasado ? VALOR_CASADO : 0);
    }
    
}