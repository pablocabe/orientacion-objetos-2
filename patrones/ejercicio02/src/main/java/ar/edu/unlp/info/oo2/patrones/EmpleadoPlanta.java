package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoPlanta extends Empleado {

    private int cantAniosAntiguedad;
    private int cantHijos;
    private boolean isCasado;
    private static final double SUELDO_BASICO_BASE = 50000;
    private static final double VALOR_HIJO = 2000;
    private static final double VALOR_ANIO = 2000;
    private static final double VALOR_CASADO = 5000;

    @Override
    protected double getSueldoBasico() {
        return SUELDO_BASICO_BASE;
    }

    @Override
    protected double getAdicional() {
        return (this.cantAniosAntiguedad * VALOR_ANIO) + (this.cantHijos * VALOR_HIJO) + (this.isCasado ? VALOR_CASADO : 0);
    }

    
    
}
