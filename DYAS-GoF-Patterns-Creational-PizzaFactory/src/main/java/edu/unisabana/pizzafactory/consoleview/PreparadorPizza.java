
package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.factories.*;
import edu.unisabana.pizzafactory.model.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class PreparadorPizza {

    public static void main(String args[]){
        try {
            FabricaPizzaGruesa fabrica = new FabricaPizzaGruesa();
            Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
            PreparadorPizza pp=new PreparadorPizza();  
            

            pp.prepararPizza(fabrica, ingredientes, Tamano.MEDIANO);
        } catch (ExcepcionParametrosInvalidos ex) {
            Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
        }
                
    }
    
    
    public void prepararPizza(FabricaPizzaDelgada fabrica, Ingrediente[] ingredientes, Tamano tam)
            throws ExcepcionParametrosInvalidos {
        AmasadorPizzaGruesa am = fabrica.crearAmasador();
        HorneadorPizzaGruesa hpd =  fabrica.crearHorneador();
        MoldeadorPizzaGruesa mp = fabrica.crearMoldeador();
        am.amasar();
        if (tam == Tamano.PEQUENO) {
            mp.moldearPizzaPequena();
        } else if (tam == Tamano.MEDIANO) {
            mp.moldearPizzaMediana();
        } else {
            throw new ExcepcionParametrosInvalidos("Tamano de piza invalido:"+tam);
        }
	aplicarIngredientes(ingredientes);
        hpd.hornear();
    }

    private void aplicarIngredientes(Ingrediente[] ingredientes) {
        Logger.getLogger(PreparadorPizza.class.getName())
                .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));
        
        //CODIGO DE LLAMADO AL MICROCONTROLADOR
        
        
        
    }


}
