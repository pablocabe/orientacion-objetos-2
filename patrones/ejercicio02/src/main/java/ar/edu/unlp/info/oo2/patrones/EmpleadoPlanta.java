package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoPlanta extends Empleado {

    private static final double VALOR_SUELDO_BASE = 50000;
    private static final double VALOR_HIJO = 2000;
    private static final double VALOR_ANIO = 2000;
    private static final double VALOR_CASADO = 5000;

    private int cantAniosAntiguedad;
    private int cantHijos;
    private boolean isCasado;
    
    public EmpleadoPlanta(int cantAniosAntiguedad, int cantHijos, boolean isCasado) {
        this.cantAniosAntiguedad = cantAniosAntiguedad;
        this.cantHijos = cantHijos;
        this.isCasado = isCasado;
    }
    
    @Override
    protected double getSueldoBasico() {
        return VALOR_SUELDO_BASE;
    }

    @Override
    protected double getAdicional() {
        return (this.cantAniosAntiguedad * VALOR_ANIO) + (this.cantHijos * VALOR_HIJO) + (this.isCasado ? VALOR_CASADO : 0);
    }

    
    
}
