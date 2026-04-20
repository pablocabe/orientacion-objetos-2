package ar.edu.unlp.info.oo2.patrones;

public class Pantano implements Topografia {

    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public double proporcionTierra() {
        return 0.3;
    }

    @Override
    public boolean igual(Topografia otra) {
        return otra.esIgualAPantano(this);
    }

    @Override
    public boolean esIgualAAgua(Agua agua) {
        return false;
    }

    @Override
    public boolean esIgualATierra(Tierra tierra) {
        return false;
    }

    @Override
    public boolean esIgualAPantano(Pantano pantano) {
        return true;
    }

    @Override
    public boolean esIgualAMixta(Mixta mixta) {
        return false;
    }

    @Override
    public boolean equals(Object objeto) {
        // 1. Protección estándar
        if (!(objeto instanceof Topografia)) return false;
        
        // Iniciamos el despacho
        return ((Topografia) objeto).igual(this);
    }
}