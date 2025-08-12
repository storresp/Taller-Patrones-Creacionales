package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.Moldeador;

public interface FabricaPizza {
    Amasador crearAmasador();
    Moldeador crearMoldeador();
    Horneador crearHorneador();
}
