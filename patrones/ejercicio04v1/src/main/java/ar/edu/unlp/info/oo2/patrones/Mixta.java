package ar.edu.unlp.info.oo2.patrones;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Topografia {

    private List<Topografia> componentes;

    public Mixta(Topografia componente1, Topografia componente2, Topografia componente3, Topografia componente4) {
        this.componentes = new ArrayList<>();
        this.componentes.add(componente1);
        this.componentes.add(componente2);
        this.componentes.add(componente3);
        this.componentes.add(componente4);
    }

    @Override
    public double getProporcionAgua() {
        // Sumamos las proporciones de los hijos y dividimos por 4
        return this.componentes.stream()
                               .mapToDouble(Topografia::getProporcionAgua)
                               .sum() / 4.0;
    }

    // --- Inicio del Doble Despacho ---

    @Override
    public boolean esIgualAHoja(Hoja hoja) {
        // Una mixta NUNCA es igual a una hoja
        return false;
    }

    @Override
    public boolean esIgualAMixta(Mixta otra) {
        // La magia de Java: el equals de las Listas itera elemento a elemento,
        // invocando el equals() de cada Topografía, lo que desencadenará
        // el Doble Despacho recursivamente sin que hagamos nada extra.
        return this.componentes.equals(otra.componentes);
    }
	
    @Override
    public boolean equals(Object obj) {
        // Protección estándar de Java
        if (!(obj instanceof Topografia)) {
            return false;
        }
        
        // Paso 1 del Doble Despacho: Me presento como "Mixta" (this)
        return ((Topografia) obj).esIgualAMixta(this);
    }
    
}
