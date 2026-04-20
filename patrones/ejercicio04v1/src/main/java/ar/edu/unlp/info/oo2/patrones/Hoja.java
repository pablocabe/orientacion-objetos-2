package ar.edu.unlp.info.oo2.patrones;

public class Hoja implements Topografia {
    
    private double proporcionAgua;

    public Hoja (double proporcionAgua) {
        this.proporcionAgua = proporcionAgua;
    }

    @Override
    public double getProporcionAgua() {
        return this.proporcionAgua;
    }

    @Override
    public boolean esIgualAMixta(Mixta otra) {
        return false;
    }

    @Override
    public boolean esIgualAHoja(Hoja otra) {
        // Si llegaron hasta acá, ambas son Hojas. Comparamos su valor.
        return this.getProporcionAgua() == otra.getProporcionAgua();
    }
    
    @Override
    public boolean equals(Object obj) {
        // Protección estándar de Java para evitar ClassCastException
        if (!(obj instanceof Topografia)) {
            return false;
        }
        
        // Paso 1 del Doble Despacho: Me presento como "Hoja" (this)
        return ((Topografia) obj).esIgualAHoja(this);
    }
}
