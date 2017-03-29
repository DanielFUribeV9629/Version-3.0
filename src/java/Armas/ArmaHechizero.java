package Armas;

import ejercito.CompositePersonaje;

public class ArmaHechizero extends ArmasAbs implements CompositePersonaje{

    @Override
    public String Arma() {
        return "imagenes/Baculo.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Arma();
    }

}
