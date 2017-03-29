package Armas;

import ejercito.CompositePersonaje;

public class ArmaEnano extends ArmasAbs implements CompositePersonaje{

    @Override
    public String Arma() {
        return "imagenes/Hacha.png";
    }

    @Override
    public String getCaracteristicas() {
       return this.Arma();
    }


}
