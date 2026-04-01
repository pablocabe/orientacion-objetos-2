public abstract class Empleado {
    private String nombre;
    private String apellido;
    protected double sueldoBasico = 0;

    protected abstract double calcularSueldoTotal();

    public double calcularDescuento() {
        return this.sueldoBasico * 0.13;
    }
}

public class EmpleadoTemporario extends Empleado {
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    public double calcularSueldoTotal() {
        return this.sueldoBasico + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000) - this.calcularDescuento();
    }
}


public class EmpleadoPlanta extends Empleado {
    private int cantidadHijos = 0;
    public double calcularSueldoTotal() {
        return this.sueldoBasico + (this.cantidadHijos * 2000) - this.calcularDescuento();
    }
}


public class EmpleadoPasante extends Empleado {
    public double calcularSueldoTotal() {
        return this.sueldoBasico - this.calcularDescuento();
    }
}
