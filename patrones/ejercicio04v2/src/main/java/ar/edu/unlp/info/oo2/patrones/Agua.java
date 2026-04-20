package ar.edu.unlp.info.oo2.patrones;

public class Agua implements Topografia {
	
    public Agua() {
        // No necesita estado interno
    }
	
    @Override
    public double proporcionAgua() {
        return 1.0;
    }

    @Override
    public double proporcionTierra() {
        return 0.0;
    }

    @Override
    public boolean igual(Topografia otra) {
        // 2. Comienzo del Doble Despacho: Me presento como "Agua" (this)
        return otra.esIgualAAgua(this);
    }

    // --- Implementación de los métodos de ayuda del Doble Despacho ---

    @Override
    public boolean esIgualAAgua(Agua agua) {
        // Una Agua SIEMPRE es igual a otra Agua. No hay valores que comparar.
        return true; 
    }

    @Override
    public boolean esIgualATierra(Tierra tierra) {
        // Una Agua NUNCA es igual a una Tierra
        return false;
    }

    @Override
    public boolean esIgualAMixta(Mixta mixta) {
        // Una Agua NUNCA es igual a una Mixta estructuralmente
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