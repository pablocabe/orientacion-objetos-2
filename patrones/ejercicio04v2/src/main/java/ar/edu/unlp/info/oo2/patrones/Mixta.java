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
    public double proporcionAgua() {
        return this.componentes.stream().mapToDouble(Topografia::proporcionAgua).sum() / 4.0;
    }

    @Override
    public double proporcionTierra() {
        return this.componentes.stream().mapToDouble(Topografia::proporcionTierra).sum() / 4.0;
    }

    @Override
    public boolean igual(Topografia otra) {
        // 2. Comienzo del Doble Despacho: Me presento como "Mixta" (this)
        return otra.esIgualAMixta(this);
    }

    // --- Implementación de los métodos de ayuda del Doble Despacho ---

    @Override
    public boolean esIgualAAgua(Agua agua) {
        // Una Mixta NUNCA es igual a una Agua
        return false;
    }

    @Override
    public boolean esIgualATierra(Tierra tierra) {
        // Una Mixta NUNCA es igual a una Tierra
        return false;
    }

    @Override
    public boolean esIgualAMixta(Mixta mixta) {
        // Si llegaron hasta acá, ambas son Mixtas. Comparamos sus partes.
        // La lista invocará el equals() de cada Topografía individualmente,
        // desencadenando el despacho recursivo automáticamente.
        return this.componentes.equals(mixta.componentes);
    }
	
    @Override
    public boolean equals(Object objeto) {
        if (!(objeto instanceof Topografia)) return false;
        return ((Topografia) objeto).igual(this);
    }
}