package ar.edu.unlp.info.oo2.refactoring;

class EtiquetaSimple extends Etiqueta {
    public EtiquetaSimple(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void imprimirEncabezado() {
        System.out.println("--- ETIQUETA BÁSICA ---");
    }

    @Override
    public void imprimirPrecios() {
        System.out.println("Precio: $" + this.precio);
    }

    @Override
    public void imprimirSeparador() {
        System.out.println("-----------------------");
    }
}
