package ar.edu.unlp.info.oo2.patrones;

public class EmpleadoPasante extends Empleado {

    private static final double VALOR_SUELDO_BASE = 20000;
    private static final double VALOR_EXAMEN = 2000;

    private int cantExamenes;

    public EmpleadoPasante(int cantExamenes) {
        this.cantExamenes = cantExamenes;
    }

    @Override
    protected double getSueldoBasico() {
        return VALOR_SUELDO_BASE;
    }

    @Override
    protected double getAdicional() {
        return this.cantExamenes * VALOR_EXAMEN;
    }
    
}
