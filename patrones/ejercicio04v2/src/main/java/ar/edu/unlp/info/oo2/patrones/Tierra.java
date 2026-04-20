package ar.edu.unlp.info.oo2.patrones;

public class Tierra implements Topografia {
	
    public Tierra() {
        // No necesita estado interno
    }
	
    @Override
    public double proporcionAgua() {
        return 0.0;
    }

    @Override
    public double proporcionTierra() {
        return 1.0;
    }

    @Override
    public boolean igual(Topografia otra) {
        // 2. Comienzo del Doble Despacho: Me presento como "Tierra" (this)
        return otra.esIgualATierra(this);
    }

    // --- Implementación de los métodos de ayuda del Doble Despacho ---

    @Override
    public boolean esIgualAAgua(Agua agua) {
        // Una Tierra NUNCA es igual a una Agua
        return false;
    }

    @Override
    public boolean esIgualATierra(Tierra tierra) {
        // Una Tierra SIEMPRE es igual a otra Tierra
        return true; 
    }

    @Override
    public boolean esIgualAPantano(Pantano pantano) {
        return false;
    }

    @Override
    public boolean esIgualAMixta(Mixta mixta) {
        // Una Tierra NUNCA es igual a una Mixta
        return false;
    }

    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Topografia)) return false;
        return ((Topografia) objeto).igual(this);
    }
}