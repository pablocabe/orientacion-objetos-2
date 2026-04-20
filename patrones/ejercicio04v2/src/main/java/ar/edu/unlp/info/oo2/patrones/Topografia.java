package ar.edu.unlp.info.oo2.patrones;

public interface Topografia {
	
    double proporcionAgua();
    double proporcionTierra();
    
    // Método de igualdad que todos deben entender
    boolean igual(Topografia otra);
    
    // --- Métodos "detrás de escena" para el Doble Despacho (Obligatorios en la interfaz) ---
    // Estos métodos se consideran detalles de implementación del patrón.
    boolean esIgualAAgua(Agua agua);
    boolean esIgualATierra(Tierra tierra);
    boolean esIgualAPantano(Pantano pantano);
    boolean esIgualAMixta(Mixta mixta);

    // El equals estándar de Java
    boolean equals(Object objeto);
}