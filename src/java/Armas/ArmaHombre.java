package Armas;

import ejercito.CompositePersonaje;

public class ArmaHombre extends ArmasAbs implements CompositePersonaje{

    @Override
    public String Arma() {
        return "imagenes/Cimitarra.png";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Arma();
    }

}
