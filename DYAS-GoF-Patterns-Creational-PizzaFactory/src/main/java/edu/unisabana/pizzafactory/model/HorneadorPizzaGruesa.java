
package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaGruesa implements Horneador {

    @Override
    public void hornear() {
        Logger.getLogger(AmasadorPizzaGruesa.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
    
}
