package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoPasante extends Empleado {

    private int cantExamenes;
    private static final double SUELDO_BASICO_BASE = 20000;
    private static final double VALOR_EXAMEN = 2000;

    @Override
    protected double getSueldoBasico() {
        return SUELDO_BASICO_BASE;
    }

    @Override
    protected double getAdicional() {
        return this.cantExamenes * VALOR_EXAMEN;
    }
    
}
