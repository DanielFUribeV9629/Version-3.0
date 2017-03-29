package Armas;

import ejercito.CompositePersonaje;

public class ArmaElfo extends ArmasAbs implements CompositePersonaje{

    @Override
    public String Arma() {
        return "imagenes/Arco.png";
        
    }

    @Override
    public String getCaracteristicas() {
        return this.Arma();
    }
    
   

}
