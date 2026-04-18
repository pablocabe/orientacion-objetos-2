package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoTemporario extends Empleado {
    
    private static final double VALOR_SUELDO_BASE = 20000;
    private static final double VALOR_HORA = 300;
    private static final double VALOR_CASADO = 5000;
    private static final double VALOR_HIJO = 2000;

    private int cantHorasTrabajadas;
    private int cantHijos;
    private boolean isCasado;

    public EmpleadoTemporario(int cantHorasTrabajadas, int cantHijos, boolean isCasado) {
        this.cantHorasTrabajadas = cantHorasTrabajadas;
        this.cantHijos = cantHijos;
        this.isCasado = isCasado;
    }

    @Override
    protected double getSueldoBasico() {
        return VALOR_SUELDO_BASE + this.cantHorasTrabajadas * VALOR_HORA;
    }

    @Override
    protected double getAdicional() {
        return (this.cantHijos * VALOR_HIJO) + (this.isCasado ? VALOR_CASADO : 0);
    }
    
}