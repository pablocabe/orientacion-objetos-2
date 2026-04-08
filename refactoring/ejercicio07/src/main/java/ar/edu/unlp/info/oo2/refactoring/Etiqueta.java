package ar.edu.unlp.info.oo2.refactoring;

abstract class Etiqueta {
    protected String nombreProducto;
    protected double precio;

    public Etiqueta(String nombre, double precio) {
        this.nombreProducto = nombre;
        this.precio = precio;
    }

    public void generar() {
        this.imprimirEncabezado();
        System.out.println("Producto: " + this.nombreProducto);
        this.imprimirPrecios();
        this.imprimirSeparador();
    }

    protected abstract void imprimirEncabezado();
    protected abstract void imprimirPrecios();
    protected abstract void imprimirSeparador();
}