package ar.edu.unlp.info.oo2.refactoring;

class EtiquetaDetalle extends Etiqueta {
    public EtiquetaDetalle(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void imprimirEncabezado() {
        System.out.println("--- ETIQUETA DETALLE ---");
    }

    @Override
    public void imprimirPrecios() {
        System.out.println("Precio sin imp.: $" + (this.precio * 0.79));
        System.out.println("Precio final: $" + this.precio);
    }

    @Override
    public void imprimirSeparador() {
        System.out.println("------------------------");
    }
}
