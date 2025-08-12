package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.model.Amasador;
import edu.unisabana.pizzafactory.model.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.AmasadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Horneador;
import edu.unisabana.pizzafactory.model.HorneadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.HorneadorPizzaGruesa;
import edu.unisabana.pizzafactory.model.Moldeador;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.MoldeadorPizzaGruesa;

public class FabricaPizzaGruesa implements FabricaPizza {
    
    @Override
    public AmasadorPizzaGruesa crearAmasador() {
        return new AmasadorPizzaGruesa();
    };

    @Override
    public MoldeadorPizzaGruesa crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    };

    @Override
    public HorneadorPizzaGruesa crearHorneador() {
        return new HorneadorPizzaGruesa();
    };
}
