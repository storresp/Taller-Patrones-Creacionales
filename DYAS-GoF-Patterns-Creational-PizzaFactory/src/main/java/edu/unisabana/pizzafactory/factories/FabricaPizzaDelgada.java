package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;

public class FabricaPizzaDelgada implements FabricaPizza {
    
    @Override
    public AmasadorPizzaDelgada crearAmasador() {
        return new AmasadorPizzaDelgada();
    };

    @Override
    public MoldeadorPizzaDelgada crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    };

    @Override
    public HorneadorPizzaDelgada crearHorneador() {
        return new HorneadorPizzaDelgada();
    };
}
